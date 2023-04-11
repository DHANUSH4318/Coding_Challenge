package Level_2;

import java.util.Scanner;

public class Odd_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();int n=0;
        String temp = s.trim();
        String[] a1 = temp.split(",");
        int[] a2 = new int[a1.length];
        for (int i = 0; i <a1.length; i++) {
            n=Integer.parseInt(a1[i]);
            if(n%2!=0)
            {
                a2[i]=n;
            }
        }
        System.out.print(a2[0]);
        for (int i = 1; i < a2.length; i++) {
            if(a2[i]!=0)
            {
                System.out.print(","+a2[i]);
            }
        }
    }
}
