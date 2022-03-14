package homework27;

public class Box <T1>{

    private T1 size;

    public Box() {
    }

    public Box(T1 size) {
        this.size = size;
    }

    public static <T> Box createBox() {
        Box box1 = new Box(15);
        return box1;
    }
    public T1 getSize() {
        return size;
    }

    public void setSize(T1 size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }
}



