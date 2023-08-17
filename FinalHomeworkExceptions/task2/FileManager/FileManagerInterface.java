package task2.FileManager;

import java.io.IOException;

import task2.Exceptions.FileIsEmpty;
import task2.Exceptions.FileIsExists;
import task2.Exceptions.FileNotFoundException;
import task2.Exceptions.WriterStringIsEmpty;

public interface FileManagerInterface {
    public void fileManagerWriter() throws WriterStringIsEmpty, IOException;

    public void fileManagerReader() throws FileNotFoundException, FileIsEmpty, IOException;

    public void fileManagerCreateCopy() throws FileIsExists;
}
