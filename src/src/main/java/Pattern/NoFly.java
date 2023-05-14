package Pattern;

public class NoFly implements FlyBehaviour{
    @Override
        public void fly() {
        System.out.println("Sorry I don't fly");
        }
}
