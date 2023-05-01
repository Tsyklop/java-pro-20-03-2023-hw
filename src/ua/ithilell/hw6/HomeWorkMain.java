package ua.ithilell.hw6;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkMain {

    public static void main(String[] args) {

        /*String palinrome = "madam";

        for (int i = 0; i < (palinrome.length() / 2); i++) {
            if (palinrome.charAt(i) != palinrome.charAt(palinrome.length() - i)) {
                System.out.println("Not a palindrome");
                break;
            }
        }*/

        Random random = new Random();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String word = words[random.nextInt(words.length)];

        StringBuilder hiddenWord = new StringBuilder("#".repeat(15));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String suggest = scanner.nextLine();

            if (word.equals(suggest)) {
                System.out.println("Win!");
                break;
            }

            for (int i = 0; i < Math.min(word.length(), suggest.length()); i++) {
                if (word.charAt(i) == suggest.charAt(i)) {
                    hiddenWord.setCharAt(i, suggest.charAt(i));
                }
            }

            if (hiddenWord.substring(0, hiddenWord.indexOf("#")).equals(word)) {
                System.out.println("Win 50/50!");
                break;
            }

            System.out.println(hiddenWord.toString());

        }

    }

    public static int findSymbolOccurance(String str, char symbol) {
        int occurance = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                occurance++;
            }
        }
        return occurance;
    }

    public static int findWordPosition(String source, String target) {

        boolean targetStarted = false;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target.charAt(i)) {
                targetStarted = true;
                continue;
            } else {
                targetStarted = false;
            }
        }

        return source.indexOf(target);
    }



}
