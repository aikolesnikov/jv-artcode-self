package week_2;

import java.util.Scanner;

/**
 * week 2 day 2.
 */
public class Task_2_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] hellowWords = {"Hello", "Hi", "Bonjure", "Hola", "Привет", "Exit"};

        for (int i = 0; i < hellowWords.length; i++) {
            System.out.println(i + 1 + ". Say " + hellowWords[i]+ ".");
        }
        System.out.println();

        System.out.println("Name?:");
        String name = input.nextLine();

        System.out.println("Choice?:");
        int UserChoice = input.nextInt();

        switch (UserChoice) {
            case 1:
                System.out.println(hellowWords[UserChoice-1] + ", "+ name);
                break;
            case 2:
                System.out.println(hellowWords[UserChoice-1]  + ", "+ name);
                break;
            case 3:
                System.out.println(hellowWords[UserChoice-1]  + ", "+ name);
                break;

            default:
                System.out.println("wrong");
        }
    }
}
