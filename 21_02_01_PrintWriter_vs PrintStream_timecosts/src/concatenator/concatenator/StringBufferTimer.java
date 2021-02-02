package concatenator.concatenator;

import concatenator.ITimer;

public class StringBufferTimer implements ITimer {

    @Override
    public void concatenate(String[] arrayToTest) {

        StringBuffer buffer = new StringBuffer();

        for (String str : arrayToTest)
            buffer.append(str);

        buffer.toString(); // anschließende Umwandlung Obj toString
    }

}
