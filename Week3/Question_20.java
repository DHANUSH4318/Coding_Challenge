package Level_3;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=12)
        {
            System.out.println("You're a kid");
        }
        else if(n<=17)
        {
            System.out.println("You're a teenager");
        }
        else if(n<=64)
        {
            System.out.println("You're a adult");
        }
        else
        {
            System.out.println("You're a elderly");
        }
    }
}
