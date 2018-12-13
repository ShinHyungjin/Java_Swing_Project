import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Sugang extends JFrame {
	private JComboBox<String> Ut;
	private JButton f1, f2, f3, f4, select;
	private ImageIcon im;
	private String line;
	private String row [] = {"전공", "과목코드", "과목명", "학년", "구분", "학점", "수강인원", "시간표", "시수", "수강제한인원"},
				   hang [][] = new String[899][10],
				   Uhang [][] = new String[0][10],
				   Usu [][] = new String[0][10],
				   input[] = new String[10];
	private JTable Uhope,Uselect,Usugang;
	private JScrollPane jsc, jsc2, jsc3;
	private JButton click, hopeclick, allclick, oneclick;
	private DefaultTableModel dm, dm2,dm3;
	private int a,b;
	private int c = 0;
	
	public Sugang() {
		setTitle("수강신청");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(196,222,255);
		
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
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
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\사용자저장예비수강목록.txt"), "euc-kr"));
			for(int i=0; i<200; i++) {
				line = reader.readLine();
				if(line == null)
					break;
				String [] arr = line.split("\t");
				for(int j=0; j<arr.length; j++)
					Uhang[i][j] = arr[j];
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		dm = new DefaultTableModel(hang, row);
		Uselect = new JTable(dm);
		jsc = new JScrollPane(Uselect);
		c.add(jsc);
		jsc.setVisible(false);
		Uselect.setVisible(false);
		jsc.setBounds(0, 60, 760, 760);
		
		dm2 = new DefaultTableModel(Uhang, row);
		Uhope = new JTable(dm2);
		jsc2 = new JScrollPane(Uhope);
		c.add(jsc2);
		jsc2.setBounds(0, 60, 760, 760);
		
		dm3 = new DefaultTableModel(Usu, row);
		Usugang = new JTable(dm3);
		jsc3 = new JScrollPane(Usugang);
		c.add(jsc3);
		jsc3.setBounds(0, 60, 760, 760);
		
		
		allclick = new JButton("전체신청");
		c.add(allclick);
		allclick.setBounds(250, 840, 100, 50);
		
		allclick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = 0;
				while(true) {
					if(Usugang.getRowCount() > 6) {
						JOptionPane.showMessageDialog(null, "신청가능한 과목수는 최대 7과목 입니다.", "신청초과오류", JOptionPane.WARNING_MESSAGE);
						break;
							}
					else {
						for(int i=0; i<10; i++)
							input[i] = (String)Uhope.getValueAt(a, i);
						dm3.addRow(input);
						jsc3.setVisible(false);
						dm2.removeRow(0);
						if(Usugang.getRowCount() > 6) {
							JOptionPane.showMessageDialog(null, "신청가능한 과목수는 최대 7과목 입니다.", "신청초과오류", JOptionPane.WARNING_MESSAGE);
							break;
								}
					}
				
				}
			}
		});
		
		oneclick = new JButton("개별신청");
		c.add(oneclick);
		oneclick.setBounds(360, 840, 100, 50);
		
		oneclick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Uhope.getSelectedRow();
				for(int i=0; i<10; i++)
					input[i] = (String)Uhope.getValueAt(a, i);
				if(Usugang.getRowCount() > 6) {
					JOptionPane.showMessageDialog(null, "신청가능한 과목수는 최대 7과목 입니다.", "신청초과오류", JOptionPane.WARNING_MESSAGE);
					}
				else {
					dm3.addRow(input);
				jsc3.setVisible(false);
				if(Uhope.getSelectedRow() == -1)
					return;
				else
					dm.removeRow(Uhope.getSelectedRow());
				}
				
			}
		});
		
		click = new JButton("신청하기");
		c.add(click);
		click.setBounds(360, 840, 100, 50);
		click.setVisible(false);
		
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Uselect.getSelectedRow();
				for(int i=0; i<10; i++)
					input[i] = (String)Uselect.getValueAt(a, i);
				if(Usugang.getRowCount() > 6) {
					JOptionPane.showMessageDialog(null, "신청가능한 과목수는 최대 7과목 입니다.", "신청초과오류", JOptionPane.WARNING_MESSAGE);
					}
				else {
					dm3.addRow(input);
				jsc3.setVisible(false);
				if(Uselect.getSelectedRow() == -1)
					return;
				else
					dm.removeRow(Uselect.getSelectedRow());
				}
			}
		});
		
		hopeclick = new JButton("예비저장");
		c.add(hopeclick);
		hopeclick.setBounds(250,840,100,50);
		hopeclick.setVisible(false);
		
		hopeclick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Uselect.getSelectedRow();
				for(int i=0; i<10; i++)
					input[i] = (String)Uselect.getValueAt(a, i);
				if(Uhope.getRowCount() > 6) {
					JOptionPane.showMessageDialog(null, "신청가능한 과목수는 최대 7과목 입니다.", "신청초과오류", JOptionPane.WARNING_MESSAGE);
					}
				else {
					dm2.addRow(input);
				jsc2.setVisible(false);
				if(Uselect.getSelectedRow() == -1)
					return;
				else
					dm.removeRow(Uselect.getSelectedRow());
				}
			}
		});
		
		JMenuBar m = new JMenuBar();
		
		f1 = new JButton("사용자 저장 예비수강목록");
		f1.setFont(new Font( "Malgun Gothic Bold", Font.BOLD, 15));
		f1.setBorderPainted(false);
		f1.setContentAreaFilled(false);
		m.add(f1);
		
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jsc.setVisible(false);
				jsc2.setVisible(true);
				click.setVisible(false);
				hopeclick.setVisible(false);
				allclick.setVisible(true);
				oneclick.setVisible(true);
					try {
						BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\사용자저장예비수강목록.txt"), "euc-kr"));
						for(int i=0; ; i++) {
							line = reader.readLine();
							if(line == null)
								break;
							String [] arr = line.split("\t");
							for(int j=0; j<arr.length; j++)
								Uhang[i][j] = arr[j];
						}
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
				allclick.setVisible(false);
				oneclick.setVisible(false);
				click.setVisible(true);
				hopeclick.setVisible(true);
				select.setVisible(false);
				jsc2.setVisible(false);
				Uselect.setVisible(true);
				jsc.setVisible(true);
			}
		});
		
		f3 = new JButton("사용자 신청 수강목록");
		f3.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f3.setBorderPainted(false);
		f3.setContentAreaFilled(false);
		m.add(f3);
		
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allclick.setVisible(false);
				oneclick.setVisible(false);
				click.setVisible(false);
				hopeclick.setVisible(false);
				select.setVisible(false);
				Uselect.setVisible(false);
				jsc.setVisible(false);
				jsc2.setVisible(false);
				jsc3.setVisible(true);
				try {
					BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\사용자신청수강목록.txt"), "euc-kr"));
					for(int i=0; i<200; i++) {
						line = reader2.readLine();
						if(line == null)
							break;
						String [] arr = line.split("\t");
						for(int j=0; j<arr.length; j++)
							Usu[i][j] = arr[j];
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		f4 = new JButton("뒤로가기");
		f4.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		f4.setBorderPainted(false);
		f4.setContentAreaFilled(false);
		m.add(f4);
		
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				setVisible(false);
			}
		});
		
		c.add(m);
		m.setBounds(80, 5, 600, 50);
		
		select = new JButton("전체신청");
		c.add(select);
		select.setVisible(false);
		select.setBounds(240,770,100,50);
		select.setFont(new Font("Malgun Gothic Bold", Font.BOLD, 15));
		
		setSize(765, 950);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Sugang frame = new Sugang();
	}
}
