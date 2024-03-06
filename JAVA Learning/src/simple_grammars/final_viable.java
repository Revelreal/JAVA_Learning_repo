package simple_grammars;

public class final_viable {
    public static void main(String[] args){
        final String name1 = "Skadi";
//        name = "Doctor";                  和const一样final关键字不支持重新分配值
//        String name2 = "Skadi";           注意，和python不一样的是这里如果定义了final关键字就不能再定义相同的变量
//        name2 = "Dr.";
//        System.out.println(name2);

//        八种基本数据类型：(byte,short,int,long)整形,(float,double)浮点型
//        byte    字节型 8位（1字节）   8位，其中有一位是符号位（-2^8  ~ 2^8 - 1）
//        short   短整形 16位（2字节）
//        int     整形 32位（4字节）
//        long    长整形 64位（8字节）
//        注意这里最重要的地方在于说补码的表示，负数的补码：负数的补码是其原码的基础上，首位符号位保持不变，其余各位取反，然后整个数加1
//        注意这里的正数的补码仍然是其本身的原码所以说（TODO：正数的反码补码和原码都是相同的）
//        （TODO:负数的反码是其原码的非符号位按位取反，其补码是反码+1）（注意这里负数的补码的最高位不是0是1所以可以为2^8）
        char input = 'S';
        boolean choice = true;
        if (choice) {
            System.out.print(input);
        }
        // 表达式的自动数据类型转换
        byte i = 10;
        short j = 10;
        int k = 20;
        // byte total = i+j+k;(TODO:你可以很清楚地看到这里的total需要的是一个int整型类型的值，因为再我们的表达式计算当中我们会转换为int)
        int total = i+j+k;
        System.out.println(total);

    }
}
