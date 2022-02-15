package homework17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Animal shark = new Shark(850, "White", true);
        Animal eagle = new Eagle(7, "Grey", 250);
        Animal turtle = new Turtle(35, "Brown", 85);
        Animal turtle2 = new Turtle(25, "White-Brown", 45);

        Animal[] animals = {turtle, eagle, shark, turtle2};

        //this is your code!!

//        for (Animal s : animals) {
//            if (s instanceof Shark) {
//                ((Shark) s).attack();
//            }
//            if (s.getClass().getName().equals("homework17.Shark")) {
//                ((Shark) s).attack();
//            }
//
//            if (s instanceof Turtle) {
//                ((Turtle) s).swim();
//            }
//            if (s.getClass().getName().equals("homework17.Turtle")) {
//                ((Turtle) s).swim();
//            }
//            if (s instanceof Eagle) {
//                ((Eagle) s).fly();
//            }
//            if (s.getClass().getName().equals("homework17.Eagle")) {
//                ((Eagle) s).fly();
//            }
//            System.out.println();
//        }
//        Animal[] reptile = {turtle};
//        Animal[] fish = {shark};
//        Animal[] bird = {eagle};
//
//        my code
        AnimalArray arrayForSharks = new AnimalArray();
        AnimalArray arrayForTurtles = new AnimalArray();
        AnimalArray arrayForEagles = new AnimalArray();

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
                arrayForSharks.add(shark);
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
                arrayForTurtles.add(turtle);
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
                arrayForEagles.add(eagle);
            } else {
                System.out.println("I don't know this animal");
            }
        }

        System.out.println("all sharks");
        for (Animal allAnimal : arrayForSharks.getAllAnimals()) {
            System.out.println(allAnimal);
        }

        System.out.println("all turtles");
        for (Animal allAnimal : arrayForTurtles.getAllAnimals()) {
            System.out.println(allAnimal);
        }

        System.out.println("all eagles");
        for (Animal allAnimal : arrayForEagles.getAllAnimals()) {
            System.out.println(allAnimal);
        }


        test(eagle);
        test(shark);
        test(turtle);
    }

    // this method is superlative!!!
    public static void test(Animal animal) {
        animal.eat();
    }

//    creating own array

    //    This is static class/
    static class AnimalArray {
        private Animal[] animals;

        public void add(Animal animal) {
            if (animals == null) {
                this.animals = new Animal[]{animal};
            } else {
                //creating new Animal array
                Animal[] newAnimals0 = new Animal[animals.length + 1];
                Animal[] newAnimals = copyArray(newAnimals0, this.animals);
                newAnimals[newAnimals.length - 1] = animal;
                this.animals = newAnimals;
            }
        }

        public Animal[] getAllAnimals() {
            return this.animals;
        }

        public void deleteAnimalByIndex(int index) {
            for (int i = 0; i < this.animals.length; i++) {
                if (i == index) {
                    animals[i] = null;
                }
            }

            Animal[] newArray = new Animal[animals.length - 1];
            this.animals = copyNewArray(newArray, this.animals);

        }

        private static Animal[] copyArray(Animal[] newArray, Animal[] currentArray) {
            for (int i = 0; i < currentArray.length; i++) {
                newArray[i] = currentArray[i];
            }
            return newArray;
        }

        private static Animal[] copyNewArray(Animal[] newArray, Animal[] currentArray) {
            for (int i = 0, indexForCurrentArray = 0; i < newArray.length; i++, indexForCurrentArray++) {
               if (currentArray[indexForCurrentArray] == null) {
                   indexForCurrentArray++;
               }
               newArray[i] = currentArray[indexForCurrentArray];
            }
            return newArray;
        }
    }
}
