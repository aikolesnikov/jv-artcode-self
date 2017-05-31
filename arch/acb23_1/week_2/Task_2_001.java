package week_2;

import java.util.Scanner;

/**
 * Saturday lesson
 */
public class Task_2_001 {

    public static void main(String[] args) {
        // Entity.out.println(sayHelloS());

        int[] arInt = new int[5];

        for (int i = 0; i < arInt.length; i++) {
            arInt[i] = i;
        }

        System.out.println(mySum(arInt));
        System.out.println(mySum(1,2,3));

    }

    private static int mySum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }

        return sum;
    }

    public static String sayHelloS() {
        Scanner input = new Scanner(System.in);

        System.out.println("Who are you?:");
        String s = input.nextLine();

        return ("Hellow, " + s);
    }

}