package week_2;

import utilities.Output;

import static utilities.Input.generateIntAr;
import static utilities.Input.inputInt;


/**
 * public static int[] splitArray(int[] arr, int start, int end) { //
 * обрезать массив по границам start и end
 * }
 */

public class Task_2_10 {

    private static int[] splitArray(int[] arr, int start, int end) {
        int[] arr2 = new int[end - start + 1];

        for (int i = 0; i < (end - start + 1); i++) {
            arr2[i] = arr[i + start - 1];
        }

        return arr2;
    }

    public static void main(String[] args) {

        int size = inputInt("Array size?: ");
        if (size == 0) {
            System.out.println("Size must be > 0 !");
            return;
        }

        int[] ar1 = generateIntAr(size, inputInt("Ar1 values from?: "), inputInt("Ar2 values to?: "));
        Output.printArray("Array1:", ar1);

        int cutFrom = inputInt("Cut from?: ");
        int cutTo = inputInt("Cut to?: ");

        Output.printArray("Array2 ", splitArray(ar1, cutFrom, cutTo));

    }
}
