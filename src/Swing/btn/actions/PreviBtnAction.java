package Swing.btn.actions;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreviBtnAction implements ActionListener {

	Container card_panel;
	
	public PreviBtnAction(Container card_panel) {
		this.card_panel = card_panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("� ��ư���� �����߳�?" + e.getActionCommand());
		((CardLayout) card_panel.getLayout()).previous(card_panel);
	}
}
