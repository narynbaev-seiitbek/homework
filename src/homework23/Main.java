package homework23;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numbers:");
        ArrayList<Integer> numbers = getIntegers();
        System.out.println(numbers);

        System.out.println("Even numbers:");
        ArrayList<Integer> evenNumbers = getEvenNumbers(numbers);
        System.out.println(evenNumbers);

        System.out.println("Odd numbers");
        ArrayList<Integer> oddNumbers =getOddNumbers(numbers);
        System.out.println(oddNumbers);
    }

    private static ArrayList<Integer> getIntegers() {
        ArrayList<Integer> newArrayList= new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            newArrayList.add(random.nextInt(1,100));
        }
        return newArrayList;
    }

    private static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2==0) {
                newArrayList.add(numbers.get(i));
            }
        }
        return newArrayList;
    }

    private static ArrayList<Integer> getOddNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2!=0) {
                newArrayList.add(numbers.get(i));
            }
        }
        return newArrayList;
    }
}
