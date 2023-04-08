package Level_1;

import java.util.Scanner;

public class VaporWave {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        convert(s);
    }
    public static void convert(String a){
        String s = a.replaceAll(" ","");
        s = s.toUpperCase();
        System.out.print(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            System.out.print(" "+s.charAt(i));
        }
    }
}
