package acb23_1_01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 		4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class Task_04 {

    private static boolean isZeroOne(double x){
        if ((x < 0) || (x > 1)){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        double x = 0;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input x:");
            x = input.nextDouble();
            System.out.println(isZeroOne(x) ? "yes" : "no");

        } catch (InputMismatchException e2) {
            System.out.println("Wrong input.");
        }
    }
}
