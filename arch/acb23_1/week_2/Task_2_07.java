package week_2;

import utilities.Output;

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
            sumArPart1 += ar[i];
        }
        System.out.println();

        System.out.print("Right part: ");
        for (int i = 0; i < arMiddle + ar.length % 2; i++) {
            System.out.print(ar[arMiddle + i] + " ");
            sumArPart2 += ar[arMiddle + i];
        }
        System.out.println();

        double avgS1 = (double) sumArPart1 / (arMiddle + ar.length % 2);
        double avgS2 = (double) sumArPart2 / (arMiddle + ar.length % 2);

        System.out.println("avg1=" + avgS1 + "; avg2=" + avgS2);
        if (avgS1 >= avgS2) {
            System.out.print("Left part is bigger: ");
            for (int i = 0; i < arMiddle + ar.length % 2; i++) {
                System.out.print(ar[i] + " ");
                sumArPart1 += ar[i];
            }
        } else {
            System.out.print("Right part is bigger: ");
            for (int i = 0; i < arMiddle + ar.length % 2; i++) {
                System.out.print(ar[arMiddle + i] + " ");
                sumArPart2 += ar[arMiddle + i];
            }
        }

        System.out.println();
    }
}
