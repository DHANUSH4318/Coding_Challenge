package Level3_II_Level4;

import java.util.Scanner;

public class Hiring_Chefs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();in.nextLine();
        String[] a1 = new String[N];
        for (int i = 0; i < N; i++) {
            a1[i]= in.nextLine();
            String[] s = a1[i].split(" ");
            if(Integer.parseInt(s[1])==(N-1))
            {
                System.out.println(s[1]);
            }
        }
    }
}
