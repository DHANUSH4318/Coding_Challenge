package Level_2;

import java.util.Scanner;

public class Letter_Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();int letter=0,digit=0;
        String t = s.replaceAll(" ","");
        char[] a1 = t.toCharArray();
        for (int i = 0; i < a1.length; i++) {
            if((a1[i]>='a'&&a1[i]<='z') ||(a1[i]>='A'&&a1[i]<='Z'))
            {
                letter++;
            }
            else if (a1[i]>='0'&&a1[i]<='9') {
                digit++;
            }
        }
        System.out.println("LETTERS "+letter);
        System.out.println("DIGITS "+digit);
    }
}
