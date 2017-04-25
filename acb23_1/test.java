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

        return "not " + str;
    }


    private static String deleteSymbolInside(String str, char c) {

        int i = str.indexOf(c);
        // System.out.println(str.indexOf(c));

        if (i >= 0) {
            str = str.substring(0, i) + str.substring(i + 1, str.length());
            // str = str.substring(0,i-1)+str.substring(i,str.length());
        }

        return str;
    }

    private static String startOz(String str) {

        if (str.length()==0) return str;
        if (str.length()==1){
            if (str.charAt(0)=='o') return str;
            if (str.charAt(0)=='z') return str;
            return "";
        }

        if (str.charAt(1)=='z') {
            if (str.charAt(0)=='o') return "oz";
            else return "z";
        }
        if (str.charAt(0)=='o'){
            return "o";
        }

        return "";
    }


    public static void main(String[] args) {
        String s = "hi there";
        // System.out.println((notString("not abc")));
        // System.out.println(deleteSymbolInside(s, 'a'));

        // System.out.println(s.length());
        // System.out.println(s.substring(0,2).equals("hi"));

        System.out.println(startOz("a"));


    }
}


