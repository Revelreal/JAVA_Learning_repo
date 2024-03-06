package simple_grammars;
import java.util.Scanner;// 导入我们的JAVA写好的API接口
import java.util.Random;
public class scanner_api {
    public static void  main(String[] args){
//        Scanner sc = new Scanner(System.in);         // 新建一个Scanner类对象称其为sc注意在JAVA当中新建类对象需要写new关键字
//        System.out.println("请输入您最喜爱的干员名称:");
//        String operator_name = sc.next();
//        System.out.println(operator_name);
//        System.out.println("请输入她的年龄:");
//        int age = sc.nextInt();
//        System.out.println(age);
        //TODO:我们在这里创建我们的random实例对象
        Random r = new Random();
        int data = r.nextInt(10);       // 实例化随机数的
        System.out.println(data);
        int []list = {1, 2, 3, 4};
        String[]name_list = {"Skadi","Doctor","Flame","Torch"};
        for (int i : list) {
            System.out.print(i);
            System.out.println(",");
        }
        for(String j :name_list){
            System.out.println(j);
        }
    }

}
