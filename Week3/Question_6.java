package Level_3;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0)
        {
            for (int i = 1; i <= n; i++) {
                System.out.print(i+" sheep...");
            }
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
