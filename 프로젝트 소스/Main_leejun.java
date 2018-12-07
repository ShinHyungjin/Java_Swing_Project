package halla.Team4_Project;

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

public class Main_leejun extends JFrame {
	
	JLabel name, id, Login;
	JTextField Uname, Uid;
	JButton login, clear;
	
	public Main_leejun() {
		setTitle("메인화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(0,0,0,0);
		Color color2 = new Color(35,100,21,255);

		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
	    /*Login = new JLabel("LOGIN");
		Login.setFont(new Font("휴먼고딕체",Font.BOLD,10));
		c.add(Login);
		name.setBounds(20, 20, 300, 300);*/

		login = new JButton("수강신청");
		login.setFont(new Font("휴먼고딕체",Font.BOLD,16));
		c.add(login);
		login.setBounds(50, 100, 120, 40);
		
		clear = new JButton("학점관리");
		clear.setFont(new Font("휴먼고딕체",Font.BOLD,16));
		c.add(clear);
		clear.setBounds(230, 100, 120, 40);
		
		clear = new JButton("공지사항");
		clear.setFont(new Font("휴먼고딕체",Font.BOLD,16));
		c.add(clear);
		clear.setBounds(140, 220, 120, 40);
		
		setSize(400, 400);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		Main_leejun frame = new Main_leejun();
	}
}