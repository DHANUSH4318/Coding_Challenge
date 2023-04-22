package Level_3;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextInt();
        int i=1;
        if(n==2)
        {
            System.out.println("true");
        }
        else
        {
            while (n >= 2) {
                n /= 2f;
                if (n == 2) {
                    System.out.println("true");
                    i++;
                    break;
                }

            }
            if (i == 1) {
                System.out.println("false");
            }
        }
    }
}
