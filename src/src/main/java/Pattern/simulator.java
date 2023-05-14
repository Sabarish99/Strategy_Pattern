package Pattern;

public class simulator {
    public static void main(String[] args) {

        Duck duck = new DonaldDuck();
        duck.display();
        duck.getFlyBehaviour().fly();
        duck.getQuackBehaviour().quack();

    }
}
