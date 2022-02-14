package homework17;

public class Animal {

    private double weight;
    private String color;

    public Animal() {
    }

    public Animal(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return
                "weight: " + weight + '\n' +
                        "color: " + color + '\n';

    }
}
