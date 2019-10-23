package lesson05_oct21.figures;

public class Rectangle extends Figure{

    private Point firstPoint, secondPoint;

    public Rectangle() {
    }

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }


    @Override
    public int area() {
        int sideX = firstPoint.getX() - secondPoint.getX();
        int sideY = firstPoint.getY() - secondPoint.getY();
        return sideX * sideY;
    }
}
