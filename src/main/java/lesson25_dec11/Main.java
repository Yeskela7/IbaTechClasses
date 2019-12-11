package lesson25_dec11;

public class Main {

    public static void main(String[] args) {
        Point a= new Point(1,4);
        Point b = new Point(2,1);
        Rectangle r = new Rectangle(a,b);

        System.out.println(Rectangle.fullArea(5).size());
    }
}
