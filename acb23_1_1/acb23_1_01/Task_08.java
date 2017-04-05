package acb23_1_01;

import static acb23_1_01.utilities.Input.*;
import static acb23_1_01.utilities.Test.isDivided;

/**
 * 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру
 * и показываем результат деления (целую часть от деления  и остачу)
 * в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */
public class Task_08 {
    public static void main(String[] args) {

        int a, b;
        a = inputInt("Input a:");
        b = inputInt("Input b:");

        System.out.println(isDivided(a, b) ? "true" : "false");
        System.out.printf("Main part: %d, last part: %d", a / b, a % b);
    }

}
