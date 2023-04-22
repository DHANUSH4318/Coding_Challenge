package Level_3;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cd1 = 15,c=4 ,d=5,c1 = 24,d1=24;
        if(n==1)
        {
            System.out.println(cd1+" "+cd1);
        }
        else if (n==2) {
            System.out.println(c1+" "+d1);
        }
        else if (n>2) {
            for (int i = 1; i < n-1; i++) {
                c1+=c;
                d1+=d;
            }
            System.out.print(c1+" "+d1);
        }
    }
}
