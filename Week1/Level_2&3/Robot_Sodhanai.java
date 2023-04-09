package Level_2_and_3;

import java.util.Scanner;

public class Robot_Sodhanai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=0,y=0;
        while(true){
            String robo = in.nextLine();
            if(robo.equals(""))
                break;
            else {
                String[] a1 = robo.split(" ");
                if(a1[0].equals("Up")){
                    y+=Integer.parseInt(a1[1]);
                }
                else if(a1[0].equals("DOWN")){
                    y-=Integer.parseInt(a1[1]);
                }
                else if (a1[0].equals("LEFT")) {
                    x-=Integer.parseInt(a1[1]);
                }
                else if (a1[0].equals("RIGHT")) {
                    x+=Integer.parseInt(a1[1]);
                }
                else if(a1[0].equals("STOP"))
                {
                    break;
                }
            }
        }
        System.out.println(x);
        System.out.println(y);
        int distance = (int)Math.sqrt((x*x) +(y*y));
        System.out.println(distance);
    }
}
