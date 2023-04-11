package Level_2;

import java.util.Scanner;

public class Even_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int st = in.nextInt();
        int end = in.nextInt(),n=0;
        int[] a = new int[end];
        if(st<=5000 && end<=5000)
        {
            for (int i = st; i < end; i++) {
                if (i % 2 == 0) {
                    a[n] = i;
                    n++;
                }
            }
            System.out.print(a[0]);
            for (int i = 1; i < 4; i++) {
                if (a[i] != 0) {
                    System.out.print("," + a[i]);
                }
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
