package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SeaPodoTrans extends JFrame{

	ImageIcon img1;
	ImageIcon img2;
	int buttoncount = 0;
	
	public SeaPodoTrans() throws IOException {
	
//		JLabel label01 = new JLabel(new ImageIcon(
//				ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\Sea_phodo.jpg")
//						).getScaledInstance(300, 300, Image.SCALE_SMOOTH)
//				));
//		
//		label01.setBounds(50, 50, 300, 300);
//		
//		
//		JLabel label02 = new JLabel(new ImageIcon(
//				ImageIO.read(new File("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\podo.jpeg")
//						).getScaledInstance(300, 300, Image.SCALE_SMOOTH)
//				));
//		
//		label02.setBounds(50, 50, 300, 300);
		
	img1 = new ImageIcon("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\Sea_phodo.jpg");
	img2 = new ImageIcon("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\podo.jpeg");

	JLabel label1 = new JLabel(img1);
	JLabel label2 = new JLabel(img2);

	label1.setBounds(50,50,300,300);
	label2.setBounds(100,100,300,300);
	
	
	
	JButton button1 = new JButton("눌러보세요! 과일이 변해요!");
	
	
	button1.setBounds(400, 400, 200, 100);
	

	button1.addActionListener(new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(buttoncount % 2 == 1) {		
			}
		}
	});

	
	add(label1);
	add(label2);
	
	add(button1);
	
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setLocation(200, 100);
	setSize(600, 600);
	setVisible(true);
	
	}
	public static void main(String[] args) throws IOException {
		
		new SeaPodoTrans();
	}
	
	
}
