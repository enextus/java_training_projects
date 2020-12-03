

public class Line extends Shape {

    private final int length;

    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.length; i++)
            System.out.print(this.getSymbol());
        System.out.println();
    }
}
