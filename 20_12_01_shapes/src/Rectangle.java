public class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(char symbol, int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++)
                System.out.print(this.getSymbol());
            System.out.println();
        }
    }
}
