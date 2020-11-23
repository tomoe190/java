package string;
import java.util.Scanner;
import java.util.*;
public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rm=new Random();
		int number=rm.nextInt(100);
		int times=10;
		int guessNum=0;
		
		System.out.println("请输入一个0~100的数字：");
		while (times>0) {
			guessNum=scan.nextInt();
			if(guessNum==number) {
				System.out.println("恭喜您，猜对了。实际数字是："+number);
				System.exit(0);
			}
			if(guessNum>number) {
				System.out.println("对不起，猜大了。");
			}
			if(guessNum<number) {
				System.out.println("对不起，猜小了。");
			}
			times--;
		}
		System.out.println("对不起，您的机会已经用完。该数值是："+number);
		scan.close();
		System.exit(0);
	}
}