package ua.ithilell.hw7;

/*



 */

public class HomeWorkMain {

    public static void main(String[] args) {

        try {

            ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

            int sumOfElements = arrayValueCalculator.doCalc(new String[][]{
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11F", "12"},
                    {"13", "14", "15"}
            });

            System.out.println(sumOfElements);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }

}
