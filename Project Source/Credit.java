package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class Credit extends JFrame {
	JComboBox jc;
	String [] a = {"단일전공", "복수/부전공"};
	public Credit() {
		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(new FlowLayout());
		
		jc = new JComboBox<String>(a);
		
		c.add(jc);
		
		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	}
}