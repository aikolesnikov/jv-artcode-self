package week_1;

import java.util.Scanner;

import static utilities.Input.inputInt;

/**
 * 5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
 */
public class Task_10 {

    public static void main(String[] args) {

        int i, t;

        i = inputInt("Input i:");
        t = i;
        String bnrS = "";

        while (t != 0) {
            bnrS = (t % 2 == 0) ? "0" + bnrS : "1" + bnrS;
            t = t / 2;
        }

        System.out.println(bnrS);
        System.out.print("Проверка: ");
        System.out.println(Integer.toBinaryString(i));
        //Entity.out.println(Integer.parseInt(Integer.toBinaryString(i), 2));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        in.next(bnrS);
        System.out.println(Integer.parseInt(bnrS, 2));
    }
}
