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
import javax.swing.JTextField;

public class Credit extends JFrame {
	JLabel Need1, Need2, go1, go2, go3, go4, gi1, gi2, gi3, gi4, jun1, jun2, jun3, jun4, hak1, hak2;
	JTextField box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14;
	JButton button, select;
	static JComboBox Jc, Um, year;
	static String [] a = {"단일전공", "복수전공", "부전공"};
	static String [] b = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
	String line;
	int sum[] = new int[7];
	int k,p,w;
	int total = 140;
	int total2 = 130; 
	
	public Credit() {
		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(196,222,255);
		Color color2 = new Color(54,88,156);
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);

		Jc = new JComboBox<String>(a);
		c.add(Jc);
		Jc.setBounds(170, 20, 80, 25);
		
		Jc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((String)Jc.getSelectedItem()).equals(a[0]))
				{
					dispose();
					Credit frame = new Credit();
				}
				if(((String)Jc.getSelectedItem()).equals(a[1]))
				{
					dispose();
					Credit2 frame = new Credit2();
				}
				if(((String)Jc.getSelectedItem()).equals(a[2]))
				{
					dispose();
					Credit3 frame = new Credit3();
				}
				
			}
		});
		
		year = new JComboBox<String>(b);
		c.add(year);
		year.setBounds(450, 20, 70, 25);
		
		Um = new JComboBox<String>();
		c.add(Um);
		Um.setBounds(260, 20, 180, 25);
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
		
		Need1 = new JLabel("학점");
		Need1.setFont(new Font("휴면고딕체",Font.BOLD,50));
		c.add(Need1);
		Need1.setBounds(310, 80, 250, 50);

		go1 = new JLabel("교양필수");
		go1.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go1);
		go1.setBounds(90, 140, 100, 40);

		go2 = new JLabel("교양선택");
		go2.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go2);
		go2.setBounds(90, 200, 100, 40);
		
		gi1 = new JLabel("기본필수");
		gi1.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi1);
		gi1.setBounds(270, 140, 100, 40);
		
		gi2 = new JLabel("기본선택");
		gi2.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi2);
		gi2.setBounds(270, 200, 100, 40);

		jun1 = new JLabel("전공필수");
		jun1.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun1);
		jun1.setBounds(450, 140, 100, 40);

		jun2 = new JLabel("전공선택");
		jun2.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun2);
		jun2.setBounds(450, 200, 100, 40);

	    hak1 = new JLabel("총 이수학점");
		hak1.setFont(new Font("휴면고딕체",Font.BOLD,22));
		c.add(hak1);
		hak1.setBounds(240, 260, 130, 40);
		
		Need2 = new JLabel("필요학점");
		Need2.setFont(new Font("휴면고딕체",Font.BOLD,40));
		c.add(Need2);
		Need2.setBounds(280, 365, 250, 40);

		go3 = new JLabel("교양필수");
		go3.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go3);
		go3.setBounds(90, 425, 100, 40);

		go4 = new JLabel("교양선택");
		go4.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go4);
		go4.setBounds(90, 480, 100, 40);

		gi3 = new JLabel("기본필수");
		gi3.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi3);
		gi3.setBounds(270, 425, 100, 40);

		gi4 = new JLabel("기본선택");
		gi4.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi4);
		gi4.setBounds(270, 480, 100, 40);

		jun3 = new JLabel("전공필수");
		jun3.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun3);
		jun3.setBounds(450, 425, 100, 40);

		jun4 = new JLabel("전공선택");
		jun4.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun4);
		jun4.setBounds(450, 480, 100, 40);

		hak2 = new JLabel("총 이수학점");
		hak2.setFont(new Font("휴면고딕체",Font.BOLD,22));
		c.add(hak2);
		hak2.setBounds(240, 535, 150, 40);
		
		box1 = new JTextField();
		c.add(box1);
		box1.setBounds(192, 145, 70, 30);

		box2 = new JTextField();
		c.add(box2);
		box2.setBounds(365, 145, 70, 30);

		box3 = new JTextField();
		c.add(box3);
		box3.setBounds(545, 145, 70, 30);

		box4 = new JTextField();
		c.add(box4);
		box4.setBounds(192, 205, 70, 30);

		box5 = new JTextField();
		c.add(box5);
		box5.setBounds(365, 205, 70, 30);

		box6 = new JTextField();
		c.add(box6);
		box6.setBounds(545, 205, 70, 30);

		box7 = new JTextField();
		c.add(box7);
		box7.setBounds(365, 265, 70, 30);
		box7.setEditable(false);
		
		
		box8 = new JTextField();
		c.add(box8);
		box8.setBounds(192, 430, 70, 30);
		box8.setEditable(false);
		box8.setFont(new Font("휴먼고딕체",Font.BOLD,15));

		box9 = new JTextField();
		c.add(box9);
		box9.setBounds(365, 430, 70, 30);
		box9.setEditable(false);
		box9.setFont(new Font("휴먼고딕체",Font.BOLD,15));

		box10 = new JTextField();
		c.add(box10);
		box10.setBounds(545, 430, 70, 30);
		box10.setEditable(false);
		box10.setFont(new Font("휴먼고딕체",Font.BOLD,15));

		box11 = new JTextField();
		c.add(box11);
		box11.setBounds(192, 485, 70, 30);
		box11.setEditable(false);
		box11.setFont(new Font("휴먼고딕체",Font.BOLD,15));

		box12 = new JTextField();
		c.add(box12);
		box12.setBounds(365, 485, 70, 30);
		box12.setEditable(false);
		box12.setFont(new Font("휴먼고딕체",Font.BOLD,15));

		box13 = new JTextField();
		c.add(box13);
		box13.setBounds(545, 485, 70, 30);
		box13.setEditable(false);
		box13.setFont(new Font("휴먼고딕체",Font.BOLD,15));

		box14 = new JTextField();
		c.add(box14);
		box14.setBounds(365, 540, 70, 30);
		box14.setEditable(false);
		box14.setFont(new Font("휴먼고딕체",Font.BOLD,15));

		button = new JButton("비교하기");
		button.setFont(new Font("휴면고딕체", Font.BOLD,17));
		c.add(button);
		button.setBounds(240, 630, 120, 40);
		button.setBackground(color2);
		button.setForeground(Color.WHITE);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(year.getSelectedItem().equals(b[0]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2010이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem()))
								{
								w=0;
								k = Integer.parseInt(arr[1]);
								p = Integer.parseInt(box1.getText());
								w = w+p;
								sum[0] = k-p;
								box8.setText(String.valueOf(sum[0]));
								
								k = Integer.parseInt(arr[3]);
								p = Integer.parseInt(box2.getText());
								w = w+p;
								sum[1] = k-p;
								box9.setText(String.valueOf(sum[1]));
								
								k = Integer.parseInt(arr[5]);
								p = Integer.parseInt(box3.getText());
								w = w+p;
								sum[2] = k-p;
								box10.setText(String.valueOf(sum[2]));
								
								k = Integer.parseInt(arr[2]);
								p = Integer.parseInt(box4.getText());
								w = w+p;
								sum[3] = k-p;
								box11.setText(String.valueOf(sum[3]));
								
								k = Integer.parseInt(arr[4]);
								p = Integer.parseInt(box5.getText());
								w = w+p;
								sum[4] = k-p;
								box12.setText(String.valueOf(sum[4]));
								
								k = Integer.parseInt(arr[6]);
								p = Integer.parseInt(box6.getText());
								w = w+p;
								sum[5] = k-p;
								box13.setText(String.valueOf(sum[5]));
								
								box7.setText(String.valueOf(w));
								
								p = Integer.parseInt(box7.getText());
								sum[6] = total - p;
								box14.setText(String.valueOf(sum[6]));
								
								}
							} 
						
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
				else if(year.getSelectedItem().equals(b[1]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2011이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem()))
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
						
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				else if(year.getSelectedItem().equals(b[2]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2012이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem())) 
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				else if(year.getSelectedItem().equals(b[3]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2013이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem())) 
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				else if(year.getSelectedItem().equals(b[4]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2014이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem())) 
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				else if(year.getSelectedItem().equals(b[5]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2015이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem())) 
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				else if(year.getSelectedItem().equals(b[6]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2016이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem())) 
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				else if(year.getSelectedItem().equals(b[7]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2017이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem()) && (year.getSelectedItem().equals(b[7]) || year.getSelectedItem().equals(b[8])))
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total2 - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				else if(year.getSelectedItem().equals(b[8]))
				{
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2018이수학점.txt"), "euc-kr"));
						while (true) {
							line = br.readLine();
							if (line == null)
								break;
								String[] arr = line.split("\t");
								if(arr[0].equals(Um.getSelectedItem()) && (year.getSelectedItem().equals(b[7]) || year.getSelectedItem().equals(b[8])))
								{
									w=0;
									k = Integer.parseInt(arr[1]);
									p = Integer.parseInt(box1.getText());
									w = w+p;
									sum[0] = k-p;
									box8.setText(String.valueOf(sum[0]));
									
									k = Integer.parseInt(arr[3]);
									p = Integer.parseInt(box2.getText());
									w = w+p;
									sum[1] = k-p;
									box9.setText(String.valueOf(sum[1]));
									
									k = Integer.parseInt(arr[5]);
									p = Integer.parseInt(box3.getText());
									w = w+p;
									sum[2] = k-p;
									box10.setText(String.valueOf(sum[2]));
									
									k = Integer.parseInt(arr[2]);
									p = Integer.parseInt(box4.getText());
									w = w+p;
									sum[3] = k-p;
									box11.setText(String.valueOf(sum[3]));
									
									k = Integer.parseInt(arr[4]);
									p = Integer.parseInt(box5.getText());
									w = w+p;
									sum[4] = k-p;
									box12.setText(String.valueOf(sum[4]));
									
									k = Integer.parseInt(arr[6]);
									p = Integer.parseInt(box6.getText());
									w = w+p;
									sum[5] = k-p;
									box13.setText(String.valueOf(sum[5]));
									
									box7.setText(String.valueOf(w));
									
									p = Integer.parseInt(box7.getText());
									sum[6] = total2 - p;
									box14.setText(String.valueOf(sum[6]));
								}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				
					}	
				
	});
		
		select = new JButton("종료하기");
		select.setFont(new Font("휴면고딕체", Font.BOLD,17));
		c.add(select);
		select.setBounds(390, 630, 120, 40);
		select.setBackground(color2);
	    select.setForeground(Color.WHITE);
		
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		setSize(730, 800);
		setVisible(true);
		setResizable(false);
							
	}
public static void main(String[] args) {
		Credit frame = new Credit();
	}
}
