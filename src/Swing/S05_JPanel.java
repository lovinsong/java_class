package Swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Swing.btn.actions.FirstBtnAction;
import Swing.btn.actions.LastBtnAction;
import Swing.btn.actions.NextBtnAction;
import Swing.btn.actions.PreviBtnAction;

public class S05_JPanel extends JFrame {

	ArrayList<JButton> btns = new ArrayList<>(25);

	{
		for (int i = 1; i <= 25; i++) {
			btns.add(new JButton("Button " + i));

		}
	}

	public S05_JPanel() {
		SwingTools.initTestFrame(this);

		// # JPanel
		// - ������ ���� �߰��� ���� �� �ִ� �����̳�
		// - �����̳� ������ �ϴ� ������Ʈ
		Container c = this.getContentPane();

		JPanel south_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JPanel center_panel = new JPanel(new CardLayout(10, 10));

		JButton next_btn = new JButton("����");
		next_btn.addActionListener(new NextBtnAction(center_panel));

		JButton first_btn = new JButton("ó������");
		first_btn.addActionListener(new FirstBtnAction(center_panel)); 


		JButton last_btn = new JButton("����������");
		last_btn.addActionListener(new LastBtnAction(center_panel));


		JButton prev_btn = new JButton("��������");
		prev_btn.addActionListener(new PreviBtnAction(center_panel));

		// # MVC ����
		
		//	1. Model 
		//		�����͸� �����ų� ������ �� ����ϴ� Ŭ�������� ���� ��Ī�ϴ� ��
		//		�ַ�, �������� ���¸� �����ϴ� Ŭ������ ���Ѵ�.
		//	2. View
		//		����ڿ��� ������ ȭ���� �����ϴ� Ŭ�������� ���� ��Ī�ϴ� ��
		//	3. Controller
		//		������� �Է��� ó���ϴµ� �ʿ��� Ŭ�������� ���� ��Ī�ϴ� ��
		//		(1) ����Ͻ� ���� 
		//			- ����Ͻ����� �޶����� ó������ ����Ͻ� �����̶�� �Ѵ�
		//		(2) DAO(Data Access Object)
		//			- ������ ���̽�(�Ǵ� ���� �ý���)�� �����͸� �����ϴ� ��ɵ�
		
		// ����� -> View -> Controller -> Model -> ������ ���̽�
		
		/*
			1. ���� �ҽ������� lastAction, firstAction, prevAction���� ��Ʈ�ѷ��� �з� �� �� �ִ�
			2. ���� �ҽ��� ȭ���� ǥ���ϴ� �ڵ�(View)�� ������ ����ϴ� �ڵ�(Controller)�� �����ִ�.
			3. ���� ���� ȭ�鿡 lastAction�� ����� �Ȱ��� ��ư�� �߰��ϴµ�,
			   Controller�� �ش��ϴ� �͸� ����ü�� ���ҵǾ����� �ʴٸ� ������ �� ���̴�.
			4. �Ȱ��� �ҽ��� ���������� �����ϰ� �ǹǷ� �ڵ� �����ÿ� ������ �߻��Ѵ�
		*/	
		
		this.setLayout(new BorderLayout(0, 0));
		this.add(center_panel, BorderLayout.CENTER);
		this.add(south_panel, BorderLayout.SOUTH);

		// 1. center_panel�� �̹����� �� �� �� �߰��غ�����
		// south_panel�� first, last, previous ��ư�� �߰��غ�����

		// center_panel�� cardLayout
		center_panel.add("podo",
				new JLabel(new ImageIcon("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\podo.jpg")));
		center_panel.add("sea_podo",
				new JLabel(new ImageIcon("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\Sea_phodo.jpg")));
		center_panel.add("passion",
				new JLabel(new ImageIcon("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\passion.jpg")));
		center_panel.add("mango",
				new JLabel(new ImageIcon("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\mango.jpg")));
		center_panel.add("star",
				new JLabel(new ImageIcon("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\star.jpg")));
		center_panel.add("durian",
				new JLabel(new ImageIcon("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\durian.jpg")));

		// south_panel�� flowLayout
		south_panel.add(next_btn);
		south_panel.add(first_btn);
		south_panel.add(last_btn);
		south_panel.add(prev_btn);
	}

	public static void main(String[] args) {
		new S05_JPanel();
	}
}
