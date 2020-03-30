package Day05;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        int[][] o=new int[4][5];
        int i, j, min, max, minRow=0, minColumn=0, maxRow=0, maxColumn=0;
        Scanner s = new Scanner(System.in);
        for(i=0; i<4; i++)
            for(j=0; j<5; j++)
                 o[i][j]=s.nextInt();
        min=o[0][0];
        max=o[3][4];
        for(i=0; i<4; i++)
            for(j=0; j<5; j++) {
                if(o[i][j]<min) {
                    min=o[i][j];
                    minRow=i+1;
                    minColumn=j+1;
                }
                if(o[i][j]>max) {
                    max=o[i][j];
                    maxRow=i+1;
                    maxColumn=j+1;
                }
            }
        System.out.println("最小值："+ min + "，行号：" + minRow + "，列号：" + minColumn);
        System.out.println("最大值："+ max + "，行号：" + maxRow + "，列号：" + maxColumn );

    }
}

