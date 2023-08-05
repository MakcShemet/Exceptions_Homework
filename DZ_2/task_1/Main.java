package task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        if (num > 0) {
            System.out.println("Число корректно");
        } else {
            throw new InvalidNumberException("Некорректное число");
        }

    }

}

