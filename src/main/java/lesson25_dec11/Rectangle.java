package lesson25_dec11;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rectangle {

    private Point firstPoint, secondPoint;


    public Rectangle(Point fitstP, Point secondP) {
        this.firstPoint = fitstP;
        this.secondPoint = secondP;
    }

    public static int area(Point fitstP, Point secondP) {
        int a = fitstP.getX() - secondP.getX();
        int b = fitstP.getY() - secondP.getY();
        return Math.abs(a * b);
    }

    public static Set<Rectangle> div(Rectangle rectangle){
        int len = Math.abs(rectangle.firstPoint.getX() - rectangle.secondPoint.getX());
        int weg = Math.abs(rectangle.firstPoint.getY() - rectangle.secondPoint.getY());

        Set<Rectangle> n = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < weg; j++) {
                n.add(new Rectangle(new Point(i,j), new Point(i,j+1)));
            }
        }
        return n;
    }

    public static Rectangle rnd(){
        return new Rectangle(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)),
                new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
    }

    public static Set<Rectangle> fullArea(int n){
        return Stream.generate(Rectangle::rnd).limit(n)
                .flatMap(rectangle -> Rectangle.div(rectangle).stream())
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }
}
