package task2.Exceptions;

public class FileIsExists extends Exception {
    public FileIsExists(String message) {
        super(message);
    }

    public FileIsExists() {
        super();
    }
}
