package NoPattern;

public class Duck {
    String duckType = "parent Duck";

    public void quack() {
        System.out.println("Quack Quack");
    }
    public void fly()
    {
        System.out.println("I can fly");
    }
    public void display()
    {
        System.out.println("I am duck of type "+ duckType);
    }
}
