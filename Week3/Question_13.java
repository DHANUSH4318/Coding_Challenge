package Level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a1 = new String[n];
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = in.next();
//            a2[i] = Integer.parseInt(a1[i]);
        }
        char c = in.nextLine().charAt(0);
        Arrays.sort(a1);
        if(c=='R')
        {
            for (int i = 0; i <a1.length ; i++) {
                System.out.print(a1[i]);
            }
        }
        else if (c=='L') {
            for (int i = a1.length-1; i >=1 ; i--) {
                System.out.print(a1[i]);
            }
        }

    }
}
