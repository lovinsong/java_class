package Swing;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JigsawImage {

	public static void main(String[] args) {
	try {
			
		//Provide number of rows and column
		int row = 2;
		int col = 3;
		
		BufferedImage originalImgage = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\주사위.jpg"));
		
		//total width and total height of an image
		int tWidth = originalImgage.getWidth();
		int tHeight = originalImgage.getHeight();

		System.out.println("Image Dimension: " + tWidth + "x" + tHeight);
		
		//width and height of each piece
		int eWidth = tWidth / col;
		int eHeight = tHeight / row;

		int x = 0;
		int y = 0;

		for (int i = 0; i < row; i++) {
			y = 0;
			for (int j = 0; j < col; j++) {
				try {
					System.out.println("creating piece: "+i+" "+j);
					
					BufferedImage SubImgage = originalImgage.getSubimage(y, x, eWidth, eHeight);
					File outputfile = new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\"+i+j+".jpg");
					ImageIO.write(SubImgage, "png", outputfile);
					
					y += eWidth;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			x += eHeight;
		}

	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}