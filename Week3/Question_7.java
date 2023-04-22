package Level_3;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().toLowerCase();
        String d = in.nextLine().toLowerCase();
        if(s.charAt(0)==d.charAt(0)&&s.charAt(s.length()-1)==d.charAt(d.length()-1))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
