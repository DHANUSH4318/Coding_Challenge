package Level_2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Repeated_words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] a1 = s.split(" ");
        String[] a2 = new String[a1.length];
        for (int i = 0; i < a1.length; i++) {
            for (int j = i+1; j < a1.length; j++) {
                if(a1[i].equals(a1[j]))
                {
                    a1[j]="";
                }
            }
        }
        Arrays.sort(a1);
        for (int i = 0; i < a1.length; i++) {
            if(i==a1.length-1 && a1[i]!="")
            {
                System.out.print(a1[i]);
            }
            else if(a1[i]!="")
            {
                System.out.print(a1[i]+" ");
            }
        }

    }
}
