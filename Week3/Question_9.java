package Level_3;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String animals  = in.nextLine().toLowerCase();
        String[] a = animals.split(",");
        if(a[0].equals("tail"))
        {
            System.out.println("head,body,tail");
        }
        else if(a[0].equals("tails"))
        {
            System.out.println("head,body,tails");
        }
        else if(a[0].equals("bottom"))
        {
            System.out.println("top,middle,bottom");
        }
        else if(a[0].equals("lower legs"))
        {
            System.out.println("upper legs,torso,lower legs");
        }
        else if(a[0].equals("ground"))
        {
            System.out.println("sky,rainbow,ground");
        }
    }
}
