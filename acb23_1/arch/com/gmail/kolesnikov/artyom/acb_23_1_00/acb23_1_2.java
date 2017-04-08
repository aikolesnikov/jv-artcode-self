package arch.com.gmail.kolesnikov.artyom.acb_23_1_00;

import static arch.com.gmail.kolesnikov.artyom.acb_23_1_00.utilities.Writer.*;

class acb23_1_2{
    
    private static boolean isValidTriangle(double a, double b, double c) {
        return ((a + b > c) && (b + c > a) && (c + a > b));
    }

    private static double evaluatePerimeter(double a, double b, double c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        // write your code here

        double a = 7, b = 10, c = 5;
        double perim = 0.0, area = 0.0;

        if (isValidTriangle(a, b, c)) {
            perim = evaluatePerimeter(a, b, c) / 2;
            area = Math.sqrt(perim * (perim - a) * (perim - b) * (perim - c));

            println_d("a=", ", b=", a, b);
            println_d("Triangle area is: ", area);

        } else
        System.out.println("no way");
    }

}
