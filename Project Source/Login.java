package halla.Shin;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	private JFrame frame = null;
	private JComboBox Usel = null;
	private JLabel name, id, Login;
	private JTextField Uname, Uid;
	private JButton login2;
	private String Non = "선택사항없음";
	
	public Login() {
		setTitle("사용자 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		Color color2 = new Color(196,222,255);
		Color color3 = new Color(54,88,156);

		Container c = getContentPane();
		c.setBackground(color2);
		c.setLayout(null);
		
	    Login = new JLabel("LOGIN");
		Login.setFont(new Font("휴먼고딕체",Font.BOLD,40));
		c.add(Login);
		Login.setBounds(200, 30, 250, 40);

		name = new JLabel("이름");
		name.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(name);
		name.setBounds(50, 85, 100, 40);
		
		Uname = new JTextField(5);
		Uname.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Uname);
		Uname.setBounds(160, 90, 200, 30);
		
		Uname.addKeyListener(new KeyListener() {;
			public void keyTyped(KeyEvent e) {
				if(Uname.getText().length() > 3)
					Uname.setText(Uname.getText().substring(0, 3));
			}
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
		});
		
		id = new JLabel("학번");
		id.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(id);
		id.setBounds(50, 145, 300, 40);
		
		Uid = new JTextField(10);
		Uid.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Uid);
		Uid.setBounds(160, 150, 200, 30);
		
		Uid.addKeyListener(new KeyListener() {;
		public void keyTyped(KeyEvent e) {
			if(Uid.getText().length() > 8)
				Uid.setText(Uid.getText().substring(0, 8));
		}
		public void keyReleased(KeyEvent e) {}
		public void keyPressed(KeyEvent e) {}
	});
		login2 = new JButton("로그인");
		login2.setFont(new Font("휴먼고딕체",Font.BOLD,18));
		c.add(login2);
		login2.setBounds(180, 220, 100, 40);
		login2.setFocusPainted(false);
		login2.setBackground(color3);
		login2.setForeground(color.WHITE);
		
		login2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Uname.setText("");
				Uid.setText("");
				setVisible(false);
				Main frame = new Main();
			}
		});
		
		setSize(450, 340);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Login frame = new Login();
	}
}
