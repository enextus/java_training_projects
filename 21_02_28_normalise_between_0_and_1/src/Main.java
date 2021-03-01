public class Main {

    public static void main(String[] args) {
        // normalise

        NormUtil normUtil = new NormUtil(150.23, -10.12, 1.45, 0.01);

        System.out.println(normUtil);

        System.out.println(normUtil.normalize(-5.12));
    }

}
