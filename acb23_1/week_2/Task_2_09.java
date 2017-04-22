package week_2;

import utilities.Output;

import static utilities.Input.generateIntAr;
import static utilities.Input.inputInt;

/**
 * 9) Задать два массива случайными числами от 25 до 75.
 * Определить у какого из массивов больше парных елементов.
 */

public class Task_2_09 {

    public static void main(String[] args) {

        int size = inputInt("Array size?: ");
        if (size == 0) {
            System.out.println("Size must be > 0 !");
            return;
        }

        int[] ar1 = generateIntAr(size, 25, 75);
        int[] ar2 = generateIntAr(size, 25, 75);

        Output.printArray("Array1:", ar1);
        Output.printArray("Array2:", ar2);

        int par1 = 0;
        int par2 = 0;

        for (int i = 0; i < ar1.length - 1; i++) {
            for (int j = i + 1; j < ar1.length; j++) {
                if (ar1[j] == ar1[i]) {
                    par1++;
                    break;
                }
            }
        }

        for (int i = 0; i < ar2.length - 1; i++) {
            for (int j = i + 1; j < ar2.length; j++) {
                if (ar2[j] == ar2[i]) {
                    par2++;
                    break;
                }
            }
        }

        System.out.println(par1 > par2 ?
                "Array1 has more or equal pairs (" + par1 + ") than Array2 (" + par2 + ")":
                "Array2 has more or equal pairs (" + par2 + ") than Array1 (" + par1 + ")");
    }
}
