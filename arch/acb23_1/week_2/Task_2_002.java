package week_2;

import utilities.Output;
import utilities.Input;
import utilities.Process;

import java.util.Scanner;



/**
 * Week 2 day 2.
 */
public class Task_2_002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size?:");
        int[] ar = Input.generateIntAr(in.nextInt(), 0, 20);

        Output.printArray("",ar);
        Process.findMin(ar);

        // int ind = findMin(ar);
        // Entity.out.print("New elem?:");
        // in.nextInt();
    }
}
