package Questions;

import java.util.Scanner;

public class Ques_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().toUpperCase();
        String[] a = s.split(" ");
        String x = a[0];
        String y = a[1];
        System.out.print(x.charAt(0)+"."+y.charAt(0));
    }
}
