package Level_3;

import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        if(n%x==0 && n%y==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
