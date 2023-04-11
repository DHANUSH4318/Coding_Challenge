package Questions;


import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(operation(c,a,b));
    }
    public static int operation(String c,int a,int b){
        if(c.equals("+"))
        {
            return a+b;
        }
        else if(c.equals("-"))
        {
            return a-b;
        }
        else if(c.equals("*"))
        {
            return a*b;
        }
        else if (c.equals("/"))
        {
            return a/b;
        }
        else{
            return 0;}
    }
}
