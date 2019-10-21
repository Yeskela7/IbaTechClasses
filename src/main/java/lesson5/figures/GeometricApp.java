package lesson5.figures;

import java.util.ArrayList;
import java.util.Arrays;

public class GeometricApp {
    public static void main(String[] args) {
        new Square(new Point(1,1), new Point(2,2));
//step one
        ArrayList<Figure> figures = new ArrayList<Figure>();
        for(int i = 0; i < 3; i++){
            figures.add(new Circle());
        }
        for(int i = 0; i < 3; i++){
            figures.add(new Square());
        }
        for(int i = 0; i < 3; i++){
            figures.add(new Triangle());
        }
        for(int i = 0; i < 3; i++){
            figures.add(new Rectangle());
        }
        int total = 0;
        for(Figure f: figures)


    }
}
