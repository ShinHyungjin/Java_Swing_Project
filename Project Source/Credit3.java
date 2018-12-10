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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Credit3 extends JFrame {
	JPanel panel;
	static JComboBox<String> Jc, Um,Am;
	static String [] a = {"복수전공", "단일전공","부전공"};
	static String [] b = {"선택사항없음","경영학과", "관광경역학과","무역통상학과","광고영상미디어학과",
			"사회복지학과","경찰행정학과","사회체육학과","뷰티헬스학과","기계자동차공학부","건축학과","토목공학과","산업경영공학과","신소재화학공학과","매카트로닉스공학과","전지전자공학과","정보통신소프트웨어학과","컴퓨터공학과"};
	static String [] q = {"선택사항없음","경역학과","무역통상학과","광고영상미디어학과","전기전자공학과","건축학과","의료기기융합전공","벤처창업학전공","지식재산융합전공"};
	JTextArea area;
	String line;

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
					Credit2 frame = new Credit2();
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
					Credit3 frame = new Credit3();
				}
				
			}
		});
		
		Um = new JComboBox<String>(b);
		c.add(Um);
		Um.setBounds(450, 100, 380, 40);
		Um.setAutoscrolls(true);
		JComboBox<String> Um = new JComboBox<String>(b);
		add(new JScrollPane(Um));
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\전공.txt"), "euc-kr"));
				while (true) {
					line = reader.readLine();
					if (line == null)
						break;
					 area.append(line);
	                    area.append("\n");
					Um.addItem(line);
				}
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	
	
		Am = new JComboBox<String>(q);
		c.add(Am);
		Am.setBounds(450, 170, 380, 40);
		Am.setAutoscrolls(true);
		
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
		JTextField King;
		JTextField KingKong;
		JButton w;

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
		w.setBounds(350, 240, 150, 40);

		w.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(panel);	
				if (result != JFileChooser.APPROVE_OPTION)
					return;

				String filePath = chooser.getSelectedFile().getPath();
			try {
					BufferedReader reader = new BufferedReader(new FileReader(filePath));
					while (true) {
						String line = reader.readLine();
						if (line == null)
							break;
						  area.append(line);
		                    area.append("\n");
						area.setText(area.getText() + line);
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

		King = new JTextField("");
		King.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(King);
		King.setEnabled(false);
		King.setBounds(120, 100, 300, 40);
		King.setHorizontalAlignment(SwingConstants.CENTER);

		KingKong = new JTextField("");
		KingKong.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(KingKong);
		KingKong.setEnabled(false);
		KingKong.setBounds(120, 170, 300, 40);
		KingKong.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(900, 900);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Credit3 frame = new Credit3();
	}
}
