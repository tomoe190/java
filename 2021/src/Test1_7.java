import javax.imageio.stream.ImageInputStream;

public class Test1_7 {
//    public static void main(String[] args) {
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
//    }

//    public static int min(int a, int b) {
//        if (a > b) {
//            return b;
//        }
//        return a;
//    }


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


//        //输出1000-2000之间所有的闰年
//        printLeapYear(1000,2000);
//    }
//    public static void printLeapYear(int begin, int end) {
//        for (int i = begin; i <= end; i++) {
//            if(isLeapYear(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean isLeapYear(int year) {
//        if(year%100==0){
//            if(year%400==0){
//                return true;
//            }
//            return false;
//        }else(year%4==0){
//            return true;
//        }
//        return false;

        //打印乘法口诀表
//        printMultiplicationTable(9);
//    }
//    public static void printMultiplicationTable(int num) {
//        for (int row = 1; row <= num; row++) {
//            printLine(row);
//        }
//    }
//    public static void printLine(int row) {
//        for (int col = 1; col <=row; col++) {
////            System.out.print(col+"X"+row+"="+row*col+"  ");
//            System.out.printf("%dx%d=%-2d ",col,row,col*row);
//        }//                           至少两位，如果是一位数就空一位
//        System.out.println();


        //求两个整数的最大公约数
//        public static void main(String[] args) {
//            int result = calcGCD(100,120);
//            System.out.println(result);
//        }
//    public static int calcGCD(int a, int b) {
//        int min=min(a,b);
//        for (int i = min; i >0; i--) {
//            if(isGCD(a,b,i)){
//                return i;
//            }
//        }
//        return 0;
//    }
//    public static boolean isGCD(int a, int b, int i) {
//        if(a%i==0 && b%i==0){
//            return true;
//        }
//        return false;
//    }

//    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
//    public static void main(String[] args) {
//        int count = calcNine(1,100);
//        System.out.println(count);
//    }
//    public static int calcNine(int begin, int end) {
//        int count =0;
//        for (int i = begin; i <=end; i++) {
//            count +=result(i);
//        }
//        return count;
//    }
//    public static int result(int number) {
//        int count =0;
//        if(number%10==9){
//            count++;
//        }
//        if(number/10%10==9){
//            count++;
//        }
//        while (number >= 9) {
//            if(number%10==9){
//                count++;
//            }
//            number/=10;
//        }
//        return count;
//    }
}
