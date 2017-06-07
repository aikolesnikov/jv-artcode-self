import java.util.Scanner;

/**
 * Created by artyom.kolesnikov on 6/6/2017.
 */
public class Solution {

    public static long fact(int n) {
        if (n == 0 || n == 1) return 1;

        return n * fact(n - 1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(fact(n));
    }


}
