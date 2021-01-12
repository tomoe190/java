import java.util.Scanner;

public class Test1_9 {

    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        int count = 0;
        while(num!=0){
            num=num&(num-1);
            count++;
        }
        System.out.println("整数二进制形式中1的个数为："+count);

    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int num = scanner.nextInt();
//        int result = countNumOne(num);
//        System.out.println("整数二进制形式中1的个数为："+result);
//    }
//    public static int countNumOne(int num) {
//        int count = 0;
//        boolean flag = true;
//        while (flag) {
//            if(num%2==1){
//                count++;
//            }
//            num/=2;
//            if(num==0){
//                flag = false;
//            }
//        }
//        return count;
//    }

    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入要打印每一位的数：");
//        int num = scanner.nextInt();
//        printEachDigitOfNumber(num);
//    }

//    public static void printEachDigitOfNumber(int num) {
//        while (num > 0) {
//            int a = num % 10;
//            num /= 10;
//            printEachDigitOfNumber(num);
//            System.out.print(a + "\t");
//        }
//    }

    //输出n*n的乘法口诀表，n由用户输入
//    public static void main(String[] args) {
//        System.out.println("n*n乘法口诀表n值：");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        printMultiplicationTable(n);
//    }
//    public static void printMultiplicationTable(int n) {
//        for (int row = 1; row <=n ; row++) {
//            printCol(row);
//            System.out.println();
//        }
//    }
//    public static void printCol(int row) {
//        for (int col = 1; col <=row ; col++) {
//            System.out.printf("%dx%-2d=%-2d ",col,row,row*col);
//        }
//    }


//    public static void main(String[] args) {
//        login();
//    }
//    public static void login() {
//        String password = "888888";
//        System.out.println("请输入密码：");
//        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        for (i = 0; i <3 ; i++) {
//            String input = scanner.nextLine();
//            if(password.equals(input)){
//               System.out.println("登陆成功。");
//               break;
//           }else{
//               System.out.println("密码输入错误，登陆失败。");
//           }
//        }
//        if(i==3){
//            System.out.println("您已经三次输入错误，程序强制结束。");
//        }
//    }


//    public static void main(String[] args) {
//        //求两个正整数的最大公约数
//        System.out.println("请输入两个数：");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int result = calcGCD(a,b);
//        System.out.println(result);
//    }
//    public static int calcGCD(int a, int b) {
//        int tmp = min(a,b);
//        for (int i = tmp; i >0 ; i--) {
//            if(a%i==0 && b%i==0){
//                return i;
//            }
//        }
//        return 0;
//    }
//    private static int min(int a, int b) {
//        if(a<b){
//            return a;
//        }
//        return b;
//    }


//    public static void main(String[] args) {
//        System.out.println(add(10,20));
//        System.out.println(add(10.5,20.5));
//        System.out.println(add(10,20,30));
//    }
//
//    public static int add(int a,int b){
//        return a+b;
//    }
//    public static double add(double a,double b){
//        return a+b;
//    }
//    public static int add(int a,int b,int c){
//        return a+b+c;
//    }


//    public static void main(String[] args) {
//    //调试观察栈帧变化
//        int result = 0;
//        for (int i = 1; i <=5; i++) {
//            result +=factor(i);
//        }
//        System.out.println(result);
//    }
//
//    public static int factor(int number) {
//        int result = 1;
//        for (int i = 1; i <=number; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
