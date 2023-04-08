package Level_1;

import java.util.Scanner;

public class N_Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt(),c=0;
        for(int i=start;i<=end;i++)
        {
            if(i%7==0 && i%5!=0) {
                c=i;
                System.out.print(i);
                break;
            }
        }
        for(int i=c+1;i<=end;i++)
        {
            if(i%7==0 && i%5!=0) {
                System.out.print(","+i);
            }
        }

    }
}
