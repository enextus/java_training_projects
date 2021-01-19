import java.util.Objects;

public class Point implements Comparable<Point> {
    private final double x;
    private final double y;
    private final double rad;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.rad = cordToRad(this.x, this.y);
    }

    private double cordToRad(double x, double y) {
        double sins = 0;
        double radian = 0;

        sins = this.getY() / Math.sqrt((Math.pow(this.getY(), 2) + (Math.pow(this.getX(), 2))));
        radian = Math.asin(sins);

        if (this.getX() < 0 && this.getY() > 0) {
            radian = radian + Math.PI / 2;
        }

        if (this.getX() < 0 && this.getY() < 0) {
            radian = radian + Math.PI;
        }

        if (this.getX() > 0 && this.getY() < 0) {
            radian = radian + Math.PI + Math.PI / 2;
        }

/*        System.out.println();
        System.out.println("X: " + this.getX() + ", Y: " + this.getY());
        System.out.println("sins: " + sins);
        System.out.println("Math.asin(sins): " + res);
        System.out.println();*/

        return radian;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRad() {
        return rad;
    }

    @Override
    public int compareTo(Point other) {
        if (this.getRad() < other.getRad())
            return -1;
        else if (other.getRad() < this.getRad())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", rad=" + rad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 && Double.compare(point.getY(), getY()) == 0 && Double.compare(point.getRad(), getRad()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getRad());
    }
}
