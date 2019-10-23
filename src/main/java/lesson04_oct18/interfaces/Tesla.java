package lesson04_oct18.interfaces;

public class Tesla implements Thinkable, Drivable {
    @Override
    public void drive() {
        System.out.println("It's Tesla. It can drive");
    }

    @Override
    public void think() {
        System.out.println("It's Tesla. It can think");

    }
}
