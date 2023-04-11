package Level3_II_Level4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Detection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        String s1 = in.nextLine().toLowerCase();char[] s3=s1.toCharArray();
        String s2 = in.nextLine().toLowerCase();char[] s4 = s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        if(s3.length== s4.length)
        {
            for (int i = 0; i < s3.length; i++) {
                if ((int)s3[i] == (int)s4[i]) {
                    count++;
                }
            }
            if (count == s3.length) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        else
        {
            System.out.println("False");
        }

    }
}
