package Level_3;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();char c = ' ';
        String s = ss.replaceAll("//","/");
        String d = ".";
        StringBuilder n = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
            {
                n.append("p");
                c = s.charAt(i);
            }
            else
            {
                n.append(s.charAt(i));
            }
        }
        String[] s1 = n.toString().split("p");
        int l1 = s1[0].length();
        int l2 = s1[1].length();
        if(c=='+')
        {
            System.out.println(d.repeat(l1+l2));
        }
        else if(c=='-')
        {
            System.out.println(d.repeat(l1-l2));
        }
        else if(c=='*')
        {
            System.out.println(d.repeat(l1*l2));
        }
        else
        {
            System.out.println(d.repeat(l1/l2));
        }

    }
}
