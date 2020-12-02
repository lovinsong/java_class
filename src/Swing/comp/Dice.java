package Swing.comp;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dice extends JPanel implements ActionListener {

	public Dice() {
		super(new CardLayout());
		setBackground(Color.black);

		for (int i = 1; i <= 6; ++i) {
			try {
				add(Integer.toString(i), new JLabel(new ImageIcon(ImageIO.read(new File("assets/dice/" + i + ".jpg"))
						.getScaledInstance(100, 100, Image.SCALE_SMOOTH))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((CardLayout)this.getLayout()).show(
				this,
				Integer.toString((int)(Math.random() * 6 + 1))
				);
	}
}
