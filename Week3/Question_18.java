package Level_3;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.nextLine();
        System.out.println(s.repeat(n));
    }
}
