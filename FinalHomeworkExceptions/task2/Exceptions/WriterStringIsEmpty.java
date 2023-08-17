package task2.Exceptions;

public class WriterStringIsEmpty extends Exception {
    public WriterStringIsEmpty(String message) {
        super(message);
    }
    public WriterStringIsEmpty() {
        super();
    }
}
