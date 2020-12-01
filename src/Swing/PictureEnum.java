package Swing;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum PictureEnum {
	APPLE("»ç°ú", "assets/image/apple.jpg"),
	BANANA("¹Ù³ª³ª", "assets/image/banana.jpg"),
	KIWI("Å°À§", "assets/image/kiwi.jpg"),
	PEACH("º¹¼þ¾Æ", "assets/image/peach.jpg"),
	ORANGE("¿À·»Áö", "assets/image/orange.jpg"),
	PENGUIN("Æë±Ï", "assets/image/Æë±Ï.jpg"),
	ELEPHANT("ÄÚ³¢¸®", "assets/image/ÄÚ³¢¸®.jpg"),
	LION("»çÀÚ", "assets/image/»çÀÚ.jpg");

	String kName;
	String img_path;
	Image image;
	
	private PictureEnum(String kName, String img_path) {
		this.kName = kName;
		this.img_path = img_path;
		try {
			this.image = ImageIO.read(new File(img_path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}