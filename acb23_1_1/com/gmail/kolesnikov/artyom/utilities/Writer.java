package com.gmail.kolesnikov.artyom.utilities;

/**
 * Created by artyom.kolesnikov on 4/3/2017.
 */
public class Writer {

    public static void printlnS(String s){
        System.out.println(s);
    }

    public static void printfD(double a){
        System.out.printf("%.2f", a);
    }

    public static void printfD(double a, double b){
        System.out.printf("%.2f, %.2f", a, b);
    }

}
