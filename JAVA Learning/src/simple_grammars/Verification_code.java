package simple_grammars;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Verification_code {
    public static String[] Code_Generating(int length, char[] isNum)            // 编写一个随机验证码的生成
    {
        Random random = new Random();
        String generated = " ";
        String[] verification_code = new String[length];              // 定义一个空字符串类型的数组
        for(int i = 0; i < length; i++)
        {
            boolean isDigit = false; // 标记 i 是否在 isNum 中
            for(char content : isNum){
                if(i == content - '1') // 如果 i 等于 isNum 中的某个元素减去 '0' 的值，说明 i 的位置上是数字
                {
                    isDigit = true;
                    break;
                }
            }
            if(isDigit) // 如果 i 的位置上是数字，就生成一个 0 到 9 的随机数
            {
                generated = ""+random.nextInt(10);
            }
            else // 如果 i 的位置上不是数字，就随机生成一个大写或小写字母
            {
                switch (random.nextInt(2))
                {
                    case 0 :{
                        generated = ""+(char)(random.nextInt(26)+'A'); // 生成一个 A 到 Z 的随机字母
                        break;
                    }
                    case 1:{
                        generated = ""+(char)(random.nextInt(26)+'a'); // 生成一个 a 到 z 的随机字母
                        break;
                    }
                }
            }
            verification_code[i] = generated; // 给数组赋值
        }
        return verification_code;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要产生的验证码的长度:");
        int length = sc.nextInt();
        System.out.println("请输入您想要在第几位生成数字（未选择的部分我们将会生成大小写字母）(1,2,3,4,5)之类:");
        String isNum = sc.next();
        String[] isNum_list = isNum.split(",");
        char[] list = new char[isNum_list.length]; // 初始化 char 数组的大小
        int count = 0;
        for(String str : isNum_list)
        {
            list[count++] = str.charAt(0);          // JAVA当中使用charAt方法去读取字符串
        }
        System.out.println("生成的验证码是:"+Arrays.toString(Code_Generating(length, list))); // 输出验证码
    }
}
