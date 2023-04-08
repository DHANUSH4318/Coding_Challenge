package Level_2_and_3;


import java.util.Scanner;

public class Binary_div {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();int c=0;
        String s1 = s.replaceAll(","," ");
        String[] a1 =s1.split(" ");
        int[] a2 = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            a2[i]= Integer.parseInt(a1[i],2);
            if(a2[i]%5==0)
            {
                c++;
                System.out.println(Integer.toBinaryString(a2[i]));
            }
        }
        if(c==0)
        {
            System.out.println("binary values are not divisible by 5");
        }
    }


}
