public class Main {
    public static void main(String[] args) {

        Line line1 = new Line('-', 15);
        Rectangle rectangle1 = new Rectangle('*', 9, 7);
        Rectangle rectangle2 = new Rectangle('@', 5, 11);

        Shape[] shapes = new Shape[]{line1, rectangle1};
        Shape[] shapes1 = new Shape[]{rectangle2, line1, rectangle1};

        Picture picture1 = new Picture('=', shapes);
        Picture picture2 = new Picture('=', shapes1);

        line1.draw();
        rectangle1.draw();

        picture1.drawBorder();
        picture1.draw();
        picture1.drawBorder();

        picture2.drawBorder();
        picture2.draw();
        picture2.drawBorder();
    }
}
