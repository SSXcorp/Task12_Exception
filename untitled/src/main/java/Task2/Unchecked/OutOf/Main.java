package Task2.Unchecked.OutOf;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            int[] a = {1,2,3};
            a[4] = 123;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException!");
        }

        System.out.println("Finish!");
    }
}
