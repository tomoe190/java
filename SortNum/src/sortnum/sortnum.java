package sortnum;
import java.util.Random;
public class sortnum {
	public static void main(String[] args) {
		int[] arr = new int[10]; // ����һ�����Ǹ����ֵ�����
		Random rm = new Random(); // ��ʼ��������Ķ���
		System.out.print("[");
		for (int i = 0 ; i < 10 ; i++) {
			arr[i] = rm.nextInt(100); // ��100�������ѡ��һ������
			System.out.print(arr[i]+" "); // ��ӡ��������i�����ֵ�ֵ
		}
		System.out.print("]\n"); 
		int temp = 0 ; // ��ʱ����
		int len = arr.length ;
		// �������������Ĭ��ÿ�����ұߵ����ֶ����������������
		for (int j = len - 1; j > 0  ; j--) {
			// �������ұ�������δ����������е�����������͵�ʣ����������ұ�
			for (int i = 0 ; i <= j - 1 ; i++) {
				if (arr[i] > arr[i+1]) { // �����ߵ�ֵ���ұߵ�ֵ���򽻻����ߵ�λ��
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			// ÿ��ѭ������������һ�����������͵��Ҳ࣬����С������������
		}
		// ��ӡ�������������
		System.out.print("[");
		for (int i : arr) {
			if(i==arr.length-2)
		{
			System.out.print(i);
		}else {
			System.out.print(i+",");
		}
		}System.out.print("]");
		
	}
	}