package Swing;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PictureLabel extends JLabel {
	public PictureLabel(PictureEnum picname) {
		super(new ImageIcon(picname.image
				.getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
	}
}