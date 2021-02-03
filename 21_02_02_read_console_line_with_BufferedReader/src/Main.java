import java.io.IOException;
import java.util.List;

class Main {

    public static void main(String[] args) throws IOException {

        ReadLinesFromConsole reader = new ReadLinesFromConsole();

        List<String[]> res = reader.readAndWrite();

        reader.printWriter(res);
    }

}
