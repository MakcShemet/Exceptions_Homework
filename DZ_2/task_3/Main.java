package task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws DivisionByZeroException, NumberOutOfRangeException, NumberSumException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = iScanner.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = iScanner.nextInt();
        iScanner.close();
        if (num1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапозона");
        }
        if (num2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if ((num1 + num2) < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (num3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println("Проверка пройдена успешно");
        }

    }
}
