public class Test1_12 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte ret = (byte)(a + b);
        int ret1 = a + b;


//        int a = 10;
//        long b = 20;
//        //a + b由于是不同类型，编译器就会尝试把int 类型转化成long
//        // 再进行运算，得到的结果是long
//        long ret = a + b;


//        int a = 10;
//        long b = 20;
//        b = a;
//        //long 范围更大，这样的赋值可能导致数字被截断
//        a = b;
//        //(int)表示强制类型转换
//        a = (int)b;


//        double a = 1.1;
//        double b = 1.1;
//        if(a*b == 1.21){
//            System.out.println("相等");
//        }else{
//            System.out.println("不相等");
//        }

//        if(a*b -1.21 <0.00001 && a*b - 1.21> -0.00001){
//            System.out.println("相等");
//        }else{
//            System.out.println("不相等");
//        }
//        System.out.println(a*b);
    }
}
