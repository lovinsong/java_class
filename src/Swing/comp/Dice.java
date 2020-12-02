package Swing.comp;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dice extends JPanel {

public int num;
	
	public Dice() {
		super(new CardLayout());
		setBackground(Color.black);
		
		try {
			for (int i = 1; i <= 6; ++i) {
				add(Integer.toString(i), new JLabel(new ImageIcon(
						ImageIO
							.read(new File("assets/dice/dice" + i +".png"))
							.getScaledInstance(100, 100, Image.SCALE_SMOOTH))));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		num = 1;
	}

	public void roll() {
		((CardLayout) this.getLayout())
			.show(this, Integer.toString(num = (int)(Math.random() * 6 + 1)));
		this.repaint();
	}

	@Override
	public boolean equals(Object obj) {	
		return this.num == ((Dice) obj).num;
	}	
}

