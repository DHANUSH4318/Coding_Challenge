package Level_3;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        float s = in.nextFloat();
        if(n>0 && s>0)
        {
            if (n / s == s * s) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        else
        {
            System.out.println("false");
        }
    }
}
