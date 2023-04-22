package Level_3;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().toLowerCase();
        if(s.equals("green"))
        {
            System.out.println("yellow");
        }
        else if(s.equals("red"))
        {
            System.out.println("green");
        }
        else
        {
            System.out.println("red");
        }
    }
}
