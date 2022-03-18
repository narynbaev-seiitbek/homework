package homework29;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        //Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.

        int[] integers = {2, 5, 8, 7, 2, 9, 11, 54, 89, 55, 14, 22, 4, 66, 77};
        stream(integers).filter(k -> k % 2 == 0).map(x -> x * x).max().ifPresent(System.out::println);

    }
}

