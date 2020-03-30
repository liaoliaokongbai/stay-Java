package Day05;
import java.util.Scanner;
public class Day001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int add = 0;
        for (int i = 1; i <= x/2 ; i++) {
            if (x % i == 0) {
                add += i;
            }
        }
        if (add == x) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}