package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_Tutorial {

	// # Swing
	//	- JAVA�� ������ ���α׷��� ���� �� �ִ� API

	// # �����̳�
	//	- ������Ʈ�� �߰��ϴ� ��
	//	- Frame, Panel, Dialog ..��
	//	- �����̳� ���� ���̾ƿ��� ������ �� �ִ�
	
	// # ������Ʈ
	//	- �����̳ʿ� �߰��ϴ� ��ǰ��
	//	- JButton, JTable, JSlider, JMenu ..��

	
	public static void main(String[] args) {
		
		// # JFrame
		//	- �پ��� ������Ʈ���� �߰��� �� �ִ� �����̳� �� �ϳ�
		
		// # JButton
		//	- ��ư ������Ʈ
		//	- ������ �����Ѵ�
		
		JFrame frame = new JFrame("����!");
//		JButton b = new JButton("CLICK!");
		
		KakaoButton b = new KakaoButton(KakaoBtnEnum.CAMERA, 500);
		
		b.setLocation(100, 100);
//		b.setSize(200, 200);
//		b.setBounds(100, 100, 100, 50);
		
		frame.add(b);
		
		// frame�� �⺻������ �����Ǿ��ִ� ���̾ƿ��� �����Ѵ�
		frame.setLayout(null);
		
		// �ش� �������� X��ư�� ������ ���� ������ �����Ѵ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������ũ�� ����
		frame.setSize(1000, 1500);
		
		// �������� ���̰� ���� (ȭ�鿡 �׸���)
		//	�� GUIȯ�濡���� ȭ�鿡 ��ȭ�� ������� ���� ���� ȭ���� �ٽ� �׷��� �Ѵ�.
		frame.setVisible(true);
	}
	
}
