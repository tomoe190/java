import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException; 
import javazoom.jl.player.Player;
//播放mp3文件
public class MusicPlayer {
	
	public static void main(String[] args) throws JavaLayerException, FileNotFoundException {
		File file = new File("E:\\hchj69\\java\\musicbox\\already.mp3");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream stream = new BufferedInputStream(fis);
		Player player = new Player(stream);
		player.play();
	}
	
}
