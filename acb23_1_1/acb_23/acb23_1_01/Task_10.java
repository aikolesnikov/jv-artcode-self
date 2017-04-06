package acb_23.acb23_1_01;

import static acb_23.utilities.Input.inputInt;

/**
 * 		5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
 */
public class Task_10 {

    public static void main(String[] args) {

        int i = 0, t = 0;
        i = inputInt("Input i:");
        t = i;
        String bnr = "";

        while (t != 0)  {
            // System.out.println(t%2==0 ? 0 : 1);
            if (t%2 == 0)
                bnr = "0" + bnr;
            else
                bnr = "1" + bnr;
            t = t / 2;
        }

        System.out.printf("i=%d", i);
        System.out.println();
        System.out.println(bnr);
        System.out.print("Проверка: ");
        System.out.println(Integer.toBinaryString(i));
        //System.out.println(Integer.parseInt(Integer.toBinaryString(i), 2));
    }
}
