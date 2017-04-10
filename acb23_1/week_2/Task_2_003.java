package week_2;

import utilities.Input;
import java.util.Scanner;

import utilities.Output;
import utilities.Process;

/**
 * week 2 day 2.
 */
public class Task_2_003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exitValue = "Exit";

        System.out.println("Size?:");
        int size = scanner.nextInt();

        System.out.println("min:");
        int min = scanner.nextInt();

        System.out.println("max:");
        int max = scanner.nextInt();

        scanner.nextLine();

        int ar[] = Input.generateIntAr(size, min, max);
        int minValueIndex = Process.findMin(ar);
        Output.printArray(ar);

        System.out.println(minValueIndex);
        System.out.println(ar[minValueIndex]);

        while (true){
            System.out.println("Input new value or "+ exitValue+ " for exit:\n"  );
            String value = scanner.nextLine();

            if (exitValue.equalsIgnoreCase(value)) {
                break;
            }
            int numberValue = Integer.valueOf(value);
            ar[minValueIndex] = numberValue;
            Output.printArray(ar);
        }
    }

}
