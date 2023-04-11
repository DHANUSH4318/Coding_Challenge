package Level3_II_Level4;

import java.util.Arrays;
import java.util.Scanner;

public class Treasure_Hunt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int crates = in.nextInt();int total=0;
        int[] gold = new int[crates];

        for (int i = 0; i < crates; i++) {
            gold[i] = in.nextInt();
        }
        Arrays.sort(gold);
        System.out.println(gold[crates-1]+gold[crates-2]);
    }
}
