package NoPattern;

public class simulator {
    public static void main(String[] args) {

        Duck duck = new DonldDuck("Donald");
        duck.display();
        duck.fly();
        duck.quack();

        Duck duck1 = new Duck();
        duck1.display();
        duck1.fly();
        duck1.quack();

        System.out.println("    ");


        Duck toyDuck = new ToyDuck("Toy");
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();
    }
}
