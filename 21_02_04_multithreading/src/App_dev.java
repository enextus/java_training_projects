public class App_dev {

    public static void main(String[] args) {

        CharThread hath = new CharThread(1, '#');

        System.out.println(hath.times);
        System.out.println(hath.ch);
        System.out.println(hath.getCommonNumber());
        System.out.println();

        CharThread hath2 = new CharThread(1, '*');

        System.out.println(hath2.times);
        System.out.println(hath2.ch);
        System.out.println(hath2.getCommonNumber());
        System.out.println();

        CharThread hath3 = new CharThread(1, '=');

        System.out.println(hath3.times);
        System.out.println(hath3.ch);
        System.out.println(hath3.getCommonNumber());
        System.out.println();

    }

}
