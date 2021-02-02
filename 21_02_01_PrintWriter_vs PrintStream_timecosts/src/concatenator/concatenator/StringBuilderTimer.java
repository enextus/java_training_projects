package concatenator.concatenator;

import concatenator.ITimer;

public class StringBuilderTimer implements ITimer {

    @Override
    public void concatenate(String[] arrayToConcatenate) {

        StringBuilder builder = new StringBuilder();

        for (String str : arrayToConcatenate)
            builder.append(str);

        builder.toString();
    }

}
