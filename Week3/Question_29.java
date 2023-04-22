package Level_3;

import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();

        System.out.println((h*3600000)+(m*60000)+(s*1000));
    }
}
