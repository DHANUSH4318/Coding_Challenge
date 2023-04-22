package Level_3;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0)
        {
            System.out.println(n*8);
        }
        else
        {
            System.out.println(n*9);
        }
    }
}
