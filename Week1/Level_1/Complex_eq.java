package Level_1;

import java.util.Scanner;

public class Complex_eq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);int c=50,h=30;
        String num = in.next();
        String[] values = num.split(",");
        int[] a1 = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            a1[i]=Integer.parseInt(values[i]);
        }
        System.out.print((int)Math.sqrt((2*c*a1[0])/h));
        for (int i = 1; i < a1.length; i++) {
            System.out.print(","+(int)Math.sqrt((2*c*a1[i])/h));
        }
    }
}
