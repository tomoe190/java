import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Test1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }
    public static int fibonacci(int n) {
        int result = 0;
        if(n==1 || n==2){
            result = 1;
        }
        if(n>=3){
            result=fibonacci(n-1)+fibonacci(n-2);
        }
        return result;
    }


//    public static void main(String[] args) {
//        int result = factorResult(5);
//        System.out.println(result);
//    }
//    public static int factorResult(int num) {
//        int result = 0;
//        for (int i = 1; i <= num; i++) {
//            result+= factor(i);
//        }
//        return result;
//    }
//    public static int factor(int i) {
//        int factorResult = 1;
//        for (int j = 1; j <= i; j++) {
//            factorResult*=j;
//        }
//        return factorResult;
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int result = factor(num);
//        System.out.println(num+"的阶乘是："+result);
//    }
//    public static int factor(int num) {
//        int factorResult = 1;
//        for (int i = 1; i <=num ; i++) {
//            factorResult *=i;
//        }
//        return factorResult;
//    }


//    public static void main(String[] args) {
//        int resultMax2 = max2(10,-20);
//        System.out.println(resultMax2);
//        int resultMax3 = max3(10,20,-30);
//        System.out.println(resultMax3);
//    }
//    public static int max3(int a, int b, int c) {
//        return max2(max2(a,b),c);
//    }
//    public static int max2(int a, int b) {
//        if(a>b){
//            return a;
//        }
//        return b;
//    }


//    public static void main(String[] args) {
//        //有一组数据，只有一个数字是出现一次，
//        // 其他是两次，请找出这个数字。
//        System.out.println(max(12,13));
//        System.out.println(max(1.5,2.5));
//        System.out.println(max(1.5,2.5,12));
//    }
//    public static int max(int a, int b) {
//        return a+b;
//    }
//    public static double max(double a, double b) {
//        return a+b;
//    }
//    public static double max(double a, double b,int c) {
//        return a+b+c;
//    }
}
