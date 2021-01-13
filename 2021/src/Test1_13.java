public class Test1_13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);

//        int num = 10;
//        String str = Integer.toString(num);


//        String str = "100";
//        int num = Integer.parseInt(str);
//        //prase 解析
//        System.out.println(num);
        //包装类，用类的形式包装内置类型，这样在类中
        //可以给它提供一些更具体的属性和方法
        //包装类型有内置类型于其对应
        //每个内置类型都有一个与之对应的包装类
//        int num = 10;
//        String ret = String.valueOf(num);
//        System.out.println(ret);
//        String ret2 = "" + num;
//        System.out.println(ret2);


//        String str = "hello ";
//        int num1 = 10;
//        int num2 = 20;
//        String ret = str + num1 + num2;
//        System.out.println(ret);
    }
}
