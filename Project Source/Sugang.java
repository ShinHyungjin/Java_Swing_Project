package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class Sugang extends JFrame {
	JButton f1, f2, f3, f4, f5, f6;
	JTextArea jt;
	private ImageIcon im;
	
	public Sugang() {
		setTitle("수강신청");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(196,222,255);
		
		Container c2 = getContentPane();
		c2.setBackground(color);
		c2.setLayout(new FlowLayout());
		
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(new FlowLayout());
		
	    jt = new JTextArea(0,0);
	    
		c2.add(jt);
		
		JMenuBar m = new JMenuBar();
		
		f1 = new JButton("사용자 저장 예비수강목록");
		f1.setFont(new Font( "Malgun Gothic Bold", Font.BOLD, 15));
		f1.setBorderPainted(false);
		f1.setContentAreaFilled(false);
		m.add(f1);
		
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		f2 = new JButton("직접입력");
		f2.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f2.setBorderPainted(false);
		f2.setContentAreaFilled(false);
		m.add(f2);
		
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		f3 = new JButton("직접선택");
		f3.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f3.setBorderPainted(false);
		f3.setContentAreaFilled(false);
		m.add(f3);
		
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		f4 = new JButton("사용자 신청 수강목록");
		f4.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f4.setBorderPainted(false);
		f4.setContentAreaFilled(false);
		m.add(f4);
		
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		f5 = new JButton("시간표");
		f5.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f5.setBorderPainted(false);
		f5.setContentAreaFilled(false);
		m.add(f5);
		
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		f6 = new JButton("뒤로가기");
		f6.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f6.setBorderPainted(false);
		f6.setContentAreaFilled(false);
		m.add(f6);
		
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				setVisible(false);
			}
		});
		
		c.add(m);
		
		setSize(770, 800);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Sugang frame = new Sugang();
	}
}
