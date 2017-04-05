package acb23_1_01.utilities;

public class Test {

    public static boolean isRange(double x,  double a, double b){return ((x >= a) && (x <= b));}
    public static boolean isRange(int x,  int a, int b){return ((x >= a) && (x <= b));}

    public static boolean isBigger(double a, double b){return (a > b);}
    public static boolean isBigger(int a, int b){return (a > b);}

    public static boolean isDivided(double a, double b){return (a % b == 0);}
    public static boolean isDivided(int a, int b){return (a % b == 0);}

}
