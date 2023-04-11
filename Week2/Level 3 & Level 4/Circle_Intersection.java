package Level3_II_Level4;

import java.util.Scanner;

public class Circle_Intersection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1= in.nextInt();
        int y1= in.nextInt();
        int r1= in.nextInt();
        int x2= in.nextInt();
        int y2= in.nextInt();
        int r2= in.nextInt();

        int tan1 = y1-r1;
        int tan2 = y2+r2;
        if(tan1==tan2)
        {
            System.out.println("Tangential");
        }
        else
        {
            System.out.println("Overlap");
        }
    }
}
