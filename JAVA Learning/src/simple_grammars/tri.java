package simple_grammars;

import java.util.Scanner;

public class tri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            a[i][0] = 1;                                // 设置每一行的第一个元素都是1（从有数字的部分开始存储）
            a[i][i] = 1;                                // 设置每一行的最后一个元素都是1
            for(int j = 1; j < i + 1; j++){             // int[][]a 不赋值默认是0
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }

        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }
}
