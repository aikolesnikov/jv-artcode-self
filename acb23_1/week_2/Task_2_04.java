package week_2;

import utilities.Input;
import utilities.Output;

/**
 * Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class Task_2_04 {

    public static void main(String[] args) {

        int size = Input.inputInt("Array size?: ");

        if (size > 0) {
            int rangeFrom = Input.inputInt("Values from?: ");
            int rangeTo = Input.inputInt("Values to?: ");
            int lookFor = Input.inputInt("Look for?: ");

            int[] ar = Input.generateIntAr(size, rangeFrom, rangeTo);
            System.out.println("Array:");
            Output.printArray(ar);

            int found = 0;

            for (int i = 1; i < ar.length; i++) {
                if (ar[i] == lookFor) found++;
            }

            System.out.println(lookFor + " is found " + found + " times.");
        } else {
            System.out.println("Size must be > 0 !");
        }
    }

}
