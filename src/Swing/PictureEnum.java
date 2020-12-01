package Swing;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum PictureEnum {
	APPLE("���", "assets/image/apple.jpg"),
	BANANA("�ٳ���", "assets/image/banana.jpg"),
	KIWI("Ű��", "assets/image/kiwi.jpg"),
	PEACH("������", "assets/image/peach.jpg"),
	ORANGE("������", "assets/image/orange.jpg"),
	PENGUIN("���", "assets/image/���.jpg"),
	ELEPHANT("�ڳ���", "assets/image/�ڳ���.jpg"),
	LION("����", "assets/image/����.jpg");

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