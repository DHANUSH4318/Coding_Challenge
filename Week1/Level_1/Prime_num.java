package Level_1;

import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 != 0)
            prime(n);
        if (n % 2 == 0)
            System.out.println("The given number is EVEN, so the factorial value of " + n + " is " + rec(n));
    }
    public static void prime(int a) {
        int count = 0;
        for (int i = 2; i < a; i++) {
            if (a % i != 0 && a % 2 != 0)
                count++;
        }
        if (count > 1)
            System.out.println("The given number is ODD and not a prime number.");
        else
            System.out.println("The given number is ODD and also a prime number.");
    }
    public static int rec ( int a){
        if (a == 0)
            return 1;
        else
            return a * rec(a - 1);

        }
    }
