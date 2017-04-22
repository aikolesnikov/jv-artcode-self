package week_2;

import utilities.Output;

import static utilities.Input.generateIntAr;
import static utilities.Input.inputInt;


/**
 * Инвертировать массив (без использования дополнительного массива)
 */

public class Task_2_11 {

    public static void main(String[] args) {

        int size = inputInt("Array size?: ");
        if (size == 0) {
            System.out.println("Size must be > 0 !");
            return;
        }

        int[] ar1 = generateIntAr(size, inputInt("Ar1 values from?: "), inputInt("Ar2 values to?: "));
        Output.printArray("Array1:", ar1);

        int tmpInt = 0;
        for (int i = 0; i < ar1.length / 2; i++) {
            tmpInt = ar1[i];
            ar1[i] = ar1[ar1.length - 1 - i];
            ar1[ar1.length - 1 - i] = tmpInt;
        }

        Output.printArray("InvArr:", ar1);

    }
}
