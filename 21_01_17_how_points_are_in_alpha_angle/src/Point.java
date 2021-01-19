import java.util.Objects;

public class Point implements Comparable<Point> {

    private final double x;
    private final double y;
    private final double rad;
    private static int numberOfInstances;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.rad = cordToRad(this.x, this.y);
        numberOfInstances++;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    private double cordToRad(double x, double y) {
        double sina = 0;
        double rad = 0;

        sina = this.getY() / Math.sqrt(Math.pow(this.getY(), 2) + (Math.pow(this.getX(), 2)));
        rad = Math.asin(sina);

        if (this.getX() < 0 && this.getY() > 0) {
            rad = rad + Math.PI / 2;
        }

        if (this.getX() <= 0 && this.getY() <= 0) {
            rad = Math.PI - rad;
        }

        if (this.getX() > 0 && this.getY() < 0) {
            rad = Math.PI + (Math.PI / 2) - rad;
        }

        return rad;
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
