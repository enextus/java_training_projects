public class Main {
    public static void main(String[] args) {

        Line line1 = new Line('-', 15);
        Rectangle rectangle1 = new Rectangle('*', 9, 7);

        Shape[] shapes = new Shape[]{line1, rectangle1};
        Picture picture1 = new Picture('=', shapes);

        // line1.draw();
        // rectangle1.draw();

        picture1.draw();
    }
}
