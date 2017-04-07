package acb_23.acb23_1_01;

import static acb_23.utilities.Input.inputInt;

/**
 * Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 */
public class Task_12 {

    private static int count_num(int a, int num) {
        int cnt = 0;

        while (a>0) {
            if (a % 10 == num) cnt++;
            a /= 10;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int i = 0;

        i = inputInt("Input i:");
        System.out.println(count_num(i, 8));

    }

}
