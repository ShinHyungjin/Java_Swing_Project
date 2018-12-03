package halla.Shin;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class Sugang extends JFrame {
	JButton f1, f2, f3, f4, f5;
	JTextArea jt;
	// private ImageIcon im;  (진혁 이미지 시도)
	
	public Sugang() {
		setTitle("수강신청");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(120,200,10,70);
		
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(new FlowLayout());
		JMenuBar m = new JMenuBar();
		
		f1 = new JButton("사용자 저장 예비수강목록");
		f1.setFont(new Font( "Malgun Gothic Bold", Font.BOLD, 15));
		f1.setBorderPainted(false);
		f1.setContentAreaFilled(false);
		m.add(f1);
		
		f1.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				f1.setFont(new Font("굴림체", Font.BOLD, 16));
				f1.setForeground(Color.blue);
				String line;
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\사용자저장예비수강목록.txt"), "euc-kr"));
					while (true) {
						line = reader.readLine();
						if (line == null)
							break;
						jt.setText(jt.getText() + line + "\n");
						jt.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
					}
					reader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
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
		
		jt = new JTextArea(35,47);
		jt.setAutoscrolls(true);
		c.add(jt);
		jt.setEditable(false);
	
		setSize(665, 800);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Sugang frame = new Sugang();
	}
}