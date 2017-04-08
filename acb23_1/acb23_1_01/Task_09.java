package acb23_1_01;

import static utilities.Input.inputInt;
import static java.lang.Math.abs;

/**
 * 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 * 124    4    -   true
 * 1456   567  -   false
 */
public class Task_09 {
    public static void main(String[] args) {

        int a, b;
        a = inputInt("Input a:");
        b = inputInt("Input b:");

        System.out.println(abs(a) % 10 == abs(b) % 10);
    }
}
