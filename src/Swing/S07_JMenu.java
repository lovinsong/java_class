package Swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Swing.btn.actions.ShowCardAction;

public class S07_JMenu extends JFrame {

	public S07_JMenu() {

		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("�޴�");
//		JMenu sub_menu = new JMenu("����");

		SwingTools.initTestFrame(this);
		
//		JMenuItem i1, i2, i3, i4, i5;
//		JMenuItem si1, si2, si3;
//
//		// �� �޴��� �����ϸ� ī�� ���̾ƿ��� ������ �ٲ�� ��������
//		i1 = new JMenuItem(PictureEnum.APPLE.kName);
//		i2 = new JMenuItem(PictureEnum.BANANA.toString());
//		i3 = new JMenuItem("Ű��");
//		i4 = new JMenuItem("������");
//		i5 = new JMenuItem("������");
//
//		si1 = new JMenuItem("���");
//		si2 = new JMenuItem("�ڳ���");
//		si3 = new JMenuItem("����");
//
//		menu.add(i1);
//		menu.add(i2);
//		menu.add(i3);
//		menu.add(i4);
//		menu.add(i5);
//		menu.add(sub_menu); // �߰��� ���� �߰��� ����
//		sub_menu.add(si1);
//		sub_menu.add(si2);
//		sub_menu.add(si3);
//		bar.add(menu);
		
		
		
		this.setJMenuBar(bar);
		SwingTools.initTestFrame(this);
		
		setLayout(new BorderLayout());
		
		JPanel center_panel = new JPanel();
		JLabel pic_label = new JLabel("�׸��� �����״�");
		
		center_panel.setLayout(new CardLayout(20, 20));
		
		for(PictureEnum picname : PictureEnum.values()) {
			center_panel.add(picname.kName, new PictureLabel(picname));//ó�� ������ �̸��� ����ؾ���

			JMenuItem item = new JMenuItem(picname.kName);
			item.addActionListener(new ShowCardAction(center_panel, pic_label, picname.kName));
			menu.add(item);
			menu.addSeparator();
		}
		
		bar.add(menu);
		setJMenuBar(bar);
		add(center_panel, BorderLayout.CENTER);
		add(pic_label, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new S07_JMenu();
	}

}
