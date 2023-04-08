package Level_1;

import java.util.Scanner;

public class Word_frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();int c=1;
        String[] s1 = s.split(" ");
        int[] a1 = new int[100];
        for (int i = 0; i < s1.length; i++) {
            for (int j = i+1; j < s1.length; j++) {
                if (s1[i].equals(s1[j]) && s1[j] != " ") {
                    s1[j] = " ";
                    c++;
                }
            }
                if(c>=1 && s1[i]!=" ")
                {
                    System.out.println(s1[i]+" "+c);
                    c=1;
                }
            }
        }

    }
