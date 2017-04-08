package acb23_1_01;

import java.util.Scanner;

import static utilities.Test.*;
import static utilities.Input.*;

/**
 * 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
 */

public class Task_05 {

    public static void main(String[] args) {

        double a = 0, b = 0;
        Scanner input = new Scanner(System.in);

        a = inputDouble("Input a:");
        b = inputDouble("Input b:");
        System.out.println(isBigger(a, b) ? a - b : a + b);
    }

}
