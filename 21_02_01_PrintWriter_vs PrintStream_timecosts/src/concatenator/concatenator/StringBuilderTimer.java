package concatenator.concatenator;

import concatenator.ITimer;

public class StringBuilderTimer implements ITimer {

    @Override
    public void concatenate(String[] arrayToTest) {

        StringBuilder builder = new StringBuilder();

        for (String str : arrayToTest)
            builder.append(str);

        builder.toString();
    }

}
