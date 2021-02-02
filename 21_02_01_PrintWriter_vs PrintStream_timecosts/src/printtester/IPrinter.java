package printtester;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * The interface provides the single method print which should provide printing two String variables
 */
public interface IPrinter {

    void print(boolean flush) throws IOException;
}
