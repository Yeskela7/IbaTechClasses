package lesson5.figures;

public class Square extends Figure{

    private Point firstPoint, secondPoint;

    public Square() {
    }

    public Square(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }


    @Override
    public int area() {
        int side = firstPoint.getX() - secondPoint.getX();
        return side * side;
    }
}
