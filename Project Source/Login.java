package halla.Shin;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	public JFrame frame = null;
	public JComboBox Usel = null;
	public JLabel name, id, fmajor,tmajor, dou, Login;
	public JTextField Uname, Uid, Ufmajor,Utmajor;
	public JButton login2, Ufmajorbutton, Utmajorbutton;
	
	public Login() {
		setTitle("사용자 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		Color color2 = new Color(196,222,255);
		Color color3 = new Color(54,88,156);

		Container c = getContentPane();
		c.setBackground(color2);
		c.setLayout(null);
		
	    Login = new JLabel("LOGIN");
		Login.setFont(new Font("휴먼고딕체",Font.BOLD,40));
		c.add(Login);
		Login.setBounds(200, 30, 250, 40);

		name = new JLabel("이름");
		name.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(name);
		name.setBounds(50, 85, 100, 40);
		
		Uname = new JTextField(5);
		Uname.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Uname);
		Uname.setBounds(160, 90, 200, 30);
		
		Uname.addKeyListener(new KeyListener() {;
			public void keyTyped(KeyEvent e) {
				if(Uname.getText().length() > 3)
					Uname.setText(Uname.getText().substring(0, 3));
			}
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
		});
		
		id = new JLabel("학번");
		id.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(id);
		id.setBounds(50, 145, 300, 40);
		
		Uid = new JTextField(10);
		Uid.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Uid);
		Uid.setBounds(160, 150, 200, 30);
		
		Uid.addKeyListener(new KeyListener() {;
		public void keyTyped(KeyEvent e) {
			if(Uid.getText().length() > 8)
				Uid.setText(Uid.getText().substring(0, 8));
		}
		public void keyReleased(KeyEvent e) {}
		public void keyPressed(KeyEvent e) {}
	});
		
		fmajor = new JLabel("제1전공");
		fmajor.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(fmajor);
		fmajor.setBounds(50, 205, 100, 40);
		
		Ufmajor = new JTextField(25);
		Ufmajor.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Ufmajor);
		Ufmajor.setBounds(160, 210, 200, 30);
		Ufmajor.setEnabled(false);
		
		Ufmajorbutton = new JButton("전공선택");
		Ufmajorbutton.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(Ufmajorbutton);
		Ufmajorbutton.setBounds(370, 210, 110, 30);
		Ufmajorbutton.setFocusPainted(false);
		Ufmajorbutton.setBackground(color3);
		Ufmajorbutton.setForeground(color.WHITE);
		
		Ufmajorbutton.addActionListener(new ActionListener() {    // submit 버튼 클릭시 동작하는 리스너 (새로운 프레임 생성(dialog))
			public void actionPerformed(ActionEvent e) {
				select dialog = new select(frame, Ufmajor, Utmajor);
			}
		});
		
		tmajor = new JLabel("복수/부전공");
		tmajor.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(tmajor);
		tmajor.setBounds(50, 265, 100, 40);
		
		Utmajor = new JTextField(25);
		Utmajor.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Utmajor);
		Utmajor.setBounds(160, 270, 200, 30);
		Utmajor.setEnabled(false);
		
		Utmajorbutton = new JButton("전공선택");
		Utmajorbutton.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(Utmajorbutton);
		Utmajorbutton.setBounds(370, 270, 110, 30);
		Utmajorbutton.setFocusPainted(false);
		Utmajorbutton.setBackground(color3);
		Utmajorbutton.setForeground(color.WHITE);
		
		
		Utmajorbutton.addActionListener(new ActionListener() {    // submit 버튼 클릭시 동작하는 리스너 (새로운 프레임 생성(dialog))
			public void actionPerformed(ActionEvent e) {
				select2 dialog2 = new select2(frame, Utmajor, Ufmajor);
			}
		});
		
		dou = new JLabel("(복수/부전공자는 제1전공,복수/부전공을 선택하세요)");
		dou.setFont(new Font("휴먼고딕체",Font.ITALIC,15));
		c.add(dou);
		dou.setBounds(60, 310, 400, 30);
		
		login2 = new JButton("로그인");
		login2.setFont(new Font("휴먼고딕체",Font.BOLD,18));
		c.add(login2);
		login2.setBounds(225, 380, 100, 40);
		login2.setFocusPainted(false);
		login2.setBackground(color3);
		login2.setForeground(color.WHITE);
		
		login2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap<String, Student> studentMap = new HashMap<String, Student>();
				if(Utmajor.getText() == "선택사항없음")
					studentMap.put(Uname.getText(), new Student(Uname.getText(), Uid.getColumns(), 
						        Ufmajor.getText(), null));
				else
					studentMap.put(Uname.getText(), new Student(Uname.getText(), Uid.getColumns(), 
					        Ufmajor.getText(), Utmajor.getText()));
				Uname.setText("");
				Uid.setText("");
				Ufmajor.setText("");
				Utmajor.setText("");
				setVisible(false);
				Main frame = new Main();
			}
		});
		
		setSize(550, 500);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Login frame = new Login();
	}
}
class select extends JDialog {
	JTextField Ufmajor2,Utmajor2 = null;
	JComboBox<String> Usel2 = null;
	public select(JFrame frame, JTextField Ufmajor, JTextField Utmajor) {
		super(frame, true); // true 이면 이전 프레임은 사용 못하게함 (=독점) / false 이면 사용가능

		setTitle("전공선택...");
		setLayout(new FlowLayout());
		String line;

		JComboBox<String> Usel = new JComboBox<String>();
		add(new JScrollPane(Usel));
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\전공.txt"), "euc-kr"));
				while (true) {
					line = reader.readLine();
					if (line == null)
						break;
					Usel.addItem(line);
				}
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		JButton Us = new JButton("선택하기");
		add(Us);
		Ufmajor2 = Ufmajor;
		Utmajor2 = Utmajor;
		Usel2 = Usel;
		Us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((String)Usel2.getSelectedItem()).equals(Utmajor2.getText())) {
					JOptionPane.showMessageDialog(null, "복수전공/부전공과 학과가 같습니다.\n다시 선택하세요.", "전공선택오류", JOptionPane.WARNING_MESSAGE);
					setVisible(false);
					dispose();
					}
					else
				Ufmajor2.setText((String)Usel2.getSelectedItem());
				setVisible(false);
				dispose();
			}
		});
		setSize(200, 150);
		setVisible(true);
	}
}
class select2 extends JDialog {
	JTextField Ufmajor2,Utmajor2 = null;
	JComboBox<String> Usel2 = null;
	public select2(JFrame frame, JTextField Utmajor, JTextField Ufmajor) {
		super(frame, true); // true 이면 이전 프레임은 사용 못하게함 (=독점) / false 이면 사용가능

		setTitle("전공선택...");
		setLayout(new FlowLayout());
		String line;

		JComboBox<String> Usel = new JComboBox<String>();
		add(new JScrollPane(Usel));
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\전공2.txt"), "euc-kr"));
				while (true) {
					line = reader.readLine();
					if (line == null)
						break;
					Usel.addItem(line);
				}
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		JButton Us = new JButton("선택하기");
		add(Us);
		Ufmajor2 = Ufmajor;
		Utmajor2 = Utmajor;
		Usel2 = Usel;
		Us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((String)Usel2.getSelectedItem()).equals(Ufmajor2.getText())) {
				JOptionPane.showMessageDialog(null, "제1전공과 학과가 같습니다.\n다시 선택하세요.", "전공선택오류", JOptionPane.WARNING_MESSAGE);
				setVisible(false);
				dispose();
				}
				else
				Utmajor2.setText((String)Usel2.getSelectedItem());
				setVisible(false);
				dispose();
			}
		});
		setSize(200, 150);
		setVisible(true);
	}
}
