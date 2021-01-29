import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    final static String FILE_NAME = "/home/enextus/IdeaProjects/java_training_projects/21_01_29_read_from_file/src/input.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(FILE_NAME);
        byte[] bytes = new byte[inputStream.available()];

        int num = inputStream.read(bytes);
        String res = new String(bytes);

        System.out.println(res);
        System.out.println(Arrays.toString(bytes));
        System.out.println(num);

    }

}
