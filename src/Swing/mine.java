package Swing;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import quiz.S02_ImageButtonQuiz;

public class mine extends JFrame{

		
	
//	final BufferedImage source = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\mine.png"));
//	int idx = 0;
//	
//	System.out.println("이미지 전체 너비 : " + source.getWidth());
//	System.out.println("이미지 전체 높이 : " + source.getHeight());
//	
//	for (int y = 0; y < source.getHeight(); y += 32) {
//	    ImageIO.write(source.getSubimage(0, y, 32, 32), "png", new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\temp\\" + idx++ + ".png"));
//	}
	
		ArrayList<JButton> btns;
		final static int image_cols = 3;
		final static int image_rows = 2;

		public mine() {
			btns = new ArrayList<>(image_cols * image_rows);

			try {
				BufferedImage source = ImageIO
						.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\dice\\주사위.jpg"));

				int btn_width = source.getWidth() / image_cols;
				int btn_height = source.getHeight() / image_rows;

				for (int row = 0; row < image_rows; ++row) {
					for (int col = 0; col < image_cols; ++col) {
						Image cropped_image = source.getSubimage(col * btn_width, row * btn_height, btn_width, btn_height);

						JButton btn = new JButton();

						// getScaledInstance로 이미지 크기 조절이 가능하다
						btn.setIcon(
								new ImageIcon(cropped_image.getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
						
						btn.setLocation(col * 32, row * 32);
						btn.setSize(32, 32);
						
						btns.add(btn);
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

			for (JButton btn : btns) {
				add(btn);
			}

			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocation(200, 200);
			setSize(1000, 1000);
			setVisible(true);
		}

		public static void main(String[] args) {
			new mine();
		}
		
		
}
