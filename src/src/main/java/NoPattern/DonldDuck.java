package NoPattern;

public class DonldDuck extends Duck{

    public  DonldDuck(String duckType)
    {
        this.duckType = duckType;
    }

    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}


