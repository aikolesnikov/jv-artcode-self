package acb_23.acb23_1_01;

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

    public static void main(String[] args) {
        String s = "not abc";
        System.out.println((notString("not abc")));
    }
}
