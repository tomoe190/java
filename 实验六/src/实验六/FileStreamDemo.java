package 实验六;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) throws IOException  {
		File file=new File("FileStreamDemo.txt");
		File dir=new File("c://mydir");
		System.out.println("文件夹是存在："+file.exists());
		System.out.println("文件夹否存在："+dir.exists());
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
					System.out.println("文件开始标记设置成功！");
				}else {
					System.out.println("流对象不支持标记设置！");
				}
				int data=-1;
				System.out.println("文件输入流读取开始：");
				while(-1!=(data=fis.read())) {
					System.out.println((char)data+" ");
				}
				System.out.println("\n文件输入流读取结束！");
				
				String writeLine="This is the first time to write!";
				fos.write(writeLine.getBytes());
				fos.flush();
				
				System.out.println("文件输入流读取开始：");
				while(-1!=(data=fis.read())){
					System.out.print((char)data+" ");
				}
				System.out.println("\n文件输入流读取结束！");
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	
}
