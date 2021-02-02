package printtester.printtester;

import printtester.IPrinter;

public class StringBuilderPrinter implements IPrinter {

    @Override
    public void print(String[] arrayToTest) {

        StringBuilder builder = new StringBuilder();

        for (String str : arrayToTest)
            builder.append(str);

        builder.toString();
    }

}
