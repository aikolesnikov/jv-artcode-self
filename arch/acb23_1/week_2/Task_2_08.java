package week_2;

import utilities.Output;

import static utilities.Input.generateIntAr;
import static utilities.Input.inputInt;

/**
 * Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 * который получается в результате суммы arr1[i] + arr2[i]
 */

public class Task_2_08 {

    public static void main(String[] args) {

        int size = inputInt("Array size?: ");
        if (size == 0) {
            System.out.println("Size must be > 0 !");
            return;
        }

        int[] ar1 = generateIntAr(size, inputInt("Ar1 values from?: "), inputInt("Ar1 values to?: "));
        int[] ar2 = generateIntAr(size, inputInt("Ar2 values from?: "), inputInt("Ar2 values to?: "));

        Output.printArray("Array1: ", ar1);
        Output.printArray("Array2: ", ar2);


        System.out.print("Summary array: ");
        int[] ar3 = new int[size];
        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i] + ar2[i];
            System.out.print(ar3[i] + " ");
        }
        System.out.println();
    }
}
