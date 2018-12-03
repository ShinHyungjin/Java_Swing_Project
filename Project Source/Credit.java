package halla.Shin;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Credit extends JFrame {
	JComboBox jc;
	String [] a = {"단일전공", "복수전공", "부전공"};
	JLabel jl;
	JTextField jtf;
	
	public Credit() {
		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(new FlowLayout());
		
		jc = new JComboBox<String>(a);
		
		c.add(jc);
		
		Container x = getContentPane();
		x.setBackground(color);
		x.setLayout(null);
			
		jl = new JLabel("단일전공");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,40));
		x.add(jl);
		jl.setBounds(160, 30, 250, 40);
			
		jl = new JLabel("*정보통신소프트웨어*");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,20));
		x.add(jl);
		jl.setBounds(60, 100, 250, 40);
			
		jl = new JLabel("교필");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(40, 150, 250, 40);
		   
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(85, 150, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("기필");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(170, 150, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(215, 150, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("전필");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(300, 150, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(345, 150, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("교선");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(40, 200, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(85, 200, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("기선");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(170, 200, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(215, 200, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("전선");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(300, 200, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(345, 200, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("*이준의 이수학점*");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,20));
		x.add(jl);
		jl.setBounds(60, 300, 250, 40);
			
		jl = new JLabel("교필");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(40, 350, 250, 40);
		   
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(85, 350, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("기필");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(170, 350, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(215, 350, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("전필");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(300, 350, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(345, 350, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("교선");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(40, 400, 250, 40);
		
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(85, 400, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("기선");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(170, 400, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(215, 400, 50, 35);
		jtf.setEnabled(false);
			
		jl = new JLabel("전선");
		jl.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jl);
		jl.setBounds(300, 400, 250, 40);
			
		jtf = new JTextField(25);
		jtf.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		x.add(jtf);
		jtf.setBounds(345, 400, 50, 35);
		jtf.setEnabled(false);
		
		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Credit frame = new Credit();
	}
}