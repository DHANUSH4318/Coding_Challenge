package Level_3;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = a/(b*b);
        if(c<=18.5)
        {
            System.out.println("Underweight");
        }
        else if (c>18.5 && c<=25.0) {
            System.out.println("Normal");
        }
        else if (c>25.0 && c<=30) {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }
    }
}
