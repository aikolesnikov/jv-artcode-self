package week_2;

import utilities.Output;
import utilities.Process;

import static utilities.Input.generateIntAr;
import static utilities.Input.inputInt;

/**
 * Вывести в консоль элементы той половины одномерного массива
 * у которой среднее арифметическое максимальное
 */

public class Task_2_07 {

    public static void main(String[] args) {

        int size = inputInt("Array size?: ");
        if (size == 0) {
            System.out.println("Size must be > 0 !");
            return;
        }

        int[] ar = generateIntAr(size, inputInt("Values from?: "), inputInt("Values to?: "));
        Output.printArray("Array:", ar);

        int sumArPart1 = 0;
        int sumArPart2 = 0;
        int arMiddle = ar.length / 2;

        System.out.print("Left part: ");
        for (int i = 0; i < arMiddle + ar.length % 2; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        System.out.print("Right part: ");
        for (int i = 0; i < arMiddle + ar.length % 2; i++) {
            System.out.print(ar[arMiddle + i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arMiddle; i++) {
            sumArPart1 += ar[i];
            sumArPart2 += ar[arMiddle + i];
        }

        System.out.println(sumArPart1 + " " + sumArPart2);
        if (sumArPart1 > sumArPart2) {
            System.out.println("Left part is bigger:");
        }

        // System.out.println("Average is: " + ((double) Process.sumIntAr(ar)) / ar.length);

    }

}
