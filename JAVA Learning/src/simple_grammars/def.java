package simple_grammars;

import java.util.Scanner;
/*这里有一个重要的知识点哦，JAVA在程序的执行过程当中会将方法压入栈当中*/
public class def {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请问要计算1~多少的加和？:");
        int max_num = sc.nextInt();
        System.out.println("1到"+max_num+"的加和是:"+add_total(max_num));
    }
    public static int add_total(int max)
    {
        int total = 0;
        for (int i = 0; i < max; i++)
        {
            total += (i+1);
        }
        return total;
    }
}
