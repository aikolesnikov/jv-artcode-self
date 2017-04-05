package acb23_1_01.utilities;

/**
 * Created by artyom.kolesnikov on 4/5/2017.
 */
public class Test {

    public static boolean isRange(double x,  double a, double b){return ((x >= a) && (x <= b)) ? true : false;}
    public static boolean isRange(int x,  int a, int b){return ((x >= a) && (x <= b)) ? true : false;}

    public static boolean isBigger(double a, double b){return ((a > b)  ? true : false);}
    public static boolean isBigger(int a, int b){return ((a > b)  ? true : false);}

}
