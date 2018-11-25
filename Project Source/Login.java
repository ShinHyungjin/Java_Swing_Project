package Team4_Project;

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

public class Login extends JFrame {
	
	JLabel name, id, Login;
	JTextField Uname, Uid;
	JButton login, clear;
	
	public Login() {
		setTitle("ªÁøÎ¿⁄ ∑Œ±◊¿Œ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		Color color2 = new Color(35,100,21,255);

		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
	    /*Login = new JLabel("LOGIN");
		Login.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,10));
		c.add(Login);
		name.setBounds(20, 20, 300, 300);*/

		name = new JLabel("¿Ã∏ß");
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,17));
		c.add(name);
		name.setBounds(50, 80, 100, 40);
		
		Uname = new JTextField(5);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,15));
		c.add(Uname);
		Uname.setBounds(160, 90, 150, 30);
		
		id = new JLabel("«–π¯");
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,17));
		c.add(id);
		id.setBounds(50, 140, 100, 40);
		
		Uid = new JTextField(10);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,15));
		c.add(Uid);
		Uid.setBounds(160, 150, 150, 30);
		
		login = new JButton("∑Œ±◊¿Œ");
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,16));
		c.add(login);
		login.setBounds(100, 220, 100, 40);
		
		clear = new JButton("√ ±‚»≠");
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,16));
		c.add(clear);
		clear.setBounds(230, 220, 100, 40);
		
		setSize(400, 400);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		Login frame = new Login();
	}
}