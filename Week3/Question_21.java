package Level_3;

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toBinaryString(n);
        String ss = "0";
        System.out.println(ss.repeat(8-s.length())+s);
    }
}
