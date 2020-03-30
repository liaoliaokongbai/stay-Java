package Day05;

import java.util.Scanner;

public class Day09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int month1[] = new int[]{ 31,28,31,30,31,30,31,31,30,31,30,31};
        int month2[] = new int[]{ 31,29,31,30,31,30,31,31,30,31,30,31};
        if(y % 4 == 0 && y %100 != 0 || y % 400 ==0){
            System.out.println(month2[x-1]);
        }else{
            System.out.println(month1[x-1]);
        }
    }
}
