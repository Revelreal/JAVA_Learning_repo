package simple_grammars;

public class forced_type_converting {
    public static void main(String[] args)
    {
        int a = 114514;
        float b = (float)a;
        System.out.println(b);
        double c = 114.1514;
        float d = (float)c;
        int e = (int)c;
        System.out.println(d);
        System.out.println(e);
        int num = 5;
        System.out.println(num+'A'+"Skadi"+num+'A');      // 可以看到在运算表达式当中会优先按照顺序进行运算，实在是计算不了地直接输出
        // 并且可以看到只要遇到了解决不了的地方就会从这里往后全都不计算
        // 由于几乎与C语言是相同的语法，我们直接在这里说一下关系运算符
        System.out.println(true^true);                    // 我们这个`^`是异或的意思(TODO:短路与'&&'短路或'||')
        boolean i = true;
        System.out.println(i? true : false);              // 注意这里短路双与的优先级大于短路双或的优先级（TODO：&& > ||）
    }
}
