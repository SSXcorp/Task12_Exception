package Task2.Unchecked.IllegalArgument;

public class Main  {
    public static void main(String[] args) throws IllegalArgumentException{
        try {
            int a = Integer.parseInt("AVD");
        }catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException found!");
        }

        System.out.println("Finish!");
    }
}
