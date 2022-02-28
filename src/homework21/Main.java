package homework21;

import java.nio.charset.IllegalCharsetNameException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static homework21.Kyndor.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кунду жазыныз: ");
        boolean stop = false;
        while (stop == false) {
            Kyndor kyn = null;
            try {
                kyn = Kyndor.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
                switch (kyn) {
                    case ДУЙШОМБУ -> System.out.println("Жава");
                    case ШАРШЕМБИ -> System.out.println("Англис тили");
                    case ШЕЙШЕМБИ -> System.out.println("Жава практика");
                    case БЕЙШЕМБИ -> System.out.println("Soft skill");
                    case ЖУМА -> System.out.println("Жава теория");
                    case ИШЕНБИ -> System.out.println("Сабак жок");
                    case ЖЕКШЕМБИ -> {
                        stop = true;
                        kyn.close();
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Сиз туура эмес жаздыныз ");
                System.out.println("Кунду жазыныз: ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
