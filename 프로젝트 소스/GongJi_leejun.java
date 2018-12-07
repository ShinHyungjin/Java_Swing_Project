package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class GongJi_leejun extends JFrame {

	JFrame frame = this;
	JTextArea rcode = null;
	JButton sbutton = null;
	JTextArea area = null;
	JLabel a = null;

	public GongJi_leejun() {
		setTitle("공지사항");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(new FlowLayout());

		JLabel text = new JLabel();
		contentPane.add(text);
		area = new JTextArea(20, 30);
		area.setFont(new Font("Monospaced",Font.PLAIN,17));
		JButton submit = new JButton("공지사항");
		contentPane.add(submit);

		contentPane.add(area);

		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(frame);
				if (result != JFileChooser.APPROVE_OPTION)
					return;

				String filePath = chooser.getSelectedFile().getPath();
				try {
					BufferedReader reader = new BufferedReader(new FileReader(filePath));
					while (true) {
						String line = reader.readLine();
						if (line == null)
							break;
						area.setText(area.getText() + line);
					}
					reader.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});

		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		GongJi_leejun frame = new GongJi_leejun();
	}
}