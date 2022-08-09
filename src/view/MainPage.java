package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setResizable(false);
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
		lblAddress.setBounds(42, 132, 199, 52);
		contentPane.add(lblAddress);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(42, 191, 199, 52);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Message");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(42, 301, 168, 52);
		contentPane.add(lblNewLabel_1_2);

		textField = new JTextField();
		textField.setBounds(205, 139, 387, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 198, 387, 46);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Pizza");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(42, 246, 199, 52);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Com borda");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setBounds(379, 265, 108, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sem borda");
		rdbtnNewRadioButton_1.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_1.setBounds(489, 265, 108, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setLineWrap(true);
		textArea.setRows(8);
		textArea.setBounds(205, 319, 387, 101);
		contentPane.add(textArea);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Selecione....", "Massa", "Capim", "Rato", "Quatro"}));
		comboBox.setBounds(205, 255, 168, 35);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Documents\\Pizzaria\\src\\VIew\\rato.png"));
		lblNewLabel_1.setBounds(62, -78, 833, 442);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAddress_1 = new JLabel("Client");
		lblAddress_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblAddress_1.setBounds(42, 76, 199, 52);
		contentPane.add(lblAddress_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(205, 82, 387, 46);
		contentPane.add(textField_2);
	}
}
