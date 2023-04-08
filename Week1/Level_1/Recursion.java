package Level_1;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b= in.nextInt();
        System.out.println(sum(a,b));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
