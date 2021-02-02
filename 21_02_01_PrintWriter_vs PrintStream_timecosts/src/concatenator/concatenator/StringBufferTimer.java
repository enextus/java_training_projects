package concatenator.concatenator;

import concatenator.ITimer;

public class StringBufferTimer implements ITimer {

    @Override
    public void concatenate(String[] arrayToConcatenate) {

        StringBuffer buffer = new StringBuffer();

        for (String str : arrayToConcatenate)
            buffer.append(str);

        buffer.toString(); // anschließende Umwandlung Obj toString
    }

}
