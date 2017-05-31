package week_2;

import utilities.Output;

import static utilities.Input.generateIntAr;
import static utilities.Input.inputInt;


/**
 * Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
 * Количество позиций и массив указывает пользователь
 */

public class Task_2_14 {

    public static void main(String[] args) {

        int size = inputInt("Array size?: ");
        if (size == 0) {
            System.out.println("Size must be > 0 !");
            return;
        }

        int[] ar1 = generateIntAr(size, inputInt("Ar1 values from?: "), inputInt("Ar1 values to?: "));
        Output.printArray("Array:", ar1);

        int turn = inputInt("Enter turn step:");
        int[] ar2 = new int[ar1.length];
        System.arraycopy(ar1,ar1.length-turn,ar2,0,turn);
        System.arraycopy(ar1,0,ar2, turn, ar2.length-turn);
        System.arraycopy(ar2,0,ar1, 0, ar2.length);

        Output.printArray("Array after turn:", ar1);
    }
}
