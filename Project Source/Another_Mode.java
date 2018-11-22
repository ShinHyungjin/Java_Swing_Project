package Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Another_Mode extends JFrame {
	public Another_Mode() {
		setTitle("User Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(20,50,100,135);

		Container contentPane = getContentPane();
		contentPane.setBackground(color);
		contentPane.setLayout(new FlowLayout());

		JLabel name = new JLabel("¿Ã∏ß");
		name.setLocation(100, 100);
		name.setSize(50,40);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,17));
		
		JTextField Uname = new JTextField(5);
		Uname.setLocation(180, 100);
		name.setSize(50,40);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,15));
		
		JLabel id = new JLabel("«–π¯");
		id.setLocation(100, 180);
		name.setSize(50,40);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,17));
		
		JTextField Uid = new JTextField(10);
		Uid.setLocation(180, 180);
		name.setSize(50,40);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,15));
		
		JButton login = new JButton("∑Œ±◊¿Œ");
		login.setLocation(110, 300);
		name.setSize(50,40);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,16));
		
		JButton clear = new JButton("√ ±‚»≠");
		clear.setLocation(180, 300);
		name.setSize(50,40);
		name.setFont(new Font("»ﬁ∏’∞ÌµÒ√º",Font.BOLD,16));
		
		
		contentPane.add(name);
		contentPane.add(Uname);
		contentPane.add(id);
		contentPane.add(Uid);
		contentPane.add(login);
		contentPane.add(clear);

		setSize(500, 600);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		Another_Mode frame = new Another_Mode();
	}
}
