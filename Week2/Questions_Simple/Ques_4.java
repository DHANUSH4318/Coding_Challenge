package Questions;

import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float res = (b/a)*c;
        System.out.printf("%.1f",res);
    }
}
