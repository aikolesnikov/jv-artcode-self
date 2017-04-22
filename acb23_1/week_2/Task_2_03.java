package week_2;

import utilities.Input;
import utilities.Output;

/**
 * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Task_2_03 {

    public static void main(String[] args) {

        int size = Input.inputInt("Array1 size?: ");

        if (size > 0) {
            int rangeFrom = Input.inputInt("Values from?: ");
            int rangeTo = Input.inputInt("Values to?: ");

            int[] ar = Input.generateIntAr(size, rangeFrom, rangeTo);
            int[] ar2 = new int[size];
            System.out.println("First array:");
            Output.printArray(ar);
            System.out.println("Second array:");
            Output.printArray(ar2);

            System.arraycopy(ar, 1, ar2, 1, ar.length - 1);

            /*
            for (int i = 1; i < ar.length; i++) {
                ar2[i] = ar[i];
            }
            */
            System.out.println("Second array after copying:");
            Output.printArray(ar2);
        } else {
            System.out.println("Size must be > 0 !");
        }
    }

}
