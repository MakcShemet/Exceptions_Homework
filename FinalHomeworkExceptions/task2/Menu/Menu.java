package task2.Menu;

import java.util.Scanner;

import task2.FileManager.FileManager;

public class Menu {

    public Menu() {

    }

    boolean flag = true;

    public void getMenu() {

        String menu = "\nВыберите необходимый пункт меню: \n1 - чтение файла;\n2 - запись в файл;\n3 - копирование файла;\n0 - выход из программы";

        try (Scanner iScanner = new Scanner(System.in)) {
            while (flag) {
                System.out.println(menu);
                System.out.println();
                String input = iScanner.nextLine();
                switch (input) {
                    case "1":
                        System.out.print("Введите имя файла для чтения: ");
                        String filename = iScanner.nextLine();
                        FileManager fileManager = new FileManager(filename);
                        fileManager.fileManagerReader();
                        break;
                    case "2":
                        System.out.print("Введите имя файла для записи: ");
                        filename = iScanner.nextLine();
                        fileManager = new FileManager(filename);
                        fileManager.fileManagerWriter();
                        break;
                    case "3":
                        System.out.print("Введите имя файла для копирования: ");
                        filename = iScanner.nextLine();
                        fileManager = new FileManager(filename);
                        fileManager.fileManagerCreateCopy();
                        break;
                    case "0":
                        System.out.println("Выполнение программы завершено");
                        flag = false;
                        break;
                    default:
                        System.out.println("Введите корректный пункт меню");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
