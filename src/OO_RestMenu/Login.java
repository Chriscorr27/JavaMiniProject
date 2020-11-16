package OO_RestMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;


/*
 Default username and password :
 username = admin
 password=12345
 */

@SuppressWarnings("unused")
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblUsername.setBounds(10, 21, 89, 38);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		textField.setBounds(110, 22, 132, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblPassword.setBounds(295, 21, 89, 38);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				LoginClass lc = new LoginClass(username,password);
				try {
					lc.Login();
					JOptionPane.showMessageDialog(contentPane,"Successful Login");
					OO_RestMenuFrame menu = new OO_RestMenuFrame();
					setVisible(false);
					menu.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(contentPane,e1.getMessage());
				}
				
				

				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnNewButton.setBounds(10, 113, 99, 37);
		contentPane.add(btnNewButton);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register reg = new Register();
				setVisible(false);
				reg.setVisible(true);
			}
			
		});
		btnChange.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnChange.setBounds(150, 113, 99, 37);
		contentPane.add(btnChange);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnReset.setBounds(285, 113, 99, 37);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Comfirm if you want to exit","Restaurant Billing System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
					System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnExit.setBounds(427, 113, 99, 37);
		contentPane.add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		passwordField.setBounds(393, 21, 133, 38);
		contentPane.add(passwordField);
	}
}
