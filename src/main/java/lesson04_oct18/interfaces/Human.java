package lesson04_oct18.interfaces;

public class Human implements Thinkable {

    @Override
    public void think() {
        System.out.println("I'm human and I can think");
    }
}
