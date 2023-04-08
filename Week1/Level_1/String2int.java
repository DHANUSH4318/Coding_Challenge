package Level_1;

import java.util.Scanner;

public class String2int {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            String a = in.next();
            String b = in.next();
            if (!a.equals("-1") && !b.equals("-1")) {
                int a1 = convert(a);
                int b1 = convert(b);
                System.out.println(add(a1, b1));
            } else{
                System.out.println("Invalid Input");
                break;}
        }
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int convert(String a){
        int num=0,len=a.length();
        for (int i = 0; i < len; i++) {
            num = num*10+((int)a.charAt(i)-48);
        }
        return num;
    }
}
