package acb_23.acb23_1_01;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by artyom.kolesnikov on 4/4/2017.
 *
 * 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 * Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 *
 */
public class Task_01 {

    public static void main(String[] args) {

        System.out.println("Введите время:");

        Scanner input = new Scanner(System.in);
        try {
            byte time = 0;
            time = input.nextByte();

            if ((time < 0) || (time > 24)){
                System.out.println("Неправильный ввод. Диапазон 0-24");
            }
            else if((time < 9) || (time > 18)){
                    System.out.println("Я дома.");
            }
            else {
                    System.out.println("Я на работе.");
                }
        } catch (InputMismatchException time) {
            System.out.println("Неправильный ввод. Требуются цифры в диапазоне 0-24");
        }
    }
}
