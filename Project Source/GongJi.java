package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class GongJi extends JFrame {
	JTextArea area;
	JLabel text;
	JButton back;

	public GongJi() {
		setTitle("공지사항");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		c.setLayout(null);

		text = new JLabel("공지사항");
		c.add(text);
		text.setFont(new Font("Malgun Gothic Bold",Font.BOLD,28));
		text.setBounds(260, 1, 150, 50);
		
		area = new JTextArea(20, 30);
		c.add(area);
		area.setBackground(Color.ORANGE);
		area.setFont(new Font("돋움",Font.BOLD,20));
		area.setBounds(5, 60, 680, 660);
		area.setEditable(false);
		
		String line;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\공지사항.txt"), "euc-kr"));
			while (true) {
				line = reader.readLine();
				if (line == null)
					break;
				area.setText(area.getText() + line + "\n");
				area.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
			}
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		back = new JButton("뒤로가기");
		c.add(back);
		back.setFont(new Font("Malgun Gothic Bold",Font.BOLD,18));
		back.setBounds(260, 730, 150, 50);
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Main frame = new Main();
			}
		});
		
		setSize(700, 900);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		GongJi frame = new GongJi();
	}
}