package Level_2_and_3;

import java.util.Scanner;

public class Array_Conv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt(),c= in.nextInt();
        System.out.print("[");
        for (int i = 0; i < r; i++) {
            System.out.print("(");
            for (int j = 0; j < c; j++) {
                if(j==c-1)
                {
                    System.out.print(i*j);
                }
                else {System.out.print(i*j+",");}
            }
            if (i==r-1)
            {
                System.out.print(")");
                System.out.print("]");
            }
            else
            {System.out.print("),");}
        }
    }
}
