package Level_3;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l=0,h=0;
        if(n==1)
        {
            System.out.println(n);
        }
        else
        {
            for (int i = 1; i < n; i++) {

                if (i * i < n) {
                    l = i * i;
                } else if (i * i > n) {
                    h = i * i;
                    break;
                }
            }
            int res1 = n - l;
            //System.out.println(res1);
            int res2 = h - n;
            //System.out.println(res2);
            if (res1 < Math.abs(res2)) {
                System.out.println(l);
            } else {
                System.out.println(h);
            }
        }
    }
}
