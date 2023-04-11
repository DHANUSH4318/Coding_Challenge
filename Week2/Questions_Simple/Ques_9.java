package Questions;

import java.util.Scanner;

public class Ques_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int units = in.nextInt();
        if(units<100)
        {
            System.out.println((float) units*1.20);
        }
        else if(units<=300)
        {
            System.out.println((float) 100*1.20+(units-100)*2);
        }
        else
        {
            System.out.println(100*1.20+200 *2+(units-300)*3);
        }
    }
}
