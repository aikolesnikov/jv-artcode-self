package week_3;

import utilities.Input;

/**
 * matrix X элементы X[i][j]=1 if i==j
 */
public class Task3_004 {

    private static void printMatrix(int[][] m ){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }

    }

    private static int[][] getMatrix1(int mSize){

        int[][] m = new int[mSize][mSize];

        for (int i = 0; i < mSize; i++) {
                    m[i][i]=1;
        }
        return m;
    }

    public static void main(String[] args) {
        int mSize = Input.inputInt("Enter matrix size:");
        printMatrix(getMatrix1(mSize));
    }
}
