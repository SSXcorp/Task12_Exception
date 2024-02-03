package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IncorrectFileNameException {
        String fileName = "C:\\SpaceLab\\Task12_Exception\\untitled\\src\\main\\java\\Task3\\hello.txt";
        try (Scanner file = new Scanner(new File(fileName))) {
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        } catch (FileNotFoundException err) {
            if (fileName.equals("hello.txt")) {
                throw new IncorrectFileNameException("Incorrect filename : " + fileName , err);
            }
        }
    }
}
