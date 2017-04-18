package week_2;

import utilities.Input;
import utilities.Output;

/**
 * Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Task_2_01 {

    public static void main(String[] args) {

        int size = Input.inputInt("Array size?: ");

        if (size > 0) {
            int rangeFrom = Input.inputInt("Values from?: ");
            int rangeTo = Input.inputInt("Values to?: ");

            int[] ar = Input.generateIntAr(size, rangeFrom, rangeTo);
            Output.printArray(ar);

            int min = ar[0];
            int max = ar[0];

            for (int i = 1; i < ar.length; i++) {
                if (ar[i] < min) min = ar[i];
                if (ar[i] > max) max = ar[i];
            }

            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
        else {
            System.out.println("Size must be >0!");
        }
    }

}
