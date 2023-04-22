package Level_3;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (true)
        {
            String a = in.nextLine();
            if(a.equals(""))
            {
                System.out.println();
            }
            else
            {
                System.out.println(a.repeat(s.length()));break;
            }
        }
    }
}
