package homework17;

public class Turtle extends Animal{

    private int age;

    public Turtle() {
    }

    public Turtle(double weight, String color, int age) {
        super(weight, color);
        this.age = age;
    }

    public void swim() {
        System.out.println("Turtle is swimming");
    }

    @Override
    public void eat() {
        System.out.println("turtle is eating");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Turtle information: " +'\n'+
                "age=" + age +'\n'+
                 super.toString();
    }
}
