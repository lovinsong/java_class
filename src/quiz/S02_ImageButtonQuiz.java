package quiz;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// kakao1.png를 이용해 12개의 버튼을 생성해 보세요	

public class S02_ImageButtonQuiz extends JFrame {

	ArrayList<JButton> btns;
	final static int image_cols = 6;
	final static int image_rows = 2;

	public S02_ImageButtonQuiz() {
		btns = new ArrayList<>(image_cols * image_rows);

		try {
			BufferedImage source = ImageIO
					.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\kakao.png"));

			System.out.println("이미지 전체 너비 : " + source.getWidth());
			System.out.println("이미지 전체 높이 : " + source.getHeight());

			System.out.println("각 이미지 너비 : " + source.getWidth() / image_cols);
			System.out.println("각 이미지 높이 : " + source.getHeight() / image_rows);

			int btn_width = source.getWidth() / image_cols;
			int btn_height = source.getHeight() / image_rows;

			for (int row = 0; row < image_rows; ++row) {
			for (int col = 0; col < image_cols; ++col) {
					Image cropped_image = source.getSubimage(col * btn_width, row * btn_height, btn_width, btn_height);

					JButton btn = new JButton();
					// 버튼 사이즈 구하기
//					int randomSize = (int) (Math.random() * 31 + 50);
//					int random_x = (int) (Math.random() * (1000 - randomSize * 2));
//					int random_y = (int) (Math.random() * (1000 - randomSize * 2));
//
////					btn.setSize(btn_width,btn_height);
//					btn.setBackground(new Color(0x8affe8));
//					btn.setSize(randomSize, randomSize);
//					btn.setLocation(random_x, random_y);

					// getScaledInstance로 이미지 크기 조절이 가능하다
					btn.setIcon(
							new ImageIcon(cropped_image.getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

					
					btn.setLocation(col * 100, row * 100);
					btn.setSize(100, 100);
					
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
		new S02_ImageButtonQuiz();
	}
}

//	public S02_ImageButtonQuiz() throws IOException {
//
//
//		BufferedImage objectImage1 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\00.png"));
//		BufferedImage objectImage2 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\01.png"));
//		BufferedImage objectImage3 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\02.png"));
//		BufferedImage objectImage4 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\03.png"));
//		BufferedImage objectImage5 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\04.png"));
//		BufferedImage objectImage6 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\10.png"));
//		BufferedImage objectImage7 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\11.png"));
//		BufferedImage objectImage8 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\12.png"));
//		BufferedImage objectImage9 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\13.png"));
//		BufferedImage objectImage10 = ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\14.png"));
//		
//		JButton button1 = new JButton(new ImageIcon(objectImage1));
//		JButton button2 = new JButton(new ImageIcon(objectImage2));
//		JButton button3 = new JButton(new ImageIcon(objectImage3));
//		JButton button4 = new JButton(new ImageIcon(objectImage4));
//		JButton button5 = new JButton(new ImageIcon(objectImage5));
//		JButton button6 = new JButton(new ImageIcon(objectImage6));
//		JButton button7 = new JButton(new ImageIcon(objectImage7));
//		JButton button8 = new JButton(new ImageIcon(objectImage8));
//		JButton button9 = new JButton(new ImageIcon(objectImage9));
//		JButton button10 = new JButton(new ImageIcon(objectImage10));
//		
//			
//		button1.setBounds(101, 101, 100, 100);
//		button2.setBounds(201, 101, 100, 100);
//		button3.setBounds(301, 101, 100, 100);
//		button4.setBounds(401, 101, 100, 100);
//		button5.setBounds(501, 101, 100, 100);
//		button6.setBounds(101, 201, 100, 100);
//		button7.setBounds(201, 201, 100, 100);
//		button8.setBounds(301, 201, 100, 100);
//		button9.setBounds(401, 201, 100, 100);
//		button10.setBounds(501, 201, 100, 100);
//				
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);
//		add(button6);
//		add(button7);
//		add(button8);
//		add(button9);
//		add(button10);
//		
//		
//		setLayout(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//		this.setLocation(200, 200);
//		this.setSize(700, 400);
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) throws IOException, InterruptedException {
//
//		new S02_ImageButtonQuiz();
//
//	}
