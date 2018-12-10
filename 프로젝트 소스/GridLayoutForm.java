package halla.ShinHyungJin;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutForm extends JFrame{
	public GridLayoutForm() {
		setTitle("GridLayoutForm!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Container container = new Container();
		//Container container = getContentPane();
		
		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(30,135,241,88));
		contentPane.setLayout(new GridLayout(4,2));
		//container.setLayout(new GridLayout(4,2));
		
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		//container.add(new JButton("1"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		GridLayoutForm lf = new GridLayoutForm();
	}
}