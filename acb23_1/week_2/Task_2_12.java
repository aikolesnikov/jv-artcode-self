package week_2;

import utilities.Input;

/**
 * Проверить или является число простым
 */
public class Task_2_12 {

    private static boolean isSimple(int n) {

        n = Math.abs(n);
        if (n == 0 || n == 1 || n == 2 || n == 3) return true;

        int i = 2;

        while (i <= n / 2) {
            if (n % i++ == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = Input.inputInt("Input number:");
        System.out.println(isSimple(n));
    }

}
