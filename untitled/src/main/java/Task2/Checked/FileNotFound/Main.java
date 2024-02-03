package Task2.Checked.FileNotFound;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            ExceptionTest.doSomethingMethod();
            System.out.println("---------------------------------");
        } catch (FileNotFoundException exception) {
            System.out.println("Exception handled!");
        } finally {
            System.out.println("End!");
        }

//        File file = new File("not_existing_file.txt");
//        FileInputStream stream = new FileInputStream(file);

       System.out.println("Finish!");
    }

}
