package Day05;

import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(x > y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
