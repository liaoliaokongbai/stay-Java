package Day05;

import java.util.Scanner;

public class Day08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int t;
        if(a > b){
            t = a;
            a = b;
            b = t;
            if(a > c){
                t = a;
                a = c;
                c = t;
            }
            }
        if(b > c){
            t = b;
            b = c;
            c = t;
        }
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c);

        }

}