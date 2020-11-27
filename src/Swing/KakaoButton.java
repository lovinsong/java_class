package Swing;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class KakaoButton extends JButton {

	static BufferedImage source = null;
	static HashMap<KakaoBtnEnum, Image> images;

	final static int SOURCE_IMAGE_COLS = 6;
	final static int SOURCE_IMAGE_ROWS = 2;

	static int SOURCE_IMAGE_WIDTH;
	static int SOURCE_IMAGE_HEIGHT;

	static {
		images = new HashMap<>();

		try {
			source = ImageIO.read(new File("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\kakao.png"));

			SOURCE_IMAGE_WIDTH = source.getWidth() / SOURCE_IMAGE_COLS;
			SOURCE_IMAGE_HEIGHT = source.getHeight() / SOURCE_IMAGE_ROWS;

			KakaoBtnEnum[] enums = KakaoBtnEnum.values();

			int i = 0;

			for (int row = 0; row < SOURCE_IMAGE_ROWS; ++row) {
				for (int col = 0; col < SOURCE_IMAGE_COLS; ++col) {
					images.put(enums[i++], source.getSubimage(col * SOURCE_IMAGE_WIDTH, row * SOURCE_IMAGE_HEIGHT,
							SOURCE_IMAGE_WIDTH, SOURCE_IMAGE_HEIGHT));
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	KakaoBtnEnum type;

	// KakaoButton�� �����ڰ� ����ǰ���
	// JButton �ν��Ͻ��� �����ϰ� �ִ� KakaoButton �ν��Ͻ��� �����ȴ�
	public KakaoButton(KakaoBtnEnum type) {
		this.type = type;
		setSize(100);
	}
	
	public KakaoButton(KakaoBtnEnum type, int size) {
		this.type = type;
		setSize(size);
	}

	private void setSize(int size) {
		super.setSize(size, size);

		// Enum�� ������ Ÿ�Կ� ���� �̹����� ���� ����� �缳���Ͽ� ���������� ����
		super.setIcon(new ImageIcon(images.get(type).getScaledInstance(
				size, size, Image.SCALE_SMOOTH)));
	}
	
	
}
