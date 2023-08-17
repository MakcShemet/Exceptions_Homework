package task2.Exceptions;

public class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }

    public FileNotFoundException() {
        super();
    }
}
