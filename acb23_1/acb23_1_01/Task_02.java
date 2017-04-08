package acb23_1_01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class Task_02 {
    public static void main(String[] args) {

        double a = 0, b = 0, c = 0.0, min = 0, max = 0;

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input a:");
            a = input.nextDouble();
            min = max = a;

            System.out.println("Input b:");
            b = input.nextDouble();
            if (b < min) {
                min = b;
            } else max = b;

            System.out.println("Input c:");
            if (b < min) {
                min = b;
            } else max = b;

            c = input.nextDouble();
            if (c < min) {
                min = c;
            } else max = c;

        } catch (InputMismatchException e2) {
            System.out.println("Wrong input.");
        }

        System.out.printf("a=%.2f, b=%.2f, c=%.2f", a, b, c);
        System.out.println();
        System.out.printf("min=%.2f, max=%.2f", min, max);
        System.out.println();
    }

}
