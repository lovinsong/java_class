package Swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S04_Layout extends JFrame {

	ArrayList<JButton> btns = new ArrayList<>(25);
	
	{
		for (int i = 1; i <= 25; ++i) {
			btns.add(new JButton("button" + i));
		}
	}
	
	public S04_Layout(String ltype) {	
		SwingTools.initTestFrame(this);
		
		switch (ltype) {
			case "border":
				// # BorderLayout
				//	- �������ϰ� ����� �̷���� ���̾ƿ� 
				//	- ������Ʈ�� ���� �� ��ġ�� �Բ� �����ؾ� �Ѵ�
				//	- ������ �� 2���� ����(horizon) ����� ����(vertical)�����̴�
				setLayout(new BorderLayout(10, 20));	
				
				add(btns.get(0), BorderLayout.EAST);
				add(btns.get(1), BorderLayout.WEST);
				add(btns.get(2), BorderLayout.SOUTH);
				add(btns.get(3), BorderLayout.NORTH);
				add(btns.get(4), BorderLayout.CENTER);
				break;
			case "grid":
				// # GridLayout			
				//	- ��/���� �̷���� ���̾ƿ�
				//	- ������Ʈ�� ������� ���̸� �ȴ�
				//	- ������ ���ڰ� 2���� ��(row)�� ��(col)�� �����̴�
				//	- ��� ĭ�� ä�� �� �������� ���� �켱���Ѵ�
				int rows = 4;
				int cols = 5;
				setLayout(new GridLayout(rows, cols, 10, 20));
				
				for (int i = 0, items = rows * cols; i < items; ++i) {
					add(btns.get(i));				
				}
				
				break;
			case "flow":
				// # FlowLayout
				//	- �ؽ�Ʈó�� ������Ʈ�� �߰��Ѵ�
				//	- �����ڿ� �����ϴ� �� : ����, ���� ����, ���� ����
				setLayout(new FlowLayout(FlowLayout.TRAILING, 0, 0));
				
				for (int i = 0; i < 10; ++i) {
					add(btns.get(i));
				}
				
				break;
			case "card":
				// # CardLayout
				//	- ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
				//	- �����ڷδ� �ٱ��� ������ ������ �� �ִ�
				//	- ī�� ���̾ƿ��� �����ϱ� ���ؼ� ���̾ƿ��� �����ִ� �θ� �����̳ʸ� �����ؾ� �Ѵ�
				Container c = this.getContentPane();
				
				CardLayout cards = new CardLayout(0, 0);				
				setLayout(cards);
				
				add("a", btns.get(0));
				add("b", btns.get(1));
				add("c", btns.get(2));				
				
				ActionListener next_card = new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// cards.first(c); - �� ó�� ī�带 �����ش�
						// cards.last(c); - ������ ī�带 �����ش� 
						// cards.next(c); - ���� ī�带 �����ش�
						// cards.previous(c); - ���� ī�带 �����ش�
						 cards.show(c, "c"); //- ������Ʈ �߰��ÿ� �����ߴ� �̸����� ī�带 �����Ѵ�
						
//						cards.previous(c);
					}
				};
				
				btns.get(0).addActionListener(next_card);
				btns.get(1).addActionListener(next_card);
				btns.get(2).addActionListener(next_card);
				
				break;							
			default:				
				add(btns.get(0));
				add(btns.get(1));
				add(btns.get(2));
				add(btns.get(3));
				add(btns.get(4));
				break;
		}
	}
	
	public static void main(String[] args) {
		new S04_Layout("card");
	}
	
}