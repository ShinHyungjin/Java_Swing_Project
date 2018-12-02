package Team4_Project;

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
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	public JFrame frame = null;
	public JComboBox Usel = null;
	public JLabel name, id, fmajor,tmajor, dou, Login;
	public JTextField Uname, Uid, Ufmajor,Utmajor;
	public JButton login2, Ufmajorbutton, Utmajorbutton;
	
	public Login() {
		setTitle("����� �α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		Color color2 = new Color(35,100,21,255);

		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		
	    Login = new JLabel("LOGIN");
		Login.setFont(new Font("�޸հ��ü",Font.BOLD,40));
		c.add(Login);
		Login.setBounds(160, 30, 250, 40);

		name = new JLabel("�̸�");
		name.setFont(new Font("�޸հ��ü",Font.BOLD,17));
		c.add(name);
		name.setBounds(50, 85, 100, 40);
		
		Uname = new JTextField(5);
		Uname.setFont(new Font("�޸հ��ü",Font.BOLD,15));
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
		
		id = new JLabel("�й�");
		id.setFont(new Font("�޸հ��ü",Font.BOLD,17));
		c.add(id);
		id.setBounds(50, 145, 100, 40);
		
		Uid = new JTextField(10);
		Uid.setFont(new Font("�޸հ��ü",Font.BOLD,15));
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
		
		fmajor = new JLabel("��1����");
		fmajor.setFont(new Font("�޸հ��ü",Font.BOLD,17));
		c.add(fmajor);
		fmajor.setBounds(50, 205, 100, 40);
		
		Ufmajor = new JTextField(25);
		Ufmajor.setFont(new Font("�޸հ��ü",Font.BOLD,15));
		c.add(Ufmajor);
		Ufmajor.setBounds(160, 210, 230, 30);
		Ufmajor.setEnabled(false);
		
		Ufmajorbutton = new JButton("��������");
		Ufmajorbutton.setFont(new Font("�޸հ��ü",Font.BOLD,17));
		c.add(Ufmajorbutton);
		Ufmajorbutton.setBounds(400, 210, 110, 30);
		
		Ufmajorbutton.addActionListener(new ActionListener() {    // submit ��ư Ŭ���� �����ϴ� ������ (���ο� ������ ����(dialog))
			public void actionPerformed(ActionEvent e) {
				select dialog = new select(frame, Ufmajor);
			}
		});
		
		tmajor = new JLabel("����/������");
		tmajor.setFont(new Font("�޸հ��ü",Font.BOLD,17));
		c.add(tmajor);
		tmajor.setBounds(50, 265, 100, 40);
		
		Utmajor = new JTextField(25);
		Utmajor.setFont(new Font("�޸հ��ü",Font.BOLD,15));
		c.add(Utmajor);
		Utmajor.setBounds(160, 270, 230, 30);
		Utmajor.setEnabled(false);
		
		Utmajorbutton = new JButton("��������");
		Utmajorbutton.setFont(new Font("�޸հ��ü",Font.BOLD,17));
		c.add(Utmajorbutton);
		Utmajorbutton.setBounds(400, 270, 110, 30);
		
		Utmajorbutton.addActionListener(new ActionListener() {    // submit ��ư Ŭ���� �����ϴ� ������ (���ο� ������ ����(dialog))
			public void actionPerformed(ActionEvent e) {
				select2 dialog2 = new select2(frame, Utmajor);
			}
		});
		
		dou = new JLabel("(����/�������ڴ� ��1����,����/�������� �����ϼ���)");
		dou.setFont(new Font("�޸հ��ü",Font.ITALIC,15));
		c.add(dou);
		dou.setBounds(60, 310, 400, 30);
		
		login2 = new JButton("�α���");
		login2.setFont(new Font("�޸հ��ü",Font.BOLD,18));
		c.add(login2);
		login2.setBounds(220, 380, 100, 40);
		
		login2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap<String, Student> studentMap = new HashMap<String, Student>();
				if(Utmajor.getText() == "���û��׾���")
					studentMap.put(Uname.getText(), new Student(Uname.getText(), Uid.getColumns(), 
						        Ufmajor.getText(), null));
				else
					studentMap.put(Uname.getText(), new Student(Uname.getText(), Uid.getColumns(), 
					        Ufmajor.getText(), Utmajor.getText()));
				setVisible(false);
				Credit frame = new Credit();
			}
		});
		
		setSize(600, 500);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		Login frame = new Login();
	}
}
class select extends JDialog {
	public select(JFrame frame, JTextField Ufmajor) {
		super(frame, true); // true �̸� ���� �������� ��� ���ϰ��� (=����) / false �̸� ��밡��

		setTitle("��������...");
		setLayout(new FlowLayout());
		String line;

		JComboBox<String> Usel = new JComboBox<String>();
		add(new JScrollPane(Usel));
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\����.txt"), "euc-kr"));
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
		JButton Us = new JButton("�����ϱ�");
		add(Us);
		Us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ufmajor.setText((String)Usel.getSelectedItem());
				setVisible(false);
				dispose();
			}
		});
		setSize(200, 150);
		setVisible(true);
	}
}
class select2 extends JDialog {
	public select2(JFrame frame, JTextField Utmajor) {
		super(frame, true); // true �̸� ���� �������� ��� ���ϰ��� (=����) / false �̸� ��밡��

		setTitle("��������...");
		setLayout(new FlowLayout());
		String line;

		JComboBox<String> Usel = new JComboBox<String>();
		add(new JScrollPane(Usel));
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\����2.txt"), "euc-kr"));
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
		JButton Us = new JButton("�����ϱ�");
		add(Us);
		Us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utmajor.setText((String)Usel.getSelectedItem());
				setVisible(false);
				dispose();
			}
		});
		setSize(200, 150);
		setVisible(true);
	}
}