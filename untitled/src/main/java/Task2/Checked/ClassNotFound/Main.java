package Task2.Checked.ClassNotFound;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("HelloWorld");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");
        }
        System.out.println("Finish!");
    }

}
