package Questions;

import java.util.Scanner;

public class Ques_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        int t=1;
        for (int i = 0; i < e; i++) {
            t*=n;
        }
        System.out.println(t);
    }
}
