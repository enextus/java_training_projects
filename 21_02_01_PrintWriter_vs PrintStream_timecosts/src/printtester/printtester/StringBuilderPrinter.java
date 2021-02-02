package printtester.printtester;

import printtester.IPrinter;

public class StringBuilderPrinter implements IPrinter {

    @Override
    public void print(String[] arrayToPrint) {

        StringBuilder builder = new StringBuilder();

        for (String str : arrayToPrint)
            builder.append(str);

        builder.toString();
    }

}
