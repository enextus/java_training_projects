public class Picture extends Shape {

    private final Shape[] shapes;
    private final int borderLength;
    private final Line borderLine;

    public Picture(char symbol, Shape[] shapes) {
        super(symbol);
        this.shapes = shapes;
        this.borderLength = 30;
        this.borderLine = new Line(symbol, borderLength);
    }

    @Override
    public void draw() {

        this.borderLine.draw();

        for (Shape elem : this.shapes)
            elem.draw();
    }
}
