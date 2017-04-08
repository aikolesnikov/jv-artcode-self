package acb23_1_01;

import static utilities.Input.inputInt;

/**
 * 5.2. Вычислить факториал числа.
 */
public class Task_11 {

    private static int Fact(int i) {
        long f = 1;

        if (i < 0) {
            return 0;
        } else if (i == 0) {
            return 1;
        } else {
            return i * Fact(i - 1);
        }
    }

    public static void main(String[] args) {
        int i = 0;
        i = inputInt("Input i:");

        System.out.println(Fact(i));
    }
}
