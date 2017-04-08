package acb23_1_01;

/**
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged.
 * Note: use .equals() to compare 2 strings.
 */
public class test {

    private static String notString(String str) {
        if ((str.length() >= 3) && (str.substring(0, 3).equals("not"))) {
            return str;
        }

        return str = "not " + str;
    }


    private static String deleteSymbolInside(String str, char c){

        int i = str.indexOf(c);
        // System.out.println(str.indexOf(c));

        if (i>=0) {
            str = str.substring(0,i)+str.substring(i+1,str.length());
            // str = str.substring(0,i-1)+str.substring(i,str.length());
        }

        return str;
    }


    public static void main(String[] args) {
        String s = "not abc";
        // System.out.println((notString("not abc")));
        System.out.println(deleteSymbolInside(s, 'a'));
    }
}


/**
 * Created by kaim on 4/8/17.
 */


public class Task_2_2 {

    public static void main(String[] args) {
        // System.out.println(sayHelloS());

        int[] arInt = new int[5];

        for (int i = 0; i < arInt.length; i++) {
            arInt[i] = i;
        }

        System.out.println(mySum(arInt));
        System.out.println(mySum(1,2,3));

    }

    public static int mySum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

    public static String sayHelloS() {
        Scanner input = new Scanner(System.in);

        System.out.println("Who are you?:");
        String s = input.nextLine();

        return ("Hellow, " + s);
    }

}

