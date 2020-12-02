package Swing;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S03_JLabel extends JFrame {

	// ��������: ��ư�� �ϳ� �߰��ϰ�, �� ��ư�� ������ �׸��� �ٳ����� ���ϵ��� ��������
	// �� ������ ���� �׸����� ���ư��ϴ�.

	// ��θ� �̿��� ArrayList�� �̸� ImageIcon�� ����� ���´�.
	final static String[] paths = { "F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\Sea_phodo.jpg",
			"F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\podo.jpeg" };

	final static ArrayList<ImageIcon> images = new ArrayList<>();

	static {
		for (String path : paths) {
			setImageIcon(path);
		}

	}

	private static void setImageIcon(String path) {
		try {
			images.add(new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	int curr_image = 0;

	public S03_JLabel() {
		// JLabel : �ؽ�Ʈ, �׸����� ���� �� �ִ� ������Ʈ
//		JLabel label01 = new JLabel("Hello, java gui!!!!!!!!");
		JLabel label02 = new JLabel(images.get(curr_image));
		JButton change_btn = new JButton("Change!");

//		JLabel label02 = new JLabel(
//				new ImageIcon(ImageIO.read(new File("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\Sea_phodo.jpg"))
//						.getScaledInstance(300, 300, Image.SCALE_SMOOTH) // �׸��� ũ�� ����
//				));

//		label01.setBounds(50, 50, 300, 50);
		label02.setBounds(50, 100, 300, 300);

		// label02�� �׵θ� �߰�
		label02.setBorder(BorderFactory.createLineBorder(Color.black, 20, false));
		change_btn.setBounds(150, 400, 100, 50);

		// ������Ʈ���� �۲� ����
//		label01.setFont(new Font("Courier", Font.PLAIN, 20));

		JFrame myframe = this;

		change_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label02.setIcon(images.get(++curr_image % images.size()));
				myframe.getContentPane().setBackground(Color.YELLOW);
			}
		});

//		add(label01);
		add(label02);
		add(change_btn);

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(1000, 100);
		setVisible(true);

	}

	public static void main(String[] args) throws IOException {
		new S03_JLabel();
	}

}
