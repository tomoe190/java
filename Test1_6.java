import java.util.Random;
import java.util.Scanner;

public class Test1_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入猜测的数：");
            int toGuess = scanner.nextInt();
            if(toGuess>num){
                System.out.println("猜大了");
            } else if(toGuess<num){
                System.out.println("猜小了");
            } else{
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
