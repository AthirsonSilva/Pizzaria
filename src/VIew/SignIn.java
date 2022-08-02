package VIew;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.io.IOException;
import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 481);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pizzaria do rat\u00E3o");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(239, 17, 391, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 24));
		lblAddress.setBounds(82, 80, 199, 52);
		contentPane.add(lblAddress);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(82, 132, 199, 52);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Message");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(82, 301, 199, 52);
		contentPane.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(291, 87, 314, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(291, 139, 314, 46);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Pizza");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(82, 182, 199, 52);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Border");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_1_2.setBounds(82, 238, 199, 52);
		contentPane.add(lblNewLabel_1_1_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("True");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(291, 257, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("False");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(412, 257, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setRows(8);
		textArea.setBounds(291, 319, 314, 101);
		contentPane.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione....", "Massa", "Capim", "Rato", "Quatro"}));
		comboBox.setBounds(291, 196, 314, 39);
		contentPane.add(comboBox);
	}
}
