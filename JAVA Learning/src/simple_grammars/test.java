package simple_grammars;

import java.util.Scanner;

public class test {
    float score;
    String name;
    public void init()                                  // 注意这里如果想要动态初始化我们的class类，就不能
    {
        System.out.println("请输入学生的成绩:");
        Scanner sc =new Scanner(System.in);
        this.score = sc.nextFloat();
    }
}
