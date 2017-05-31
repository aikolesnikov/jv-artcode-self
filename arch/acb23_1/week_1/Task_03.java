package week_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class Task_03 {
    public static void main(String[] args) {

        int x = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Input x:");
            x = input.nextInt();
            if (x % 7 == 0) {
                System.out.printf("x=%d", x * 2);
            } else {
                System.out.printf("x=%d", x);
            }
            System.out.println();

        } catch (InputMismatchException e2) {
            System.out.println("Wrong input.");
        }

    }
}



