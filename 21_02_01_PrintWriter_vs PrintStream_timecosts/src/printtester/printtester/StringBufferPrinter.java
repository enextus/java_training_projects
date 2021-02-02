package printtester.printtester;

import printtester.IPrinter;

public class StringBufferPrinter implements IPrinter {

    @Override
    public void print(String[] arrayToPrint) {

        StringBuffer buffer = new StringBuffer();

        for (String str : arrayToPrint)
            buffer.append(str);

        buffer.toString(); // anschließende Umwandlung Obj toString
    }

}
