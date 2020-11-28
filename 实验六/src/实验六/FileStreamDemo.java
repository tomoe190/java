package ʵ����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) throws IOException  {
		File file=new File("FileStreamDemo.txt");
		File dir=new File("c://mydir");
		System.out.println("�ļ����Ǵ��ڣ�"+file.exists());
		System.out.println("�ļ��з���ڣ�"+dir.exists());
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		try(FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream(file)){
				if(fis.markSupported()) {
					fis.mark(1000);
					System.out.println("�ļ���ʼ������óɹ���");
				}else {
					System.out.println("������֧�ֱ�����ã�");
				}
				int data=-1;
				System.out.println("�ļ���������ȡ��ʼ��");
				while(-1!=(data=fis.read())) {
					System.out.println((char)data+" ");
				}
				System.out.println("\n�ļ���������ȡ������");
				
				String writeLine="This is the first time to write!";
				fos.write(writeLine.getBytes());
				fos.flush();
				
				System.out.println("�ļ���������ȡ��ʼ��");
				while(-1!=(data=fis.read())){
					System.out.print((char)data+" ");
				}
				System.out.println("\n�ļ���������ȡ������");
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	
}
