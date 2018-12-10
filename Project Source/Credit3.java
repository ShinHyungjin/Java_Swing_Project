package hoho.hoho;

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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Credit3 extends JFrame {

	static JComboBox Jc, Um;
	static String [] a = {"부전공", "단일전공","복수전공"};
	String line;

	public <tBounds> Credit3() {
		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);

		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
		Jc = new JComboBox<String>(a);
		c.add(Jc);
		Jc.setBounds(250, 20, 80, 25);
		
		Jc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((String)Jc.getSelectedItem()).equals(a[0]))
				{
					dispose();
					Credit3 frame = new Credit3();
				}
				if(((String)Jc.getSelectedItem()).equals(a[1]))
				{
					dispose();
					Credit frame = new Credit();
				}
				if(((String)Jc.getSelectedItem()).equals(a[2]))
				{
					dispose();
					Credit2 frame = new Credit2();
				}
				
			}
		});
		
		Um = new JComboBox<String>();
		c.add(Um);
		Um.setBounds(340, 20, 180, 25);
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
		
		Um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});


		JLabel w1;
		JLabel w2;
		JLabel w3;
		
		JTextField King;
		JTextField KingKong;
		JTextField a1;
		
		JButton e1;
		
		w1= new JLabel("제1전공");
		w1.setFont(new Font("휴면고딕체",Font.BOLD,25));
		c.add(w1);
		w1.setBounds(000, 100, 140, 50);
		
		w2= new JLabel("전공");
		w2.setFont(new Font("휴면고딕체",Font.BOLD,25));
		c.add(w2);
		w2.setBounds(0, 170, 140, 50);
	
		King = new JTextField("");
		King.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(King);
		King.setBounds(200, 100, 300, 50);
		King.setHorizontalAlignment(SwingConstants.CENTER);
		
		KingKong = new JTextField("");
		KingKong.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(KingKong);
		KingKong.setBounds(200, 170, 300, 50);
		KingKong.setHorizontalAlignment(SwingConstants.CENTER);
		
		e1= new JButton("필수 이수 지정 과목");
		e1.setFont(new Font("휴면고딕체",Font.BOLD,20));
		c.add(e1);
		e1.setBounds(000, 320, 250, 50);
		
		c = new JTextArea();
		
		((JTextArea) c).setRows(20);
		((JTextArea) c).setColumns(30);
		c.setBounds(10, 380, 700, 380);
		getContentPane().add(c);
		
		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}

	private void setBorder(EmptyBorder emptyBorder) {}
	
	public static void main(String[] args) {
		Credit3 frame = new Credit3();
	}
}
