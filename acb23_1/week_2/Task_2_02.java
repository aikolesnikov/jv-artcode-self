package week_2;

import utilities.Input;
import utilities.Output;

/**
 * Поменять местами наибольший и наименьший элементы в массиве
 */
public class Task_2_02 {

    public static void main(String[] args) {

        int size = Input.inputInt("Array size?: ");

        if (size > 0) {
            int rangeFrom = Input.inputInt("Values from?: ");
            int rangeTo = Input.inputInt("Values to?: ");

            int[] ar = Input.generateIntAr(size, rangeFrom, rangeTo);

            System.out.println("Array before changing:");
            Output.printArray(ar);

            int min = ar[0];
            int minPos = 0;
            int max = ar[0];
            int maxPos = 0;

            for (int i = 0; i < ar.length-1; i++) {
                if (ar[i] < min) {
                    min = ar[i];
                    minPos = i;
                }
                if (ar[i] > max) {
                    max = ar[i];
                    maxPos = i;
                }
            }

            System.out.println("min = " + min);
            System.out.println("max = " + max);

            if (!(minPos == maxPos)) {
                int tmpArVal = ar[minPos];
                ar[minPos] = ar[maxPos];
                ar[maxPos] = tmpArVal;
            }

            System.out.println("Array after changing:");
            Output.printArray(ar);

        } else {
            System.out.println("Size must be > 0 !");
        }
    }

}
