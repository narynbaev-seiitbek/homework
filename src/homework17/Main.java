package homework17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animal shark = new Shark(850, "White", true);
        Animal eagle = new Eagle(7, "Grey", 250);
        Animal turtle = new Turtle(35, "Brown", 85);

        Animal[] animals = {turtle, eagle, shark};

        for (Animal s : animals) {
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("homework17.Shark")) {
                ((Shark) s).attack();
            }

            if (s instanceof Turtle) {
                ((Turtle) s).swim();
            }
            if (s.getClass().getName().equals("homework17.Turtle")) {
                ((Turtle) s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle) s).fly();
            }
            if (s.getClass().getName().equals("homework17.Eagle")) {
                ((Eagle) s).fly();
            }
            System.out.println();
        }
        Animal[] reptile = {animals[0]};
        Animal[] fish = {animals[1]};
        Animal[] bird = {animals[2]};

        System.out.println(turtle.toString() +'\n'+shark+'\n'+eagle);

    }

}
