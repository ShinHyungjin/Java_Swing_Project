package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Sugang extends JFrame {
	private JComboBox<String> Uf, Ut;
	private JButton f1, f2, f3, f4, f5, select;
	private JTextArea jt;
	private ImageIcon im;
	private String line;
	private String a [] = {"교양", "전공"}, 
				row [] = {"전공", "과목코드", "과목명", "학년", "구분", "학점", "수강인원", "시간표", "시수", "수강제한인원"},
				hang [][] = new String[899][10];
	private JTable Uhope,Uselect;
	
	public Sugang() {
		setTitle("수강신청");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(196,222,255);
		
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
		Uf = new JComboBox<String>(a);
		c.add(Uf);
		Uf.setVisible(false);
		Uf.setBounds(250, 62, 100, 30);
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2018-2학기 시간표.txt"), "euc-kr"));
			for(int i=0; i<900; i++) {
				line = br.readLine();
				if(line == null)
					break;
				String [] arr = line.split("\t");
				for(int j=0; j<arr.length; j++)
					hang[i][j] = arr[j];
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		Uselect = new JTable(hang, row);
		c.add(Uselect);
		Uselect.setVisible(false);
		Uselect.setBounds(0, 95, 675, 760);
		
		
		JMenuBar m = new JMenuBar();
		
		f1 = new JButton("사용자 저장 예비수강목록");
		f1.setFont(new Font( "Malgun Gothic Bold", Font.BOLD, 15));
		f1.setBorderPainted(false);
		f1.setContentAreaFilled(false);
		m.add(f1);
		
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jt.setVisible(true);
					try {
						BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\사용자저장예비수강목록.txt"), "euc-kr"));
						while (true) {
							line = reader.readLine();
							if (line == null)
								break;
							jt.setText(jt.getText() + line + "\n");
						}
						reader.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					select.setVisible(true);
			}
		});
		
		f2 = new JButton("직접선택");
		f2.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f2.setBorderPainted(false);
		f2.setContentAreaFilled(false);
		m.add(f2);
		
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jt.setVisible(false);
				select.setVisible(false);
				Uf.setVisible(true);
				Uselect.setVisible(true);
			}
		});
		
		f3 = new JButton("사용자 신청 수강목록");
		f3.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f3.setBorderPainted(false);
		f3.setContentAreaFilled(false);
		m.add(f3);
		
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		f4 = new JButton("시간표");
		f4.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f4.setBorderPainted(false);
		f4.setContentAreaFilled(false);
		m.add(f4);
		
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		f5 = new JButton("뒤로가기");
		f5.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f5.setBorderPainted(false);
		f5.setContentAreaFilled(false);
		m.add(f5);
		
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				setVisible(false);
			}
		});
		
		c.add(m);
		m.setBounds(5, 5, 670, 50);
		
		jt = new JTextArea();
		c.add(jt);
		jt.setVisible(false);
		jt.setEditable(false);
		jt.setBounds(0,60,670,700);
		jt.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		
		select = new JButton("전체신청");
		c.add(select);
		select.setVisible(false);
		select.setBounds(240,770,100,50);
		select.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		
		setSize(680, 860);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Sugang frame = new Sugang();
	}
}