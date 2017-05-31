package week2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner in = new Scanner(System.in);

        int N;
        int K;

        N = in.nextInt();
        K = in.nextInt();

        System.out.println(N%K);
    }
}