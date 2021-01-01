import java.util.Random;
import java.util.Scanner;

public class Test12_31 {
    public static void main(String[] args) {
       //求两个正整数的最大公约数
//        Random random=new Random();
//        int toGuess=random.nextInt(100)+1;
//        Scanner scanner=new Scanner(System.in);
//        while(true){
//            System.out.println("请输入猜测的数：");
//            int num=scanner.nextInt();
//            if(num<toGuess){
//                System.out.println("猜小了。");
//            }
//            else if(num>toGuess){
//                System.out.println("猜大了。");
//            }
//            else{
//                System.out.println("你猜对了！");
//                break;
//            }
//        }

        //阶乘求和
//        int result=0;
//        for (int num = 1; num <=5; num++) {
//            int factorResult=1;
//            for (int j = 1; j <=num; j++) {
//                factorResult*=j;
//            }
//            result+=factorResult;
//        }
//        System.out.println(result);
        int result=0;
        for (int num = 1; num <=5; num++) {
            result+=factor(num);
        }
        System.out.println(result);
    }

    public static int factor(int num) {
        int result=1;
        for (int i = 1; i <=num; i++) {
            result*=i;
        }
        return result;
    }
}