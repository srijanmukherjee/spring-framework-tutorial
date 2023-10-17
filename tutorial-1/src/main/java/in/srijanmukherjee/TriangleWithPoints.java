package in.srijanmukherjee;

public class TriangleWithPoints {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public TriangleWithPoints(Point a, Point b, Point c) {
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
    }

    public void draw() {
        System.out.println("Triangle draw at points " + getPointA() + ", " + getPointB() + ", " + getPointC());
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
}
