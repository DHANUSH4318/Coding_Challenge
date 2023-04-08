package Level_2_and_3;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_AlphaNumeric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();int c=0;
//        String s1 = s.replaceAll("\\.","");
        String[] a1= s.split(" ");
        Arrays.sort(a1);
        for (int i = 0; i < a1.length; i++) {
            for (int j = i+1; j < a1.length; j++) {
                if (a1[i].equals(a1[j]) && a1[j] != " ") {
                    a1[j] = " ";
                    c++;
                }
            }
            if(c>=1 && a1[i]!=" ")
            {
                System.out.println(a1[i]+":"+c);
                c=1;
            }
        }
    }
    }

