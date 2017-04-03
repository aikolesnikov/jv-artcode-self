package com.gmail.kolesnikov.artyom;

import static com.gmail.kolesnikov.artyom.utilities.Writer.*;

class acb_1_2{
    
    public static boolean isValidTriangle(double a, double b, double c) {
        return ((a + b > c) && (b + c > a) && (c + a > b));
    }

    public static double evaluatePerimeter(double a, double b, double c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        // write your code here

        double a = 7, b = 10, c = 5;
        double perim = 0, area = 0;

        if (isValidTriangle(a, b, c)) {
            perim = evaluatePerimeter(a, b, c) / 2;
            System.out.println(area);
            area = Math.sqrt(perim * (perim - a) * (perim - b) * (perim - c));

            System.out.print("Triangle area is:");
            System.out.println(area);

            printlnS("Formatted:");
            printfD(a);
            System.out.printf("Area is %.2f\n", area);

        } else
        System.out.println("no way");
    }

}
