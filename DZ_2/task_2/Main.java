package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите делимое число: ");
        double num1 = iScanner.nextInt();
        System.out.println("Введите число делитель: ");
        double num2 = iScanner.nextInt();
        iScanner.close();
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        else {
            double resultDiv = num1 / num2;
            System.out.printf("Результат деления " + (int) num1 + " на " + (int) num2 + ": " + "%.2f", resultDiv);
        }
    }
}
