package utilities;

/**
 * week 2 day 2.
 */
public class Process {

    public static int findMin(int[] ar) {
        int minValue = ar[0];
        int indexOfMinValue = 0;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < minValue) {
                minValue = ar[i];
                indexOfMinValue = i;
            }
        }

        return indexOfMinValue;
    }

    public static int sumIntAr(int[] ar) {
        int sum = 0;

        // for (int i : ar) {
        // sum += ar[i];
        //}

        for (int i = 0; i < ar.length - 1; i++) {
            sum += ar[i];
        }
        return sum;
    }
}

