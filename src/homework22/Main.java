package homework22;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("Alphabets.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
             for (int i = 0; i < 26; ++i) {
            printWriter.append((char) ('A' + i));
            printWriter.append((char) ('a' + i)+"\n");
        }
        for (int i = 0; i <=9; i++) {
            printWriter.println(i);
        }
    } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

         int counter = 0;
        try (FileReader reader = new FileReader("Alphabets.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                counter++;
                System.out.println(counter+": "+scanner.nextLine());
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
