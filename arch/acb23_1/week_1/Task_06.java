package week_1;

import static utilities.Input.*;
import static utilities.Test.*;

/**
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class Task_06 {
    public static void main(String[] args) {
        double a = 0, b = 0, sum = 0;
        a = inputDouble("Input a:");
        b = inputDouble("Input b:");
        sum = a + b;

        System.out.println(isRange(sum, 11, 19) ? sum : "Sum is not in the range.");
    }
}
