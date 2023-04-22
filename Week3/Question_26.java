package Level_3;

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        float r1 = n/100;
        float r2 = n%100;
        if(r2==0)
        {
            System.out.println((int)r1);
        }
        else
        {
            System.out.println((int)r1+1);
        }
    }
}
