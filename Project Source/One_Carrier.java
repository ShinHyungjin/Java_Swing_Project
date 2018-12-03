package halla.Shin;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class One_Carrier extends JFrame {
	JLabel a;
	JTextField b;
	public One_Carrier() {
		setTitle("메인화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(0,0,0,0);

		Container x = getContentPane();
		x.setBackground(color);
		x.setLayout(null);
		
		a = new JLabel("단일전공");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,40));
		x.add(a);
		a.setBounds(160, 30, 250, 40);
		
		a = new JLabel("*정보통신소프트웨어*");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,20));
		x.add(a);
		a.setBounds(60, 100, 250, 40);
		
		a = new JLabel("교필");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(40, 150, 250, 40);
	   
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(85, 150, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("기필");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(170, 150, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(215, 150, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("전필");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(300, 150, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(345, 150, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("교선");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(40, 200, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(85, 200, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("기선");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(170, 200, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(215, 200, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("전선");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(300, 200, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(345, 200, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("*이준의 이수학점*");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,20));
		x.add(a);
		a.setBounds(60, 300, 250, 40);
		
		a = new JLabel("교필");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(40, 350, 250, 40);
	   
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(85, 350, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("기필");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(170, 350, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(215, 350, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("전필");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(300, 350, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(345, 350, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("교선");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(40, 400, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(85, 400, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("기선");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(170, 400, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(215, 400, 50, 35);
		b.setEnabled(false);
		
		a = new JLabel("전선");
		a.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(a);
		a.setBounds(300, 400, 250, 40);
		
		b = new JTextField(25);
		b.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(b);
		b.setBounds(345, 400, 50, 35);
		b.setEnabled(false);
		
		
		setSize(500, 600);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		One_Carrier frame = new One_Carrier();
	}
}