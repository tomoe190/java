package string;
public class StringBufferTest {
	public static void main(String arg[]) {
		StringBuffer sb=new StringBuffer("����ѧϰjava���ԣ���");
		System.out.println("ԭ�ַ����ǣ�:"+sb);
		System.out.println("ԭ�ַ���������:"+sb.length());
		System.out.println("��Ӻ���ַ�����:"+sb.append("ѧʱ��"));
		System.out.println("�������ַ�����:"+sb.insert(8,"�������"));
		System.out.println("�������ֺ���ַ�����:"+sb.insert(16,60));
		System.out.println("�滻����ַ�����:"+sb.replace(0,1,"��ѧ��"));
		System.out.println("ɾ������ַ�����:"+sb.deleteCharAt(16));
		System.out.println("�������к���ַ�����:"+sb.reverse());
		System.out.println("������ַ�����:"+sb);
	}
}
