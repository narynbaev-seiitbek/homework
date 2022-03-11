package homework24;

import java.util.*;
import java.util.List;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {


        Integer[] array = new Integer[10];
        List<Integer> arrayList = new ArrayList();
        LinkedList<Integer> linkedList = new LinkedList<>();

        generateRandomNumbers(array, arrayList, linkedList);

        System.out.print("Elementary of Array: ");
        printElementaryOfArray(array);
        System.out.println();
        System.out.println("Elements of ArrayList: " + arrayList);
        System.out.println("Elements of LinkedList: " + linkedList);
        System.out.println();
        Integer[] sortedArray = sortNumbers(array);
        List<Integer> sortedArrayList = sortNumbers(arrayList);
        LinkedList<Integer> sortedLinkedList = sortNumbers(linkedList);
        System.out.print("Sorted numbers of Array: ");
        printElementaryOfArray(sortedArray);
        System.out.println();
        System.out.println("Sorted numbers of ArrayList: "+sortedArrayList);
        System.out.println("Sorted numbers of LinkedList: "+sortedLinkedList);

    }

    private static void printElementaryOfArray(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer+", ");
        }
    }

    private static LinkedList<Integer> sortNumbers(LinkedList<Integer> linkedList) {
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return linkedList;
    }

    private static List<Integer> sortNumbers(List<Integer> arrayList) {
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return arrayList;
    }

    private static Integer[] sortNumbers(Integer[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    private static void generateRandomNumbers(Integer[] array, List<Integer> arrayList, List<Integer> linkedList) {
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(0, 2);
            arrayList.add(random.nextInt(0, 2));
            linkedList.add(random.nextInt(0, 2));
        }
    }

}
