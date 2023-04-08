package Level_1;

import java.util.Scanner;

public class Cal_of_Sqr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(i>-1){
            i= in.nextInt();
            if(i<=-1)
                break;
            else
                System.out.println(i*i);
        }
    }
}
