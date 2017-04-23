package week_2;

import java.util.Scanner;

/**
 * Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 */

public class Task_2_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = "";
        System.out.print("Enter some string: " + s);
        s = input.next();

        char c;
        System.out.print("Enter some char: ");
        c = input.next().trim().charAt(0);

        System.out.println("Your string is: " + s);
        System.out.println("Your char is: " + c);

        for ( int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

    }

}
