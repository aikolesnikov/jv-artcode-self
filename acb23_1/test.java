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
        // Entity.out.println(str.indexOf(c));

        if (i >= 0) {
            str = str.substring(0, i) + str.substring(i + 1, str.length());
            // str = str.substring(0,i-1)+str.substring(i,str.length());
        }

        return str;
    }

    private static String startOz(String str) {

        if (str.length() == 0) return str;
        if (str.length() == 1) {
            if (str.charAt(0) == 'o') return str;
            if (str.charAt(0) == 'z') return str;
            return "";
        }

        if (str.charAt(1) == 'z') {
            if (str.charAt(0) == 'o') return "oz";
            else return "z";
        }
        if (str.charAt(0) == 'o') {
            return "o";
        }

        return "";
    }


    public static int last2(String str) {
        if (str.length()<2) return 0;

        String sS = str.substring(
                str.length()-2,str.length()
        );
        int sCount = 0;

        for (int i=0; i<str.length()-2; i++) {
            if  (str.substring(i,i+2).equals(sS)) sCount++;
        }

        return sCount;
    }

    public static boolean noTriples(int[] nums) {

        if (nums.length<3) return true;

        for (int i=0; i<nums.length-3; i++){
            if
                    ((nums[i]==nums[i+1])
                    &&
                    (nums[i+1]==nums[i+2])
                    )
                return false;
        }

        return true;
    }


    private static int stringMatch(String a, String b) {

        if (a.length()<=1||a.length()<=1) return 0;

        int match = 0;
        int n = a.length()<b.length()?a.length():b.length();

        for (int i=0; i<n; i++){
            if (a.substring(i,i+1).equals(b.substring(i,i+1))) match++;
        }

        return match;
    }



    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }
}


