package lesson04_oct18.interfaces;

public class InterfaceApp {
    public static void main(String[] args) {
        Human h = new Human();
        Tesla t = new Tesla();
        Ford f = new Ford();

        h.think();

        t.drive();
        t.think();
        f.drive();
    }
}
