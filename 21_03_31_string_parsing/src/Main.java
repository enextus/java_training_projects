public class Main {

    public static void main(String[] args) {

        String string = "This is     different type   of file.";
        String stringArray_1[] = string.split("[ ]+");

        for (int i = 0; i < stringArray_1.length; i++) {
            System.out.println(stringArray_1[i]);
        }

        System.out.println("\n");

        String spliter="\\s+";
        String[] stringArray_2;
        stringArray_2=string.split(spliter);

        for (int i = 0; i < stringArray_2.length; i++) {
            System.out.println(stringArray_2[i]);
        }
    }

}
