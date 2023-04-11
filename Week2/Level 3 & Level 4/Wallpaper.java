package Level3_II_Level4;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        String temp = s.replaceAll(" ","");
        String[] a1= temp.split(",");
        float l = Float.parseFloat(a1[0]);
        float w = Float.parseFloat(a1[1]);
        float h = Float.parseFloat(a1[2]);
        String[] numbers = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        System.out.println(numbers[wallpaper(l,w,h)]);
    }

    public static int wallpaper(float l, float w, float h) {
        if (l * w * h == 0) {
            return 0;
        } else {
            float res = (int) ( Math.ceil(( l * h * 2 + w * h * 2 ) * 1.15 / 5.2f) );
            return (int)res;
        }
    }
}
