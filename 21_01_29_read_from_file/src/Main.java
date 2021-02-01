import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    // final static String dir = System.getProperty("user.dir");
    // final static String FILE_NAME = "input.txt";
    final static String FILE_NAME = "warandpeace_copy.txt";

    public static void main(String[] args) throws IOException {

        // System.out.println("Current dir: " + dir);

        System.out.println("________________________________\n");
        System.out.println("FILE_NAME: " + FILE_NAME);
        System.out.println("________________________________\n");

        FileInputStream inputStream = new FileInputStream(FILE_NAME);
        byte[] bytesArray = new byte[inputStream.available()];

        System.out.println("bytesArray.length: " + bytesArray.length);

        int num = inputStream.read(bytesArray);

        String res = new String(bytesArray);

        System.out.println("________________________________\n");

        // System.out.println(res);

        // System.out.println(Arrays.toString(bytes));
        // System.out.println(num);

    }

}
