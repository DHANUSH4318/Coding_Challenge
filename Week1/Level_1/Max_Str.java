package Level_1;

import java.util.Scanner;

public class Max_Str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] a1 = new String[10];//String res="";
        int n=0;
        while (n>=0)
        {
            String c = in.next();
            if(c.equals("-1"))
                {break;}
            else{
                a1[n]=c;
                n++;}
        }
        if(a1[0]==null)
        {
            System.out.println("No string given");
        }
        else {
            String Max = a1[0];
            for (int i = 1; i < a1.length; i++) {
                if (a1[i] != null) {
                    if (Max.length() == a1[i].length())
                        System.out.print(a1[i]);
                    if (Max.length() < a1[i].length())
                        Max = a1[i];
                }
            }
            System.out.println(Max);
        }
    }
}
