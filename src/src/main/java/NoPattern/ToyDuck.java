package NoPattern;

public class ToyDuck extends Duck{

    public ToyDuck(String type)
    {
        this.duckType = type;
    }

 //   @Override
//    public void fly() {
//        System.out.println("I don't fly you moron");
//    }

    @Override
    public void quack() {
        System.out.println("I just sweak!!! can't quack quack");
    }
}
