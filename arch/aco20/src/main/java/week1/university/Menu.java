package week1.university;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UI .
 */
class Menu {

    void init() {
        int choice = 0;
        while (!(choice == 4)) {
            System.out.println("Make your choice:");

            System.out.println("1. Students.");
            System.out.println("2. Groups.");
            System.out.println("3. week1.Univer.");
            System.out.println("4. Exit.");

            Scanner input = new Scanner(System.in);
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Setting value to 0.\n");
            }

            switch (choice) {
                case 1:
                    System.out.println("menu1\n");
                    break;
                case 2:
                    System.out.println("menu2\n");
                    break;
                case 3:
                    System.out.println("menu3\n");
                    break;
            }
        }
    }
}
