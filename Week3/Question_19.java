package Level_3;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),c=0;
        String[] a1 = new String[n];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = in.next().toLowerCase();
            if(a1[i].equals("true"))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
