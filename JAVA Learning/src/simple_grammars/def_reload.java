package simple_grammars;

public class def_reload {
    // 我们在一个class当中如果出现一个相同名称的方法的时候我们成这个方法重载了（旧的方法更新了）(TODO：注意形参要不同不然会Redefinition)
    public static void print1(String string)
    {
        System.out.println("this is the first one:"+string);
    }
    public static void main(String[] args)
    {
        print1("Skadi!!!");
        print1(114514);               // 这里可以看到我们的main方法调用其他方法是在整个class当中去搜索的
    }
    public static void print1(int num)
    {
        System.out.println("this is the second one:"+num);
    }
//    public static void main(String[] args)
//    {
//        print1("Skadi!!!");             // 我们可以看到哈，这重定义其实就是相当于继承，两种的定义方法都可以走
//        print1(192);
//    }
}
