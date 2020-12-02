package Swing;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DiceLabel extends JLabel {
	public DiceLabel(DiceEnum dNum) {
		super(new ImageIcon(dNum.image
				.getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
	}
}