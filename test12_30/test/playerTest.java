package test;
//音频文件随机播放器（mp3和wav格式)
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import mymodel.ModleClass;


public class playerTest {
	File filedirs;
     String   dir;
     String[] filenames;
     ModleClass mc;
  
	public static void main(String[] args) throws InterruptedException, IOException, LineUnavailableException, UnsupportedAudioFileException {
		   // String quit="quit";
			System.out.println("请输入一个文件夹及其路径(输入quit 退出：)"); //输入一个文件夹  e.g   c:/mp3	
	    
		   Scanner scan=new Scanner(System.in);
	   	   String dir=scan.nextLine();
	   	if(dir.equals("quit")){
			scan.close();
			System.out.println("已退出,BYE!");
			System.exit(0);
	   	}
//获取文件夹下的音频文件并随机化	 
//		   File filedirs= new File(dir);
//		   if(!filedirs.exists()) {
//			   filedirs.mkdir();
//			   System.out.println("这是一个新文件夹，请先放入MP3 文件：");	
//		   }
//		   ModleClass mc=new ModleClass();
//		  
//		   String[] filenames=mc.getRandomFiles(filedirs);
//		   //System.out.println(filenames.length);
//		   if (filenames.length==1) {
//			   System.out.println("该文件夹没有MP3 文件");
//			   scan.close();
//				}
//		for (String filename:filenames) {        //遍历音频文件
//			System.out.println(filename);
//		}
//播放音频文件
//		for (int i=1;i<filenames.length;i++){
//	                        
//	        String audiofile=filenames[i].substring(filenames[i].length()-3);		
//	         if("mp3".equals(audiofile)){
//	        	 mc.wordsplay(dir+"\\"+filenames[i]);
//	             Thread.sleep(1500);
//	             System.out.println("filename["+i+"]="+filenames[i]+"  ");
//	         }
//	         else if ("wav".equals(audiofile)){
//	        	  new playWav(dir+"\\"+filenames[i]).play();
//	         
//	             System.out.println("filename["+i+"]="+filenames[i]+"  ");
//	         }   
//	         else{
//	            System.out.println(""+filenames[i]+"is not audio file");
//	                 continue;
//	          }
//       }
	   ModleClass mc=new ModleClass();  
	   	String[] filenames= mc.readFiles(dir); //读取磁盘音频文件并随机化

	   mc.play(filenames,dir);  //播放音频文件
		System.out.println("OK!");
		System.out.println("请输入一个文件夹及其路径(输入quit 退出)：");
		while(scan.hasNext()) {
			if(dir.equals("quit")){
				scan.close();
				System.out.println("已退出,BYE!");
				System.exit(0);
				
			}else {
				 
			
				String dirs=scan.next();
				if(dirs.equals("quit")){
					scan.close();
					System.out.println("已退出,BYE!");
					System.exit(0);
					
				}
				ModleClass mcc=new ModleClass(); 
				String[] filenamess= mcc.readFiles(dirs); //读取磁盘音频文件并随机化
			    mcc.play(filenamess,dirs); 
				System.out.println("O0K!");
				System.out.println("请输入一个文件夹及其路径(输入quit 退出)：");
			}
		}
		scan.close();	
	}
}