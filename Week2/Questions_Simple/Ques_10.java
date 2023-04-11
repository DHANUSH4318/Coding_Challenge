package Questions;

import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        float dis = a*(b/100f);
        System.out.println(a-dis);
    }
}
