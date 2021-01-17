import java.util.Objects;

public class Point implements Comparable<Point> {
    double x;
    double y;
    double rad;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.rad = coordToRad(this.x, this.y);
    }


    private double coordToRad(double x, double y) {
        double sinx = this.getX() / (Math.sqrt((Math.pow(this.getY(), 2)) + (Math.pow(this.getX(), 2))));
        return Math.asin(sinx);
    }

    public double getX() {
        return x;
    }

    public double getRad() {
        return rad;
    }

    @Override
    public int compareTo(Point compares) {
        if(this.getRad()<compares.getRad())
            return -1;
        else if(compares.getRad()<this.getRad())
            return 1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 && Double.compare(point.getY(), getY()) == 0;
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
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    public double getY() {
        return y;
    }

}
