package week_2;

import java.util.Scanner;

/**
 * Заменить в строке все символы 'a' на '@'
 * и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"
 */

public class Task_2_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = "";
        System.out.print("Enter some string: " + s);
        s = input.next();

        char cToReplace;
        System.out.print("Which char to replace? ");
        cToReplace = input.next().trim().charAt(0);

        char cByReplace;
        System.out.print("Replace by what? ");
        cByReplace = input.next().trim().charAt(0);

        System.out.println("Initial string:" + s);
        System.out.println("Updated string:" + s.replace(cToReplace, cByReplace));
    }

}
