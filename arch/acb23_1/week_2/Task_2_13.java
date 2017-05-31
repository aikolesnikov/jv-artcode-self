package week_2;

import java.util.Scanner;

/**
 * Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 */

public class Task_2_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = "";
        System.out.print("Enter some string: " + s);
        s = input.next();

        char c;
        System.out.print("Enter some char: ");
        c = input.next().trim().charAt(0);

        int qtyC = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) qtyC++;
        }

        System.out.println("There are " + qtyC + " chars '" + c +
                            "' in the string \"" + s + "\".");

    }

}
