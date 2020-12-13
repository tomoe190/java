import java.util.Random;
import java.util.Scanner;

public class Test12_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int toGuess=random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的数：");
            int num=scanner.nextInt();
            if(num<toGuess){
                System.out.println("猜小了。");
            }else if(num>toGuess){
                System.out.println("猜大了。");
            }else{
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
