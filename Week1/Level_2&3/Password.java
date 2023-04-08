package Level_2_and_3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass = in.nextLine();int count=0;
        String p = pass.replaceAll(" ","");
        String s1 = p.replaceAll(","," ");
        String[] a1 = s1.split(" ");
        for (int i = 0; i < a1.length; i++)
        {
            if (a1[i].length() >= 6 && a1[i].length() <= 12) {
                count++;
                System.out.println(a1[i]);
                check(a1[i]);
            }
        }
        if(count==0)
            System.out.println("No password matches the condition");
    }
    public static void check(String a) {
        String res="";
        String[] ans = new String[3];
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (!(a.charAt(i) >= 'a' && a.charAt(i) <= 'z')) {
                c++;
            }
            ;
            if (!(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')) {
                c++;
            }
            ;
            if (!( a.charAt(i) > '0' && a.charAt(i) <= '9' )) {
                c++;
            }
            ;
            if ((a.charAt(i) != '@' || a.charAt(i) != '$' || a.charAt(i) != '#')) {
                c++;
            }

        }
        if (c ==0) {
            System.out.println(a);
        }
//            for (int i = 0; i < ans.length; i++) {
//                ans[i]=a;
//            }
//        }
//        System.out.print(ans[0]);
//        for (int i = 1; i < ans.length; i++) {
//            System.out.print(","+ans[i]);
//        }

    }
}
