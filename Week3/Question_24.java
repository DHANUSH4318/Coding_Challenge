package Level_3;

import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            c+=s.charAt(i);
        }
        System.out.println((int)c);
    }
}
