package week_3;

/**
 * Given a string and an int n,
 * return a string made of n repetitions of the last n characters of the string.
 * You may assume that n is between 0 and the length of the string, inclusive.
 */
public class Task3_002 {

    public static String repeatEnd(String str, int n) {

        if (str.isEmpty())
            return str;

        if (str.length() < n)
            return "Wrong n.";

        String tmpStr = str.substring(str.length() - n, str.length());

        String tmpStr2 = "";
        for (int i = 0; i < n; i++)
            tmpStr2 += tmpStr;

        return tmpStr2;
    }


    public static void main(String[] args) {
        String test = "abcdefgh";
        System.out.println(repeatEnd(test, 3));
    }
}
