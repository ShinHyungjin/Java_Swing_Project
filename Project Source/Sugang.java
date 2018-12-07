package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class Sugang extends JFrame {
	JButton f1, f2, f3, f4, f5;
	JTextArea jt;
	private ImageIcon im;
	
	public Sugang() {
		setTitle("수강신청");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(0,0,0,0);
		
		Container c2 = getContentPane();
		c2.setBackground(Color.WHITE);
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
		
		f2 = new JButton("직접입력");
		f2.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f2.setBorderPainted(false);
		f2.setContentAreaFilled(false);
		m.add(f2);
		
		f3 = new JButton("직접선택");
		f3.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f3.setBorderPainted(false);
		f3.setContentAreaFilled(false);
		m.add(f3);
		
		f4 = new JButton("사용자 신청 수강목록");
		f4.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f4.setBorderPainted(false);
		f4.setContentAreaFilled(false);
		m.add(f4);
		
		f5 = new JButton("시간표");
		f5.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f5.setBorderPainted(false);
		f5.setContentAreaFilled(false);
		m.add(f5);
		
		c.add(m);
		
		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Sugang frame = new Sugang();
	}
}