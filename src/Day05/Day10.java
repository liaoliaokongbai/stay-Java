package Day05;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] o = new int[3][3];
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                o[i][j] = s.nextInt();
            }
        }
        int n = 0 ;
        int m = 0 ;
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if ( i == j){
                    n += o[i][i] ;
                }
                if ( i + j == 2){
                    m += o[i][j] ;
                }
            }
        }
        System.out.println(n+m);
    }
}
