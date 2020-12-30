
package mymodel;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class ModleClass {
	//获取随机音频文件 
   public  String[] getRandomFiles(File filedir){       
       
     
       File[] files=filedir.listFiles();
       if (files.length==0) {
    	 
 		   System.out.println("该文件夹没有 文件,请重新选择.....已退出.");
 		
  		   System.exit(0);   
       }
       
        String[] filename=new String[files.length+1];
        int [] oldArr = new int[files.length];
        int [] newArr = new int[files.length];
        for(int i = 0;i<files.length;i++) {
	   oldArr[i] = i+1;			
        }
        int end = files.length;    
        for (int i=0;i<files.length;i++){
             int num = new Random().nextInt(end);			
	         newArr[i] = oldArr[num];
	         oldArr[num] = oldArr[end-1];
	         end--;	    
	         filename[newArr[i]]=files[i].getName();
        }
       return filename;
       
    } 
   //读取MP3文件
   public void playmp3(String mp) {  //throws JavaLayerException, FileNotFoundException 
       File file = new File(mp);
		FileInputStream fi;
		Player player;
		try {
			fi = new FileInputStream(file);
			BufferedInputStream stream = new BufferedInputStream(fi);
			player = new Player(stream);
			player.play();
		} catch (JavaLayerException e) {
			
			e.printStackTrace();	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
   }
   //文件播放
   public void play(String[] filenames,String dir) throws InterruptedException, IOException, LineUnavailableException, UnsupportedAudioFileException {

	   for (int i=1;i<filenames.length;i++){
 
	        String audiofile=filenames[i].substring(filenames[i].length()-3);		
	         if("mp3".equals(audiofile)){
	        	 this.playmp3(dir+"\\"+filenames[i]);
	             Thread.sleep(1500);
	             System.out.println("filename["+i+"]="+filenames[i]+"  ");
	         }
	         else if ("wav".equals(audiofile)){
	        	  new playWav(dir+"\\"+filenames[i]).play();
	         
	             System.out.println("filename["+i+"]="+filenames[i]+"  ");
	         }   
	         else{
	            System.out.println(""+filenames[i]+"is not audio file");
	                 continue;
	          }
      }   
   }
   //读取磁盘文件并随机化
   public  String[] readFiles(String dir) {
	   File filedirs= new File(dir);
	   if(!filedirs.exists()) {
		   filedirs.mkdir();
		   System.out.println("这是一个新文件夹，请先放入MP3 文件,再运行.....已退出.");
		   System.exit(0);
	   }
	 //  ModleClass mc=new ModleClass();
	  
	   String[] filenames=this.getRandomFiles(filedirs);
	   //System.out.println(filenames.length);
//	   if (filenames.length==0) {
//		   System.out.println("该文件夹没有 文件,请重新选择......");
//		   //scan.close();
//		   System.exit(0);
//			}
	for (String filename:filenames) {        //遍历音频文件
		System.out.println(filename);
	}
	   return filenames;
   }
}
   
    

