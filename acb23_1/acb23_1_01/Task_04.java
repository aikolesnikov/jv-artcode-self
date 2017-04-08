package acb23_1_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import static utilities.Test.*;

/**
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class Task_04 {

    public static void main(String[] args) {

        double x = 0;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input x:");
            x = input.nextDouble();
            System.out.println(isRange(x, 0, 1) ? "yes" : "no");

        } catch (InputMismatchException e2) {
            System.out.println("Wrong input.");
        }
    }
}
