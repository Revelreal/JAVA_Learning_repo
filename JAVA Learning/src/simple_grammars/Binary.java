package simple_grammars;

public class Binary {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int a = 10;                                                     // 可以看到我们的
        a += 20;
        System.out.println("After Added the value of a is:"+a);
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        /*这里注意一下：
        *               二进制： 0B或者0b开头
        *               八进制： 0开头
        *               十六进制：0x挥着0X开头*/
        final int one = 0b1011;//二进制
        System.out.println(one);
        final int two = 010;//八进制
        System.out.println(two);
        final int three = 0x10;//十六进制
        System.out.println(three);
    }
}