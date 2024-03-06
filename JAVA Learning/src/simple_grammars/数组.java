package simple_grammars;

import java.nio.channels.ScatteringByteChannel;
import java.util.HashMap;
import java.util.Scanner;

public class 数组 {
    public static void main(String[] args)
            /*说了这么多，其实就是执行代码的时候先进入main方法，main方法分配数组的内存地址，堆内存分配*/
    {
//        // 我们这里演示静态数组的定义语法
//        int[] ages = new int[]{12, 24, 36};
//        // 下面我们来写其简化语法
//        // int[]ages = {1, 3, 5, 7, 9};
//        ages[0] = 23;
//        System.out.println(ages);               // 这里打印的是我们数组的地址
//        for(int i : ages){
//            System.out.println(i);
//        }
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        double total = 0;
//        while(true){
//            System.out.println("请您输入第 "+(++count)+" 位员工的销售额(-1代表结束)");
//
//            try {
//                float salary = sc.nextInt();
//                if ((int) salary == -1) {                  // 如果我们检测到应该退出我们的循环，那么就break掉
//                    count--;
//                    System.out.println("录入成功，总共录入了:" + count + "位员工的薪资");
//                    break;
//                } else {
//                    total += salary;
//                }
//            }
//
//            catch (Exception e){
//                System.out.println("请您输入正确的数据！");
//                sc.nextLine();                            // 清除当前scanner对象的读取
//                count--;
//            }
//
//        }
//        System.out.println("员工的总销售额是"+total+"元");
//        //TODO:哎嘿，下面是我们的动态初始化我们的数组
//        int[]list = new int[3];                             // 我们可以在
//        HashMap <String, Integer> map = new HashMap<>();    // 定义一个我们的hashmap类型的map数据容器
//        Scanner sc = new Scanner(System.in);
//        int temp;
//        for (int i = 0; i < list.length; i++){
//            System.out.println("请输入第:"+(i+1)+"个int类型的数据");
//            temp = sc.nextInt();
//            list[i] = temp;
//        }
//        // 打印我们的数组
//        for (int i : list){
//            System.out.println(i);
//        }
        //TODO:对同一个数组多个变量的赋值
        int[]list = new int[]{11, 22, 33, 44};
        int[]list2 = list;                                  // 可以看到，这里其实和C语言相似，将list地址值传参给list2了
        list2[1] = 99;
        System.out.println(list[1]);
        /*当我们给我们的数组的地址赋值为null的时候*/
//        int[] null_list = null;
//        null_list[1] = 10;
//        System.out.println(null_list[1]);
        //TODO:可以看到哈，我们如果设置null类型的数组，是不可以为其赋值的
    }
}
