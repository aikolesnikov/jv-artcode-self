package week_3;

import utilities.Input;

/**
 * matrix X элементы X[i][j]=1 if i==j
 */
public class Task3_005 {

    private static void printMatrixS(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    private static int[][] getMatrix1(int mSize) {

        int[][] m = new int[mSize][mSize];

        for (int i = 0; i < mSize; i++) {
            m[i][i] = 1;
        }
        return m;
    }

    private static void changeMinMaxMElem(String m[][]) {

        String minS = "";
        String maxS = "";
        int minSxPos = 0;
        int minSyPos = 0;
        int maxSxPos = 0;
        int maxSyPos = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].compareTo(minS) < 0) {
                    minS=m[i][j];
                    minSxPos = i;
                    minSyPos = i;
                }
                if (m[i][j].compareTo(maxS) > 0) {
                    maxS=m[i][j];
                    maxSxPos = i;
                    maxSyPos = j;
                }
            }
        }

        System.out.println("Min: " + m[minSxPos][minSyPos]);
        System.out.println("Max: " + m[maxSxPos][maxSyPos]);

        String tmpS = m[minSxPos][minSyPos];
        m[minSxPos][minSyPos] = m[maxSxPos][maxSyPos];
        m[maxSxPos][maxSyPos] = tmpS;
    }


    public static void main(String[] args) {

        String[][] ms = new String[][]
                {
                        {"abc", "sudcsiu", "ab"},
                        {"asdsa", "ddffd", "xl", "kjhyg"},
                        {"ghjhg", "nnn"},
                };

        System.out.println("Matrix initial:");
        printMatrixS(ms);
        System.out.println();

        changeMinMaxMElem(ms);
        System.out.println();

        System.out.println("Matrix changed:");
        printMatrixS(ms);

    }
}
