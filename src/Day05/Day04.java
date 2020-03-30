package Day05;

import java.util.Scanner;

public class Day04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if( x == 3){
            for (int i = 100; i < 999; i++) {
                int a , b , c ;
                a=i/100;
                b=i/10%10;
                c=i%10;
                if(a*a*a+b*b*b+c*c*c==i) {
                    System.out.println(i);
                }
            }
        }
        if(x == 4){
            for (int i = 1000; i < 9999; i++) {
                int a , b , c , d;
                a=i/1000;
                b=i/100%10;
                c=i/10%10;
                d=i%10;
                if(a*a*a*a+b*b*b*b+c*c*c*c+d*d*d*d==i) {
                    System.out.println(i);
                }
            }
        }
        if( x ==5 ){
            for (int i = 10000; i < 99999; i++) {
                int a , b , c , d , e;
                a=i/10000;
                b=i/1000%10;
                c=i/100%10;
                d=i/10%10;
                e=i%10;
                if(a*a*a*a*a+b*b*b*b*b+c*c*c*c*c+d*d*d*d*d+e*e*e*e*e==i){
                    System.out.println(i);
                }
            }
        }
        if( x ==6 ) {
            for (int i = 100000; i < 999999; i++) {
                int a, b, c, d, e, f;
                a = i / 100000;
                b = i / 10000 % 10;
                c = i / 1000 % 10;
                d = i / 100 % 10;
                e = i / 10 % 10;
                f = i % 10;
                if (a * a * a * a * a * a + b * b * b * b * b * b + c * c * c * c * c * c + d * d * d * d * d * d + e * e * e * e * e * e + f * f * f * f * f * f == i) {
                    System.out.println(i);
                }
            }
        }
            if (x == 7) if (x == 7) {
                for (int i = 1000000; i < 9999999; i++) {
                    int a, b, c, d, e, f, g;
                    a = i / 1000000;
                    b = i / 100000 % 10;
                    c = i / 10000 % 10;
                    d = i / 1000 % 10;
                    e = i / 100 % 10;
                    f = i / 10 % 10;
                    g = i % 10;
                    if (a * a * a * a * a * a * a + b * b * b * b * b * b * b + c * c * c * c * c * c * c + d * d * d * d * d * d * d + e * e * e * e * e * e * e + f * f * f * f * f * f * f + g * g * g * g * g * g * g == i) {
                        System.out.println(i);
                    }
                }
            }



    }
}