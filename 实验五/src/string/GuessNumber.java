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
		
		System.out.println("������һ��0~100�����֣�");
		while (times>0) {
			guessNum=scan.nextInt();
			if(guessNum==number) {
				System.out.println("��ϲ�����¶��ˡ�ʵ�������ǣ�"+number);
				System.exit(0);
			}
			if(guessNum>number) {
				System.out.println("�Բ��𣬲´��ˡ�");
			}
			if(guessNum<number) {
				System.out.println("�Բ��𣬲�С�ˡ�");
			}
			times--;
		}
		System.out.println("�Բ������Ļ����Ѿ����ꡣ����ֵ�ǣ�"+number);
		scan.close();
		System.exit(0);
	}
}