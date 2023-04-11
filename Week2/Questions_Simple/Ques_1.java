package Questions;

import java.util.Scanner;

public class Ques_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float t=0;
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i]= in.nextInt();
            t+=a1[i];
        }
        System.out.println(t/n);
    }
}
