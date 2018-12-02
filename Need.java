package kr.ac.halla.h02404.helloworld;

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
		go1.setBounds(5, 85, 100, 40);
		
		go2 = new JLabel("교양선택");
		go2.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(go2);
		go2.setBounds(5, 85, 100, 150);
		
		gi1 = new JLabel("기본필수");
		gi1.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(gi1);
		gi1.setBounds(150, 85, 100, 40);
		
		gi2 = new JLabel("기본선택");
		gi2.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(gi2);
		gi2.setBounds(150, 85, 100, 150);
		
		jun1 = new JLabel("전공필수");
		jun1.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(jun1);
		jun1.setBounds(295, 85, 100, 40);
		
		jun2 = new JLabel("전공선택");
		jun2.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(jun2);
		jun2.setBounds(295, 85, 100, 150);
		
		box1 = new JTextField();
		c.add(box1);
		box1.setBounds(75, 90, 50, 30);
		
		box2 = new JTextField();
		c.add(box2);
		box2.setBounds(220, 90, 50, 30);
		
		box3 = new JTextField();
		c.add(box3);
		box3.setBounds(365, 90, 50, 30);
		
		box4 = new JTextField();
		c.add(box4);
		box4.setBounds(75, 150, 50, 30);
		
		box5 = new JTextField();
		c.add(box5);
		box5.setBounds(220, 150, 50, 30);
		
		box6 = new JTextField();
		c.add(box6);
		box6.setBounds(365, 150, 50, 30);
		
		
		
		
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
      Need frame = new Need();

	}

}
