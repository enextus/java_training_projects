public class Picture extends Shape {

    private final Shape[] shapes;

    public Picture(char symbol, Shape[] shapes) {
        super(symbol);
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        for (Shape elem : this.shapes)
            elem.draw();
    }
}
