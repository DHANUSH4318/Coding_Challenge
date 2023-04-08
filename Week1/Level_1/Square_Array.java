package Level_1;

import java.util.Scanner;

public class Square_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a1 = new int[size];
        int[] a2 = new int[size];

        for (int i = 0; i < size; i++) {
            a1[i]=i+1;
            a2[i]=(i+1)*(i+1);
        }
        System.out.print(a1[0]+":"+a2[0]);
        for (int i = 1; i < size; i++) {
            System.out.print(","+a1[i]+":"+a2[i]);
        }
    }
}
