package lesson05_oct21.figures;

public class Triangle extends Figure{

    private Point firstPoint, secondPoint, thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public Triangle() {
    }

    @Override
    public int area() {
        int x1 = firstPoint.getX() - thirdPoint.getX();
        int y1 = firstPoint.getY() - thirdPoint.getY();
        int x2 = secondPoint.getX() - thirdPoint.getX();
        int y2 = secondPoint.getY() - thirdPoint.getY();

        return 0;
    }
}
