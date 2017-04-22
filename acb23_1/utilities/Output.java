package utilities;

/**
 * week 2 .
 */
public class Output {

    public static void printArray(String s, int[] ar) {

        System.out.print(s);
        for (int anAr : ar) {
            System.out.print(anAr);
            System.out.print(" ");
        }
        System.out.println();
    }

}
