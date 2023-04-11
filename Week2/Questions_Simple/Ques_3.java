package Questions;

import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= in.nextInt();
        }
        int temp = a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        for(int z : a)
        {
            if(z==0)
            {
                System.out.print(z);
            }
            else
            {
                System.out.print(" "+z);
            }
        }
    }
}
