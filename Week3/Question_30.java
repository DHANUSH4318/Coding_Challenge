package Level_3;

import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.print(-a[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" "+-( a[i] ));
        }

    }
}
