package Day05;
import java.util.Scanner;
public class Day01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        if (s.equals("0")){
            return;
        }
        String[] s1 = s.split(" ");
        int[] o=new int[s.length()];
        for (int i=0;i<s1.length;i++){
          o[i]=Integer.valueOf(s1[i]);
        }
        double sum=0;
        int num1=0;
        int num2=0;
        for (int i=0;i<o.length;i++){
            if (o[i]>0){
                num1++;
            }else if (o[i]<0){
                num2++;
            }
            sum+=o[i];
        }
        System.out.println(num1);
        System.out.println(num2);
        int a=(int)sum;
        System.out.println(a);
        System.out.println(sum/(num1+num2));
    }
}
