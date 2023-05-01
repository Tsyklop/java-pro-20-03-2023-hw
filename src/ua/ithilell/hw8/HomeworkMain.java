package ua.ithilell.hw8;

import ua.ithilell.hw8.zero.Circle;
import ua.ithilell.hw8.zero.Figure;
import ua.ithilell.hw8.zero.Square;
import ua.ithilell.hw8.zero.Triangle;

public class HomeworkMain {

    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
                new Square(50),
                new Circle(75),
                new Triangle(14, 56, 64)
        };

        System.out.println(figuresAreaSum(figures));

        Obstacle[] obstacles = new Obstacle[]{
                new Wall(1),
                new RunningTrack(4),
                new Wall(7),
                new RunningTrack(8),
        };

        Participant[] participants = new Participant[]{
                new Cat(),
                new Human(),
                new Robot(),
        };

        for (int i = 0; i < participants.length; i++) {

            Participant participant = participants[i];

            boolean passed = true;
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j].overcome(participant)) {
                    System.out.println("Participant pass " + obstacles[j].getClass().getSimpleName());
                } else {
                    System.out.println("Participant do not pass " + obstacles[j].getClass().getSimpleName());
                    passed = false;
                    break;
                }
            }

            if (passed) {
                System.out.println("GOOD");
            } else {
                System.out.println("NEXT TIME");
            }

        }


    }

    public static int figuresAreaSum(Figure[] figures) {
        int sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].area();
        }
        return sum;
    }

}
