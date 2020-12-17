public class Main {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();


        String res = "";
        System.out.println("1. now: " + now);
        for (int i = 0; i < 1000; i++){
            res+= "ABCDE";
        }
        System.out.println("2. now: " + now);
    }
}
