package com.gmail.kolesnikov.artyom.acb_23_1_00.utilities;

/**
 * Created by artyom.kolesnikov on 4/3/2017.
 */
public class Writer {

    public static void printlnS(String s){
        System.out.println(s);
    }

    public static void println_d(String s, double a){
        System.out.print(s);
        System.out.printf ("%.2f", a);
        System.out.println();
    }

    public static void println_d(String s1, String s2, double a, double b){
        System.out.print(s1);
        System.out.printf ("%.2f", a);
        System.out.print(s2);
        System.out.printf ("%.2f", b);
        System.out.println();
    }

}
