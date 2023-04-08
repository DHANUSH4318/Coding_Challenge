package Level_1;

import java.util.Scanner;

public class Perfect_Sqr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt(),c=0,d=0;
        int end = in.nextInt();
        for (int i = start; i < end; i++) {
            for (int j = 2; j <end ; j++) {
                if(i==j*j)
                    c=i;d=j;
                    System.out.print(j*j);break;
            }break;
        }
        for (int i = c+1; i < end; i++) {
            for (int j = d+1; j <end ; j++) {
                if(i==j*j)
                    System.out.print(","+j*j);
            }
        }
    }
}
