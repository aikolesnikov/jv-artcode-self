package acb23_1_01.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by artyom.kolesnikov on 4/4/2017.
 */
public class Input {

    public static boolean Input_byte(String s){
        System.out.println(s);
        return true;
    }

    public static double inputDouble(String s){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print(s);
            return input.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("Wrong input. Setting value to 0.0");
            return 0;
        }
    }

}
