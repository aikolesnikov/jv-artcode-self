package week_2;

import utilities.Input;
import utilities.Output;
import utilities.Process;


/**
 * Найти среднее арифметическое массива
 */
public class Task_2_05 {

    public static void main(String[] args) {

        int size = Input.inputInt("Array size?: ");

        if (size > 0) {
            int rangeFrom = Input.inputInt("Values from?: ");
            int rangeTo = Input.inputInt("Values to?: ");

            int[] ar = Input.generateIntAr(size, rangeFrom, rangeTo);
            System.out.println("Array:");
            Output.printArray(ar);

            System.out.println("Average is: " + ((double)Process.sumIntAr(ar))/ar.length);
        } else {
           System.out.println("Size must be > 0 !");
        }
    }

}
