package homework28;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        System.out.println(sqrt.apply(15.5));
    }
    static UnaryOperator<Double> sqrt = Math::sqrt;

}
