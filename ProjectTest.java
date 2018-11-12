package Team4.AutoProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProjectTest extends JFrame {
	public ProjectTest() {
		setTitle("로그인-회원정보 입력");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 여러 프레임중 하나만 끄고싶으면 windowListner 이용. 다만 클래스를 여러개 생성하면 이럴필요 X
		Font font = new Font("Arial", Font.BOLD, 20);
		Color color = new Color(75,200,180,178);

		Container contentPane = getContentPane();
		contentPane.setBackground(color);
		contentPane.setLayout(null);

		JLabel la = new JLabel("Welcome to Team4 Project!");
		la.setLocation(170, 8);
		la.setSize(400, 80);
		la.setForeground(Color.YELLOW);
		la.setFont(font);
		contentPane.add(la);

		setSize(640, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		ProjectTest frame = new ProjectTest();
	}
}
