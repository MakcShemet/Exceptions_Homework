package task2.Exceptions;

public class FileIsEmpty extends Exception {
    public FileIsEmpty(String message) {
        super(message);
    }

    public FileIsEmpty() {
        super();
    }
}
