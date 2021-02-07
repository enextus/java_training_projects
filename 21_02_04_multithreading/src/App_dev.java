public class App_dev {

    public static void main(String[] args) {

        CharThread chth = new CharThread(1, '*');

        System.out.println(chth.times);
        System.out.println(chth.ch);
        System.out.println(chth.commonNumber);
    }

}
