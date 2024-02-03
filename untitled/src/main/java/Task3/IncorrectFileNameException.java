package Task3;

public class IncorrectFileNameException extends Exception {

    public IncorrectFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}
