package hoho.hoho;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Credit3 extends JFrame {
	JPanel panel;
	static JComboBox<String> Jc, Um,Am;
	static String [] a = {"부전공", "단일전공","복수전공"};
	JTextArea area;
	String line;
	JLabel w1;
	JLabel w2;
	JTextField King = null, KingKong = null;
	JButton w;
	public Credit3() {
		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(196,222,255);
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		Jc = new JComboBox<String>(a);
		
		Jc.setBounds(400, 20, 80, 25);
		c.add(Jc);

		Jc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((String)Jc.getSelectedItem()).equals(a[0]))
				{
					dispose();
					@SuppressWarnings("unused")
					Credit3 frame = new Credit3();
				}
				if(((String)Jc.getSelectedItem()).equals(a[1]))
				{
					dispose();
					@SuppressWarnings("unused")
					Credit frame = new Credit();
				}
				if(((String)Jc.getSelectedItem()).equals(a[2]))
				{
					dispose();
					@SuppressWarnings("unused")
					Credit2 frame = new Credit2();
				}
				
			}
		});
		
		Um = new JComboBox<String>();
		c.add(Um);
		Um.setBounds(450, 100, 380, 40);
		Um.setAutoscrolls(true);
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\전공.txt"), "euc-kr"));
				while (true) {
					line = reader.readLine();
					if (line == null)
						break;
					Um.addItem(line);
				}
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	
	
		Am = new JComboBox<String>();
		c.add(Am);
		Am.setBounds(450, 170, 380, 40);
		Am.setAutoscrolls(true);
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\전공.txt"), "euc-kr"));
			while (true) {
				line = reader.readLine();
				if (line == null)
					break;
				Am.addItem(line);
				}
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		

		King = new JTextField();
		King.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(King);
		King.setEnabled(false);
		King.setBounds(120, 100, 300, 40);
		King.setHorizontalAlignment(SwingConstants.CENTER);


		KingKong = new JTextField();
		KingKong.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(KingKong);
		KingKong.setEnabled(false);
		KingKong.setBounds(120, 170, 300, 40);
		KingKong.setHorizontalAlignment(SwingConstants.CENTER);

		area = new JTextArea();
		@SuppressWarnings("unused")
		JScrollPane scrollPane = new JScrollPane(area);
		setVisible(true);
		area.setRows(20);
		area.setColumns(30);
		area.setBounds(0, 300, 910, 910);
		c.add(area);

		w = new JButton("확인");
		w.setFont(new Font("휴먼고딕체",Font.BOLD,20));
		c.add(w);
		add(w);
		w.setBounds(350, 240, 150, 40);

		w.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((String)Um.getSelectedItem()).equals(Am.getSelectedItem())) {
					JOptionPane.showMessageDialog(null, "제1전공과 부전공 학과가 같습니다.\n다시 선택하세요.", "전공선택오류", JOptionPane.WARNING_MESSAGE);
					}
				else
					King.setText((String)Um.getSelectedItem());
				KingKong.setText((String)Am.getSelectedItem());
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\부전공.txt"), "euc-kr"));
					while (true) {
						line = reader.readLine();
						if (line == null)
							break;
						area.append(line);
	                    area.append("\n");
											}
					reader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		w1= new JLabel("제1전공");
		w1.setFont(new Font("휴면고딕체",Font.BOLD,25));
		c.add(w1);
		w1.setBounds(10, 100, 140, 40);

		w2= new JLabel("부전공");
		w2.setFont(new Font("휴면고딕체",Font.BOLD,25));
		c.add(w2);
		w2.setBounds(10, 170, 140, 40);

		
		setSize(900, 900);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Credit3 frame = new Credit3();
	}
}

