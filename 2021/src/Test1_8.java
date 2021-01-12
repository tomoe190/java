import java.util.Random;
import java.util.Scanner;

public class Test1_8 {

//    public static void main(String[] args) {
//        Login();
//    }
//    public static void Login() {
//        String password = "123456";
//        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//
//        for (i = 0; i < 3; i++) {
//            System.out.println("请输入您的密码：");
//            String input = scanner.next();
//            if(input.equals(password)){
//                System.out.println("登陆成功");
//                break;
//            }else{
//                System.out.println("登陆失败");
//            }
//        }
//
//        if(i == 3){
//            System.out.println("您已3次输入错误，程序强制终止。");
//        }
//    }

//    public static void main(String[] args) {
//        //猜数字游戏
//        guessNumberGame();
//    }
//    public static void guessNumberGame() {
//        while(true){
//            int choice = menu();
//            if(choice == 1){
//                game();
//            }else if(choice == 0){
//                System.out.println("白白~");
//                break;
//            }else{
//                System.out.println("输入错误，请重试...");
//            }
//        }
//    }
//    public static void game() {
//        //1、生成随机数
//        Random random = new Random();
//        int toGuess = random.nextInt(100)+1;
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("请输入你猜测的数：");
//            int num = scanner.nextInt();
//            if(num>toGuess){
//                System.out.println("猜大了");
//            }else if(num<toGuess){
//                System.out.println("猜小了");
//            }else {
//                System.out.println("恭喜你，猜对了！");
//                break;
//            }
//        }
//    }
//    public static int menu() {
//        System.out.println("***********************");
//        System.out.println("  1、play      0、exit  ");
//        System.out.println("***********************");
//        System.out.println("请输入您的选择：");
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        return choice;
//    }


//    public static void main(String[] args) {
//        //求出0～999之间的所有“水仙花数”并输出
//        printNarcissusNum(0,999);
//    }
//    public static void printNarcissusNum(int begin, int end) {
//        for (int i = begin; i <=end ; i++) {
//            if(isNarcissusNum(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean isNarcissusNum(int i) {
//        if (result(i) == i){
//            return true;
//        }
//        return false;
//    }
//    public static int result(int number) {
//        int result = 0;
//        while (number>0){
//            int a =number%10;
//            result+=a*a*a;
//            number/=10;
//        }
//        return result;
//    }


//    public static void printNarcissusNum(int begin, int end) {
//        for (int i = begin; i <=end ; i++) {
//            if(isNarcissusNum(i)){
//                System.out.print(i+"  ");
//            }
//        }
//    }
//    public static boolean isNarcissusNum(int number) {
//        int ge=number%10;
//        int tmp=number/10;
//        int shi=tmp%10;
//        tmp=number/100;
//        int bai=tmp%10;
//        if((cube(ge)+cube(shi)+cube(bai))==number){
//            return true;
//        }
//        return false;
//    }
//    public static int cube(int i) {
//        return i*i*i;
//    }
}
