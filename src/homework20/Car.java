package homework20;

import java.time.LocalDate;

public class Car implements AutoCloseable {

    private String model;
    private LocalDate madeDate;

    public Car() {
    }

    public Car(String model, LocalDate madeDate) {
        this.model = model;

        try {
            if (madeDate.isAfter(LocalDate.now())) {
                throw new InvalidDateException(model + " has invalid date [" + madeDate + "]");
            } else {
                this.madeDate = madeDate;
            }
        } catch (InvalidDateException e) {
            System.err.println(e.getMessage());
        }
    }

    public void drive() {
        System.out.println("Car is going");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Car is closing");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(LocalDate madeDate) {
        this.madeDate = madeDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", madeDate=" + madeDate +
                '}';
    }
}
