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
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	JFrame frame = null;
	JComboBox Usel = null;
	JLabel name, id, fmajor,tmajor, dou, Login;
	JTextField Uname, Uid, Ufmajor,Utmajor;
	JButton login2, clear, Ufmajorbutton, Utmajorbutton;
	HashSet<String> UserID = new HashSet<String>();
	
	public Login() {
		setTitle("사용자 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		Color color2 = new Color(35,100,21,255);

		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
	    Login = new JLabel("LOGIN");
		Login.setFont(new Font("휴먼고딕체",Font.BOLD,40));
		c.add(Login);
		Login.setBounds(160, 30, 250, 40);

		name = new JLabel("이름");
		name.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(name);
		name.setBounds(50, 85, 100, 40);
		
		Uname = new JTextField(5);
		Uname.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Uname);
		Uname.setBounds(160, 90, 150, 30);
		
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
		id.setBounds(50, 145, 100, 40);
		
		Uid = new JTextField(10);
		Uid.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Uid);
		Uid.setBounds(160, 150, 150, 30);
		
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
		Ufmajor.setBounds(160, 210, 230, 30);
		Ufmajor.setEnabled(false);
		
		Ufmajorbutton = new JButton("전공선택");
		Ufmajorbutton.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(Ufmajorbutton);
		Ufmajorbutton.setBounds(400, 210, 110, 30);
		
		Ufmajorbutton.addActionListener(new ActionListener() {    // submit 버튼 클릭시 동작하는 리스너 (새로운 프레임 생성(dialog))
			public void actionPerformed(ActionEvent e) {
				select dialog = new select(frame, Ufmajor);
			}
		});
		
		tmajor = new JLabel("복수/부전공");
		tmajor.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(tmajor);
		tmajor.setBounds(50, 265, 100, 40);
		
		Utmajor = new JTextField(25);
		Utmajor.setFont(new Font("휴먼고딕체",Font.BOLD,15));
		c.add(Utmajor);
		Utmajor.setBounds(160, 270, 230, 30);
		Utmajor.setEnabled(false);
		
		Utmajorbutton = new JButton("전공선택");
		Utmajorbutton.setFont(new Font("휴먼고딕체",Font.BOLD,17));
		c.add(Utmajorbutton);
		Utmajorbutton.setBounds(400, 270, 110, 30);
		
		Utmajorbutton.addActionListener(new ActionListener() {    // submit 버튼 클릭시 동작하는 리스너 (새로운 프레임 생성(dialog))
			public void actionPerformed(ActionEvent e) {
				select2 dialog2 = new select2(frame, Utmajor);
			}
		});
		
		dou = new JLabel("(복수/부전공자는 제1전공,복수/부전공을 선택하세요)");
		dou.setFont(new Font("휴먼고딕체",Font.ITALIC,15));
		c.add(dou);
		dou.setBounds(60, 310, 400, 30);
		
		login2 = new JButton("로그인");
		login2.setFont(new Font("휴먼고딕체",Font.BOLD,18));
		c.add(login2);
		login2.setBounds(150, 380, 100, 40);
		
		login2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				UserID.add(Uname.getText());
			}
		});
		
		clear = new JButton("초기화");
		clear.setFont(new Font("휴먼고딕체",Font.BOLD,18));
		c.add(clear);
		clear.setBounds(310, 380, 100, 40);
		
		setSize(600, 600);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Login frame = new Login();
	}
}
class select extends JDialog {
	JTextField Ufmajor2 = null;
	JComboBox<String> Usel2 = null;
	public select(JFrame frame, JTextField Ufmajor) {
		super(frame, true); // true 이면 이전 프레임은 사용 못하게함 (=독점) / false 이면 사용가능
		
		setTitle("전공선택...");
		setLayout(new FlowLayout());
		String line;
		Ufmajor2 = Ufmajor;

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
		Usel2 = Usel;
		Us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
	JTextField Utmajor2 = null;
	JComboBox<String> Usel2 = null;
	public select2(JFrame frame, JTextField Utmajor) {
		super(frame, true); // true 이면 이전 프레임은 사용 못하게함 (=독점) / false 이면 사용가능

		setTitle("전공선택...");
		setLayout(new FlowLayout());
		String line;
		Utmajor2 = Utmajor;

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
		Usel2 = Usel;
		Us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utmajor2.setText((String)Usel2.getSelectedItem());
				setVisible(false);
				dispose();
			}
		});
		setSize(200, 150);
		setVisible(true);
	}
}