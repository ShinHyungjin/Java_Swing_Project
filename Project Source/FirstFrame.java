package Team4_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class FirstFrame extends JFrame {

	private JPanel contentPane;
	private JTextField UserID;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FirstFrame() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("\uC790\uB3D9\uC218\uAC15\uC2E0\uCCAD \uBC0F \uD559\uC810\uAD00\uB9AC \uC2DC\uC2A4\uD15C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel ID = new JLabel("\uD559\uBC88");
		ID.setHorizontalAlignment(SwingConstants.LEFT);
		ID.setForeground(new Color(0, 0, 0));
		ID.setBackground(new Color(175, 238, 238));
		ID.setFont(new Font("ÇÑÄÄµ¸¿ò", Font.BOLD, 16));
		
		UserID = new JTextField();
		UserID.setFont(new Font("ÇÑÄÄµ¸¿ò", Font.BOLD, 16));
		UserID.setColumns(12);
		
		JLabel name = new JLabel("\uC774\uB984");
		name.setBackground(new Color(175, 238, 238));
		name.setFont(new Font("ÇÑÄÄµ¸¿ò", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("ÇÑÄÄµ¸¿ò", Font.BOLD, 16));
		textField.setColumns(12);
		
		JLabel major = new JLabel("\uD559\uACFC(\uD559\uBD80)");
		major.setBackground(new Color(175, 238, 238));
		major.setFont(new Font("ÇÑÄÄµ¸¿ò", Font.BOLD, 16));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("ÇÑÄÄµ¸¿ò", Font.BOLD, 16));
		textField_1.setColumns(12);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(ID);
		contentPane.add(UserID);
		contentPane.add(name);
		contentPane.add(textField);
		contentPane.add(major);
		contentPane.add(textField_1);
		
		JButton login = new JButton("\uB85C\uADF8\uC778");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		login.setAction(action);
		login.setBackground(new Color(250, 250, 210));
		login.setFont(new Font("ÇÑÄÄµ¸¿ò", Font.BOLD, 15));
		contentPane.add(login);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
