package Day05;

import java.util.Scanner;

public class Day07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x == 1){
            System.out.println(1);
            return;
        }
        for (int i = 1; i <= x; i++) {
            System.out.print( i + " " );
        }
        for (int j = x-1; j > 1; j--) {
            System.out.print( j + " " );
        }
        System.out.print(1);
    }
}
