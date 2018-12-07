package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame {
	JButton sugang, hak, gong, back;
	JLabel jl;
	public Main() {
		setTitle("메인화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(139,188,0,0);
		Color color2 = new Color(35,100,21,255);
        Color a = new Color(54,88,156);
		Container c = getContentPane();
		getContentPane().setBackground(new java.awt.Color(196,222,255));
		c.setLayout(null);
		
		jl = new JLabel("이용하고싶은 컨텐츠를 누르세요");
		jl.setFont(new Font("휴먼고딕",Font.BOLD,20));
		c.add(jl);
		jl.setBounds(50, 5, 350, 70);
		
		sugang = new JButton("수강신청");
		sugang.setFont(new Font("돋움",Font.BOLD,16));
		c.add(sugang);
		sugang.setBounds(50, 100, 120, 40);
		sugang.setBackground(a);
		sugang.setForeground(color.WHITE);
		sugang.setFocusPainted(false);
		
		sugang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sugang frame = new Sugang();
				setVisible(false);
			}
		});
		
		hak = new JButton("학점관리");
		hak.setFont(new Font("돋움",Font.BOLD,16));
		c.add(hak);
		hak.setBounds(230, 100, 120, 40);
		hak.setBackground(a);
		hak.setForeground(color.WHITE);
		hak.setFocusPainted(false);
		
		hak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Credit frame = new Credit();
			}
		});
		
		gong = new JButton("공지사항");
		gong.setFont(new Font("돋움",Font.BOLD,16));
		c.add(gong);
		gong.setBounds(50, 190, 120, 40);
		gong.setBackground(a);
		gong.setForeground(color.WHITE);
		gong.setFocusPainted(false);
		
		gong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GongJi frame = new GongJi();
			}
		});
		
		back = new JButton("뒤로가기");
		back.setFont(new Font("돋움",Font.BOLD,16));
		c.add(back);
		back.setBounds(230, 190, 120, 40);
		back.setBackground(a);
		back.setForeground(color.WHITE);
		back.setFocusPainted(false);
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login frame = new Login();
			}
		});
		
		setSize(400,350);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		Main frame = new Main();
	}
}