package com.gmail.kolesnikov.artyom;

class acb_1_2{
    
    public static boolean isValidTriangle(double a, double b, double c) {
        return ((a + b > c) && (b + c > a) && (c + a > b));
    }

    public static double evaluatePerimeter(double a, double b, double c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        // write your code here

        double a = 7;
        double b = 10;
        double c = 5;

        double perim = 0;
        double area = 0;

        if (isValidTriangle(a, b, c)) {
            perim = evaluatePerimeter(a, b, c) / 2;
            System.out.println(area);
            area = Math.sqrt(perim * (perim - a) * (perim - b) * (perim - c));

            System.out.print("Triangle area is:");
            System.out.println(area);

            System.out.println("Formatted:");
            System.out.printf("a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
            System.out.printf("Area is %.2f\n", area);

        } else
        System.out.println("no way");
    }

}
