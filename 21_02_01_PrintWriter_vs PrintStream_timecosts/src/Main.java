import timetester.ITimer;
import timetester.PrintWriterVsPrintStreamTimeCostsTest;
import timetester.timetester.StringBufferTimer;
import timetester.timetester.StringBuilderTimer;

public class Main {

    public static void main(String[] args) {

        ITimer stringBuilderConcatenator = new StringBuilderTimer();
        ITimer stringBufferConcatenator = new StringBufferTimer();

        PrintWriterVsPrintStreamTimeCostsTest test;

        //string builder test
        test = new PrintWriterVsPrintStreamTimeCostsTest(stringBuilderConcatenator);
        test.test(100000, "Santa Claus");

        //string buffer test
        test = new PrintWriterVsPrintStreamTimeCostsTest(stringBufferConcatenator);
        test.test(100000, "Santa Claus");
    }

}
