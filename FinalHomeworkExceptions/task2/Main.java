package task2;

import java.io.IOException;
import java.util.Scanner;

import task2.Exceptions.FileIsEmpty;
import task2.Exceptions.FileIsExists;
import task2.Exceptions.FileNotFoundException;
import task2.Exceptions.WriterStringIsEmpty;
import task2.FileManager.FileManager;
import task2.Menu.Menu;

public class Main {
    public static void main(String[] args)
            throws FileNotFoundException, WriterStringIsEmpty, FileIsEmpty, FileIsExists, IOException {

        Menu menu = new Menu();

            menu.getMenu();
        
    }
}
