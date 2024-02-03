package Task2.Unchecked.NullPointer;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String s = null;

        try {
            byte[] length = s.getBytes(StandardCharsets.UTF_8);
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
