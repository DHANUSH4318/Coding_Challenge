package Level_3;

import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();
        float x3 = in.nextFloat();
        float y3 = in.nextFloat();
        
        float res1 = (x1+x2+x3)/3;
        float res2 = (y1+y2+y3)/3;

        System.out.printf("%.4f",res1);
        System.out.print(" ");
        System.out.printf("%.4f",res2);

    }
}
