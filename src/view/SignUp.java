package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField pwdField;
	private JTextField nameField;
	private String pwd = "pwd", name = "adm";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public boolean clearFields(JTextField nameField, JPasswordField pwdField) {
		nameField.setText("");
		pwdField.setText("");
		pwdField.setEditable(true);
		nameField.requestFocus();
		
		return true;
	}
	
	public boolean isNameCorrect(JTextField nameField) {
		if (nameField.getText().equals(name)) {
			return true;
		} 
		return false;
	}
	
	public String getPassword() {
		return String.valueOf(pwdField.getPassword());
	}
	
	public boolean isPasswordCorrect(JPasswordField pwdField) {		
		if (getPassword().equals(pwd)) {
			return true;
		}
		
		return false;
	}
	
	public boolean validateCredentials(JTextField nameField, JPasswordField pwdField) {
		if (isNameCorrect(nameField) && isPasswordCorrect(pwdField)) {
			JOptionPane.showMessageDialog(null, "Big ratão approves, now give ya money, bitch.");
		} else if (isNameCorrect(nameField) && !isPasswordCorrect(pwdField)) {
			JOptionPane.showMessageDialog(null, "Senha errada, doidão");
		}else if (nameField == null && pwdField == null) {
			JOptionPane.showMessageDialog(null, "Vai digitar nada mesmo não, tio?");
		} else {
			JOptionPane.showMessageDialog(null, "Errou tudo bixão, quer ajuda ai?");
		} 
		
		return true;
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 481);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Login brabo");
		lblTitle.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 36));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(205, 17, 391, 52);
		contentPane.add(lblTitle);
		
		JLabel pwdLabel = new JLabel("Password");
		pwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		pwdLabel.setBounds(291, 195, 199, 52);
		contentPane.add(pwdLabel);

		pwdField = new JPasswordField();
		pwdField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {				
				if (getPassword().length() == 3 && (int) e.getKeyChar() != 8) {
				  pwdField.setEditable(false);
				} 
				
				if ((int) e.getKeyChar() == 8) {
					pwdField.setEditable(true);
				}
			}
		});
		pwdField.setBounds(205, 258, 387, 46);
		contentPane.add(pwdField);
		pwdField.setColumns(10);
		
		JLabel lblName = new JLabel("Client");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Arial", Font.PLAIN, 24));
		lblName.setBounds(291, 80, 199, 52);
		contentPane.add(lblName);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(205, 138, 387, 46);
		contentPane.add(nameField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(202, 341, 192, 52);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				validateCredentials(nameField, pwdField);
				
				clearFields(nameField, pwdField);
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(404, 341, 192, 52);
		contentPane.add(btnCancel);
	}
}
