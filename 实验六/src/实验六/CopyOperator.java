package สตั้ม๙;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyOperator {
	public static void main(String args[])throws IOException{
		String byteFilename="C:\\mydir\\1.txt";
		String copyFilename="C:\\mydir\\1copy.txt";
		FileInputStream fin=new FileInputStream(byteFilename);
		FileOutputStream fout=new FileOutputStream(copyFilename,false);
		byte[] buffer=new byte[512];
		int count=0;
		do {
			count=fin.read(buffer);
			if(count!=-1) {
				fout.write(buffer);
			}
		}while(count!=-1);
		fin.close();
		fout.close();
		System.out.println("Copyfile from"+byteFilename+"to"+copyFilename);
	}
}
