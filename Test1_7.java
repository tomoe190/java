import java.sql.SQLOutput;
import java.util.Scanner;

public class Test1_7 {
    public static void main(String[] args) {
//        int result = 0;
//        for (int num = 1; num <= 5; num++) {
//            int factorResult = 1;
//            for (int i = 1; i <= num; i++) {
//                factorResult *=i;
//            }
//            factorResult +=factorResult;
//        }
//        System.out.println(result);


//        int result = 0;
//        for (int num = 1; num <=5; num++) {  //num实参
//            result += factor(num);
//        }
//        System.out.println(result);
//    }
//    //num形参，调用方法时，将实参作为形参的初始值，之后就没有关系了
//    //此处形参的 num 和外面的实参的num没有关联关系
//    //形参的 num 的作用域只是在当前的factorResult之内
//    //形参的名字可以随便起
//    public static int factor(int num) {
//        int factorResult = 1;
//        for (int i = 1; i <=num; i++) {
//            factorResult *= i;
//        }
//        return factorResult;

        //求两个数中的最小值
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入两个数：");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int minValue = min(a,b);
//        System.out.println("最小值是："+minValue);
//    }
//    public static int min(int a, int b) {
//        if(a>b){
//            return b;
//        }else{
//            return a;
//        }


        //打印1-100之间的所有素数
//        printAllPrime(1,100);
//        for (int i = 1; i <= 100; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.println(i+" ");
//            }
//        }
//    }
//    public static void printAllPrime(int begin, int end) {
//            for (int i = begin; i <= end; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean isPrimeNumber(int i) {
//        if(i==1){
//            return false;
//        }
//        for (int j = 2; j <= i - 1; j++) {
//            if (i % j == 0) {
//                return false;
//            }
//        }
//        return true;


        //输出1000-2000之间所有的闰年
        printLeapyear(1000,2000);

    }

    public static int printLeapyear(int begin, int end) {

        return 0;
    }
}
