package task2.FileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import task2.Exceptions.FileIsEmpty;
import task2.Exceptions.FileIsExists;
import task2.Exceptions.FileNotFoundException;
import task2.Exceptions.WriterStringIsEmpty;

public class FileManager implements FileManagerInterface {

    private String filename;
    private String filePath = "FinalHomeworkExceptions\\task2\\Files\\";

    public FileManager(String filename) {
        this.filename = filename;
    }

    public void fileManagerWriter() throws WriterStringIsEmpty, IOException {
        File myfile = new File(filePath + filename);
        FileWriter writer = new FileWriter(myfile, true);
        String text = getText();
        if (text.length() == 0) {
            writer.close();
            throw new WriterStringIsEmpty("Ошибка записи в файл. Пустая строка.");
        } else {
            writer.write(text + "\n");
            System.out.println("Запись выполнена успешно");
        }
        writer.close();
    }

    public void fileManagerReader() throws FileNotFoundException, FileIsEmpty, IOException {
        File myfile = new File(filePath + filename);
        if (myfile.exists() && !myfile.isDirectory()) {
            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                
                System.out.println(line);
            }
            if (isFileEmpty(myfile)) {
                bufferedReader.close();
                throw new FileIsEmpty("Ошибка чтения файла. Файл пуст");
            }
            bufferedReader.close();
        } else {
            throw new FileNotFoundException("Файл " + filename + " не найден");
        }
    }

    public void fileManagerCreateCopy() throws FileIsExists {
        File myfile = new File(filePath + filename);
        File myfile_copy = new File(filePath + "\\copy_" + filename);
        if (myfile_copy.exists()) {
            throw new FileIsExists("Такой файл уже существует");
        }
        try (
                FileReader reader = new FileReader(myfile);
                FileWriter writer = new FileWriter(myfile_copy)) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
            System.out.println("Копирование файла успешно завершено");
        } catch (IOException e) {
            System.out.println("Ошибка копирования файла");
            e.printStackTrace();
        }
    }

    private boolean isFileEmpty(File file) {
        return file.length() == 0;
    }

    private String getText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ibm866"));
        System.out.print("Введите текст для записи в файл: ");
        String text = reader.readLine();
        return text;
    }
}
