public class Picture extends Shape {

    private final Shape[] shapes;
    private final int borderLength;

    public Picture(char symbol, Shape[] shapes) {
        super(symbol);
        this.shapes = shapes;
        this.borderLength = 30;
    }

    void drawBorder() {
        for (int i = 1; i < this.borderLength; i++)
            System.out.print(this.symbol);
        System.out.println();
    }

    @Override
    public void draw() {
        for (Shape elem : this.shapes)
            elem.draw();
    }
}
