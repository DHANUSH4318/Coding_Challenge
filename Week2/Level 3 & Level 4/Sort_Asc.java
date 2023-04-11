package Level3_II_Level4;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Asc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1;
        String[] a2 = new String[3];
        StringBuilder s2= new StringBuilder();
        while (true){
            s1=in.nextLine();
            if(s1.equals("")){
                break;
            }
            else
            {
                s2.append(s1);
                s2.append("/");
            }
        }
        String s=s2.toString();
        String t1 = s.replaceAll(" ","");
        String [] a1 = s.split("/");
        Arrays.sort(a1);
        // [('Bradvy', ' 14', ' 90'), ('Hadvy', ' 12', ' 85')]
        System.out.print("[");
        for (int i = 0; i < a1.length; i++) {
            a2=a1[i].split(",");
            System.out.print("("+"'"+a2[0]+"'"+", "+"'"+a2[1]+"'"+", "+"'"+a2[1]+"'"+")");
            if(i== a1.length-1)
            {
                System.out.print("]");
            }
            else
            {
                System.out.print(", ");
            }
        }
    }
}
