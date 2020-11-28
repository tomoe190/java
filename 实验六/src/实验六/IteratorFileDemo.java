package สตั้ม๙;

import java.io.File;

public class IteratorFileDemo {
	public static void main(String[]args) {
		File file=new File("C:\\Users");
		
		if(file.exists()) {
			String[] files=file.list();
			for(String fileName:files) {
				System.out.println(fileName);
			}
			
			System.out.println("*************************");
			File[] subFiles=file.listFiles();
			for(File f:subFiles) {
				if(f.isDirectory()){
					System.out.println("|กช"+f.getName());
				}else {
					System.out.println("-"+f.getName());
				}

			}
		}else System.out.println("This is no files and dies!");
	}
}
