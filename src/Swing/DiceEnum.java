package Swing;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum DiceEnum {

	NUMBER1("1", "F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\00.jpg"),
	NUMBER2("2", "F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\01.jpg"),
	NUMBER3("3", "F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\02.jpg"),
	NUMBER4("4", "F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\10.jpg"),
	NUMBER5("5", "F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\11.jpg"),
	NUMBER6("6", "F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\12.jpg");

	public String dNumber;
	String img_path;
	Image image;

	private DiceEnum(String dNum, String img_path) {
		this.dNumber = dNum;
		this.img_path = img_path;

		try {
			this.image = ImageIO.read(new File(img_path));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
