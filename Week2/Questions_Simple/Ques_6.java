package Questions;

import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int[] a = new int[3];
        for (int i = 1; i <= N; i++) {
            if(i%x==0)
            {
                a[0]+=i;
            }
            if(i%y==0)
            {
                a[1]+=i;
            }
            if(i%x==0 && i%y==0)
            {
                a[2]+=i;
            }
        }
        System.out.println(a[0]+a[1]-a[2]);
    }
}
