package Pattern;

public class DonaldDuck extends Duck{

    public DonaldDuck()
    {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    void display() {
        System.out.println("I am donald Duck");
    }

}
