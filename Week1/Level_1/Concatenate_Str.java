package Level_1;

import java.util.Scanner;

public class Concatenate_Str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a,b;
        a= in.next();b= in.next();
        if(a.equals("-1")||b.equals("-1"))
            System.out.println("Invalid Input");
        else
            add(a,b);
    }
    public static void add(String a,String b)
    {
        System.out.println(a+b);
    }
}
