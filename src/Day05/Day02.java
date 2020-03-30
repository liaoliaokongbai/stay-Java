package Day05;
import java.util.Scanner;
public class Day02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] o = new int[n-1];
        for(int i= 0 ; i < o.length; i++ ){

            o[i] = s.nextInt();
        }
        int max;
        int min;
        max = o[0];
        min = o[0];
        for(int i= 0 ; i < o.length; i++ ){
            if( o[i] > max ){
                max = o[i];
            }
            if( o[i] < min ){
                min = o[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
