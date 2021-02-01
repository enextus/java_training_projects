import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    // final static String dir = System.getProperty("user.dir");
    // final static String FILE_NAME = "input.txt";
    final static String FILE_NAME = "warandpeace_copy.txt";

    public static void main(String[] args) throws IOException {
        //System.out.println("Current dir: " + dir);

        FileInputStream inputStream = new FileInputStream(FILE_NAME);
        byte[] bytes = new byte[inputStream.available()];

        int num = inputStream.read(bytes);
        String res = new String(bytes);

        System.out.println(res);
        System.out.println(Arrays.toString(bytes));
        System.out.println(num);

    }

}
