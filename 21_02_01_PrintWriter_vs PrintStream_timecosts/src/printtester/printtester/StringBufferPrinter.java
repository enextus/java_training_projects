package printtester.printtester;

import printtester.IPrinter;

public class StringBufferPrinter implements IPrinter {

    @Override
    public void concatenate(String[] arrayToTest) {

        StringBuffer buffer = new StringBuffer();

        for (String str : arrayToTest)
            buffer.append(str);

        buffer.toString(); // anschließende Umwandlung Obj toString
    }

}
