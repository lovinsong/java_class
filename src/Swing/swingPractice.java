package Swing;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class swingPractice extends JFrame {

        public swingPractice() {
                
                JMenuBar bar = new JMenuBar();
                JMenu menu = new JMenu("Menu");
                JMenu sub_menu = new JMenu("����");
                JMenuItem i1, i2, i3, i4, i5;
                JMenuItem si1, si2, si3;
                
                // �� �޴��� �����ϸ� ī�� ���̾ƿ��� ������ �ٲ�� ��������
                i1 = new JMenuItem("Apple");
                i2 = new JMenuItem("Banana");
                i3 = new JMenuItem("Kiwi");
                i4 = new JMenuItem("Peach");
        		i5 = new JMenuItem("Orange");
                
                si1 = new JMenuItem("���");
                si2 = new JMenuItem("�ڳ���");
                si3 = new JMenuItem("����");
                
                menu.add(sub_menu);
                menu.add(i1);
                menu.add(i2);                
                menu.add(i3);
                menu.add(i4);
                menu.add(i5);
                                
                sub_menu.add(si1);
                sub_menu.add(si2);
                sub_menu.add(si3);                
                                
                bar.add(menu);
                
                this.setJMenuBar(bar);
                SwingTools.initTestFrame(this);
        }        
        
        public static void main(String[] args) {
                new swingPractice();                
        }
        
}
