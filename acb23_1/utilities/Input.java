package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static boolean Input_byte(String s) {
        System.out.println(s);
        return true;
    }

    public static double inputDouble(String s) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print(s);
            return input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Setting value to 0.0");
            return 0;
        }
    }

    public static int inputInt(String s) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print(s);
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Setting value to 0.");
            return 0;
        }
    }

    public static int[] generateIntAr(int size, int min, int max) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = randomIntValue(min, max);
        }
        return array;
    }

    public static int randomIntValue(int min, int max) {
        return (int) (Math.random() * (Math.abs(min - max)+1) + min);
    }

}
