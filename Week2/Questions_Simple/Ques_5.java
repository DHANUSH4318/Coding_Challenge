package Questions;

import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        remove(s);
    }
    public static void remove(String s){
        for (int i = 0; i <s.length() ; i++) {
            if(i==0 || i==s.length()-1)
            {
                continue;
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
