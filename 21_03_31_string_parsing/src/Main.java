public class Main {

    public static void main(String[] args) {
        String s = "This is     different type   of file.";
        String s1[] = s.split("[ ]+");

        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }



        String spliter="\\s+";
        String[] temp;
        temp=s.split(spliter);


        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

    }

}
