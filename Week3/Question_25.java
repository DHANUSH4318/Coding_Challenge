package Level_3;

import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toString(n);
        int res= 0,n1;
        for (int i = 0; i < s.length(); i++) {
            n1= Integer.parseInt(String.valueOf(s.charAt(i)));
            res += n1*n1;
        }
        System.out.println(res);
    }
}
