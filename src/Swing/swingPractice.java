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
                JMenu sub_menu = new JMenu("동물");
                JMenuItem i1, i2, i3, i4, i5;
                JMenuItem si1, si2, si3;
                
                // 각 메뉴를 선택하면 카드 레이아웃의 사진이 바뀌도록 만들어보세요
                i1 = new JMenuItem("Apple");
                i2 = new JMenuItem("Banana");
                i3 = new JMenuItem("Kiwi");
                i4 = new JMenuItem("Peach");
        		i5 = new JMenuItem("Orange");
                
                si1 = new JMenuItem("펭귄");
                si2 = new JMenuItem("코끼리");
                si3 = new JMenuItem("사자");
                
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
