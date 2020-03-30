package Day05;

import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        int[] o = new int[x];
        int sum = 0 ;
        for (int i = 0; i < o.length; i++) {
             o[i] = s.nextInt();
        }
        for (int i = 0; i < o.length; i++) {
            sum += o[i];
        }
        System.out.println(sum);
    }
}
