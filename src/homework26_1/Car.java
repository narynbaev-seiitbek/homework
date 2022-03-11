package homework26_1;

public class Car {

    private long id;
    private String number;

    public Car() {
    }

    public Car(long id, String number) {
        this.id = id;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car [" +
                "id=" + id +
                ", number='" + number + '\'' +
                ']';
    }
}
