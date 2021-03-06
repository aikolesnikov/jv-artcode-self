package week_3;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner,
 * return true if all of the numbers in inner appear in outer.
 * The best solution makes only a single "linear" pass of both arrays,
 * taking advantage of the fact that both arrays are already in sorted order.
 * CodingBat Array-3 > linearIn
 */

public class Task3_003 {

/*
    private static boolean linearIn(int[] outer, int[] inner) {
        int partSize = inner.length;  // 1,2,3,4
        for (int i = 0; i <= outer.length - partSize; i++) {
            if (eq(outer, i, i + partSize - 1, inner, 0, inner.length - 1)) {
                return true;
            }
        }
        return false;
    }
*/
/*
    private static boolean eq(int[] arr1, int st1, int end1, int[] arr2, int st2, int end2) {
        while (st1 <= end1 && st2 <= end2) {
            if (arr1[st1] != arr2[st2]) {
                return false;
            }
            st1++;
            st2++;
        }
        return true;
    }
*/

    private static boolean linearIn2(int[] outer, int[] inner) {

        if (inner.length == 0) return true;

        int i=0;
        int j = 0;

        boolean appear = false;

        while (j < inner.length && i < outer.length) {
            if (inner[j] == outer[i]) {
                j++;
                appear = true;
            } else {
                i++;
                appear = false;
            }
        }

        return appear;
    }


    public static void main(String[] args) {

        int[] ar1 = {-1, 0, 3, 3, 3, 10, 12};
        int[] ar2 = {-1, 0, 3, 12};

        System.out.println(linearIn2(ar1, ar2));
    }
}
