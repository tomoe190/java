package ʵ����;

import java.io.File;
import java.io.IOException;

public class FileCreatAndDelDemo {
	public static void main(String[]args) {
		File file=new File("a,dat");
		File dir=new File("c://mydir");
		System.out.println("�ļ��Ƿ���ڣ�"+file.exists());
		System.out.println("�ļ����Ƿ���ڣ�"+dir.exists());
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		if(!dir.exists()) {
			dir.mkdir();
		}
		System.out.println("�ļ��Ƿ���ڣ�"+file.exists());
		System.out.println("�ļ����Ƿ���ڣ�"+dir.exists());
		System.out.println("�ļ��ľ���·���ǣ�"+file.getAbsolutePath());
		System.out.println("�ļ��еľ���·���ǣ�"+dir.getAbsolutePath());
		
		//file.delete();
		System.out.println("�ļ��Ƿ���ڣ�"+file.exists());
	}

}
