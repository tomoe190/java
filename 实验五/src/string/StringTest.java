package string;
public class StringTest {
	public static void main(String arg[]) {
		String s="This is a demo of the java";
		System.out.println("�ַ������ȣ�"+s.length());
		System.out.println("�ַ������8��λ�õ��ַ��ǣ�"+s.charAt(8));
		System.out.println("��8���ַ���������ַ����ǣ�"+s.substring(8));
		System.out.println("8��15֮������ַ����ǣ�"+s.substring(8,15));
		System.out.println("�����ַ����Ƿ���He��ͷ��"+s.startsWith("He"));
		System.out.println("���ַ���ȫ��ת��λСд�ַ���"+s.toLowerCase());
		System.out.println("h��һ�γ��ֵ�λ���ǣ�"+s.indexOf('h'));
		System.out.println("h���һ�γ��ֵ�λ���ǣ�"+s.lastIndexOf('h'));
	}
}