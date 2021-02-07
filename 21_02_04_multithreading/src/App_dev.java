public class App_dev {

    public static void main(String[] args) {

        CharThread chth = new CharThread(1, '*');
        CharThread chth1 = new CharThread(1, '*');
        CharThread chth2 = new CharThread(1, '*');
        CharThread chth3 = new CharThread(1, '*');
        CharThread chth4 = new CharThread(1, '*');

        System.out.println(chth.times);
        System.out.println(chth.ch);
        System.out.println(chth.commonNumber);

        System.out.println(chth1.times);
        System.out.println(chth1.ch);
        System.out.println(chth1.commonNumber);

        System.out.println(chth2.times);
        System.out.println(chth2.ch);
        System.out.println(chth2.commonNumber);

        System.out.println(chth3.times);
        System.out.println(chth3.ch);
        System.out.println(chth3.commonNumber);

        System.out.println(chth4.times);
        System.out.println(chth4.ch);
        System.out.println(chth4.commonNumber);

    }

}
