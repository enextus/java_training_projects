public class Main {

    /**
     * Get the current line number.
     *
     * @return int - Current line number.
     */
    public static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static void main(String[] args) {

        Line line1 = new Line('-', 15);
        Rectangle rectangle1 = new Rectangle('*', 9, 7);
        Rectangle rectangle2 = new Rectangle('@', 5, 11);

        Shape[] shapes = new Shape[]{line1, rectangle1};
        Shape[] shapes1 = new Shape[]{rectangle2, line1, rectangle1};

        Picture picture1 = new Picture('=', shapes);
        Picture picture2 = new Picture('=', shapes1);

        System.out.print(getLineNumber() + " ");
        line1.draw();

        System.out.print(getLineNumber() + " ");
        System.out.println(line1.getSymbol());
        System.out.println();
        //rectangle1.draw();

/*        picture1.drawBorder();
        picture1.draw();
        picture1.drawBorder();

        picture2.drawBorder();
        picture2.draw();
        picture2.drawBorder();*/
    }
}
