package homework20;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        try (Car car = new Car("Honda", LocalDate.of(2023, 05, 14))) {
            car.drive();
        }
    }
}
