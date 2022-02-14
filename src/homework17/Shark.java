package homework17;

public class Shark extends Animal{

    private boolean predator;

    public Shark() {

    }

    public Shark(double weight, String color, boolean predator) {
        super(weight, color);
        this.predator = predator;
    }

    public void attack() {
        System.out.println("Shark is attacking");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    @Override
    public String toString() {
        return "Shark: " +'\n'+
                "predator: " + predator +'\n'+
                 super.toString();
    }
}
