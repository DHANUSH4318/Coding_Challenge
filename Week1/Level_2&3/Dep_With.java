package Level_2_and_3;

import java.util.Scanner;

public class Dep_With {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        while (true){
            String dw = in.nextLine();
            if(dw.equals(""))
                break;
            else
            {
                String[] a1 = dw.split(" ");
                if(a1[0].equals("D")){
                    total+=Integer.parseInt(a1[1]);
                }
                else if(a1[0].equals("W")){
                    total-=Integer.parseInt(a1[1]);
                }
                else
                {
                    System.out.println("invalid input");
                }
            }
        }
        System.out.println(total);
    }
}
