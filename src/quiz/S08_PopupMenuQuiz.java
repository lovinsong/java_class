package quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import Swing.mouse.evt.RightClickShowPopup;

public class S08_PopupMenuQuiz extends JFrame {

	// ȭ�鿡 5���� �ֻ����� ����
	// �˾��޴�, �޴���, ��ư�� REROLL����� �޾ƺ�����

	// ������� �ִ� REROLL�� ������ ���� �ֻ����� ���ؾ� �մϴ�.

	JMenu menu = new JMenu("�ֻ���");
	JMenuBar bar = new JMenuBar();
	JPopupMenu popup = new JPopupMenu();
	JMenuItem popup_item_reroll = new JMenuItem("reroll");
	JPanel dice_panel = new JPanel(new GridLayout(1, 5, 5, 5));
	
	public S08_PopupMenuQuiz() {

		for (int i = 0; i < 5; ++i) {
			JButton dice = new JButton("dice" + i);
			dice.setSize(100, 100);
			dice.addMouseListener(new RightClickShowPopup(popup, dice));

			dice_panel.add(dice);
		}
		
		dice_panel.addMouseListener(new RightClickShowPopup(popup, dice_panel));

		JButton reroll_btn = new JButton("�ٽ� ������");

		add(dice_panel, BorderLayout.CENTER);
		add(reroll_btn, BorderLayout.SOUTH);

//		addComponentListener(new ComponentAdapter() {
//			@Override
//			public void componentResized(ComponentEvent e) {
//				System.out.println("���� ���γʺ� : " + f.getWidth());
//				System.out.println("���� ���γʺ� : " + f.getHeight());
//			}
//		});

		popup.add(popup_item_reroll);
		menu.add(popup_item_reroll);// ��ġ �߿�

		bar.add(menu);
		setJMenuBar(bar);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 100);
		setSize(500, 180);
		setVisible(true);

	}

//	final static String[] paths = { "F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\dice\\00.jpg",
//			"F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\dice\\01.jpg",
//			"F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\dice\\02.jpg",
//			"F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\dice\\10.jpg",
//			"F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\dice\\11.jpg",
//			"F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\dice\\12.jpg" };
//
//	final static ArrayList<ImageIcon> images = new ArrayList<>();
//
//	static {
//		for (String path : paths) {
//			setImageIcon(path);
//		}
//	}
//
//	private static void setImageIcon(String path) {
//		try {
//			images.add(new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	int temp = 0;
//
//	public S08_PopupMenuQuiz() {
//
//		JMenuBar bar = new JMenuBar();
//		JMenu menu = new JMenu("�޴�");
//
//		JMenuItem i1 = new JMenuItem("�ֻ��� 5�� Shuffle");
//		menu.add(i1);
//
//		JButton button1 = new JButton("Shuffle!!");
//
//		button1.setBounds(250, 350, 300, 200);
//
//		JLabel label01 = new JLabel(images.get(temp));
//		JLabel label02 = new JLabel(images.get(temp));
//		JLabel label03 = new JLabel(images.get(temp));
//		JLabel label04 = new JLabel(images.get(temp));
//		JLabel label05 = new JLabel(images.get(temp));
//
//		i1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Collections.shuffle(images);
//				label01.setIcon(images.get(++temp % images.size()));
//				label02.setIcon(images.get(++temp % images.size()));
//				label03.setIcon(images.get(++temp % images.size()));
//				label04.setIcon(images.get(++temp % images.size()));
//				label05.setIcon(images.get(++temp % images.size()));
//			}
//		});
//
//		JPopupMenu popup = new JPopupMenu("Edit");
//		JMenuItem reroll = new JMenuItem("�ֻ��� ������");
//		popup.add(reroll);
//
//		reroll.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Collections.shuffle(images);
//				label01.setIcon(images.get(++temp % images.size()));
//				label02.setIcon(images.get(++temp % images.size()));
//				label03.setIcon(images.get(++temp % images.size()));
//				label04.setIcon(images.get(++temp % images.size()));
//				label05.setIcon(images.get(++temp % images.size()));
//			}
//		});
//
//		JFrame f = this;
//		addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//				// e.getButton() : ��� ���콺 ��ư�� ���ȴ��� ��ȣ�� �˷��ش�
//				if (e.getButton() == MouseEvent.BUTTON3) {
//					int x = e.getX();
//					int y = e.getY();
//					popup.show(f, x, y);
//				}
//			}
//		
//		});
//		
//		
//		ActionListener basic_btn_action = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				label01.setIcon(images.get(++temp % images.size()));
//				label02.setIcon(images.get(++temp % images.size()));
//				label03.setIcon(images.get(++temp % images.size()));
//				label04.setIcon(images.get(++temp % images.size()));
//				label05.setIcon(images.get(++temp % images.size()));
//			}
//		};
//
//		label01.setBounds(50, 100, 300, 300);
//		label02.setBounds(150, 100, 300, 300);
//		label03.setBounds(250, 100, 300, 300);
//		label04.setBounds(350, 100, 300, 300);
//		label05.setBounds(450, 100, 300, 300);
//
//		add(label01);
//		add(label02);
//		add(label03);
//		add(label04);
//		add(label05);
//
//		button1.addActionListener(basic_btn_action);
//
//		add(button1);
//		setLayout(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(800, 800);
//		setLocation(600, 100);
//
//		bar.add(menu);
//		setJMenuBar(bar);
//		setVisible(true);
//
//	}

	public static void main(String[] args) {
		new S08_PopupMenuQuiz();
	}
}