package simple_grammars;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("您想要打印几行?：");
        int line = sc.nextInt();
        // 创建一个 line x line 的数组
        int[][] triangle = new int[line][line];
        // 给第一行的中间元素赋值为 1
        triangle[0][line / 2] = 1;
        // 从第二行开始，按照杨辉三角的规律赋值
        for (int i = 1; i < line; i++) {
            // 每一行的首尾元素为 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            // 每一行的其他元素为上一行相邻两个元素的和
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        // 打印杨辉三角形
        for (int i = 0; i < line; i++) {
            // 在每一行的前面添加空格，使三角形居中对齐
            for (int k = 0; k < line - i; k++) {
                System.out.print(" ");
            }
            // 输出每一行的数字，用空格隔开
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            // 换行
            System.out.println();
        }
    }
}
