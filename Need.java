package hoho.hoho;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Need extends JFrame {
	JLabel Need, go1, go2, gi1, gi2, jun1, jun2, hak;
	JTextField box1, box2, box3, box4, box5, box6, box7;
	public Need() {
		setTitle("필요학점");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		Color color2 = new Color(35,100,21,255);

		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
		Need = new JLabel("필요학점");
		Need.setFont(new Font("휴면고딕체",Font.BOLD,40));
		c.add(Need);
		Need.setBounds(160, 30, 250, 40);
		
		go1 = new JLabel("교양필수");
		go1.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(go1);
		go1.setBounds(50, 85, 100, 40);
		
		box1 = new JTextField();
		c.add(box1);
		box1.setBounds(160, 90, 150, 30);
		
		
		
		
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
      Need frame = new Need();

	}

}
