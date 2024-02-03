package Task2.Checked.FileNotFound;

import java.io.FileNotFoundException;

public class ExceptionTest {

    public static void doSomethingMethod() throws FileNotFoundException {
        System.out.println("Something went wrong!");
        throw new  FileNotFoundException("Exception : FileNotFoundException!");
    }
}
