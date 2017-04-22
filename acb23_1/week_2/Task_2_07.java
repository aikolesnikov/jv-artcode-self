package week_2;

import utilities.Input;
import utilities.Output;
import utilities.Process;

/**
 * Вывести в консоль элементы той половины одномерного массива
 * у которой среднее арифметическое максимальное
 */

public class Task_2_07 {

    public static void main(String[] args) {

        int size = Input.inputInt("Array size?: ");
        if (size == 0) {
            System.out.println("Size must be > 0 !");
            return;
        }

        int[] ar = Input.generateIntAr(size,
                Input.inputInt("Values from?: "), Input.inputInt("Values to?: "));
        Output.printArray("Array:", ar);


        System.out.println("Average is: " + ((double) Process.sumIntAr(ar)) / ar.length);
    }

}
