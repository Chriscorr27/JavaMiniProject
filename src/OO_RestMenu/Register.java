package OO_RestMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class Register extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField OldUserName;
	private JPasswordField OldPassword;
	private JTextField NewUserName;
	private JPasswordField NewPass1;
	private JPasswordField NewPass2;

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
					Register frame = new Register();
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
	public Register() {
		setResizable(false);
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Old Info");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblNewLabel.setBounds(35, 11, 81, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblUserName.setBounds(10, 53, 81, 26);
		contentPane.add(lblUserName);
		
		OldUserName = new JTextField();
		OldUserName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		OldUserName.setBounds(90, 53, 122, 29);
		contentPane.add(OldUserName);
		OldUserName.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblPassword.setBounds(263, 53, 81, 26);
		contentPane.add(lblPassword);
		
		OldPassword = new JPasswordField();
		OldPassword.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		OldPassword.setBounds(354, 53, 136, 29);
		contentPane.add(OldPassword);
		
		JLabel lblNewInfo = new JLabel("New Info");
		lblNewInfo.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblNewInfo.setBounds(35, 141, 81, 26);
		contentPane.add(lblNewInfo);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblUsername.setBounds(10, 193, 81, 26);
		contentPane.add(lblUsername);
		
		NewUserName = new JTextField();
		NewUserName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		NewUserName.setColumns(10);
		NewUserName.setBounds(90, 192, 122, 29);
		contentPane.add(NewUserName);
		
		JLabel lblPassword_1 = new JLabel("PASSWORD");
		lblPassword_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblPassword_1.setBounds(10, 255, 81, 26);
		contentPane.add(lblPassword_1);
		
		NewPass1 = new JPasswordField();
		NewPass1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		NewPass1.setBounds(97, 252, 136, 29);
		contentPane.add(NewPass1);
		
		JLabel lblPassword_1_1 = new JLabel("PASSWORD2");
		lblPassword_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblPassword_1_1.setBounds(263, 255, 92, 26);
		contentPane.add(lblPassword_1_1);
		
		NewPass2 = new JPasswordField();
		NewPass2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		NewPass2.setBounds(365, 254, 136, 29);
		contentPane.add(NewPass2);
		
		JLabel lblNewLabel_1 = new JLabel(" * Comfirm new password");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(273, 292, 228, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String OUser = OldUserName.getText(); 
				@SuppressWarnings("deprecation")
				String OPass = OldPassword.getText();
				String NUser = NewUserName.getText();
				@SuppressWarnings("deprecation")
				String NPass1 = NewPass1.getText();
				@SuppressWarnings("deprecation")
				String NPass2 = NewPass2.getText();
				String msg = null;
				boolean err= false;
				
				RenameFile rf =  new RenameFile(OUser,OPass,NUser,NPass1,NPass2);
				try {
					rf.Rename();
					JOptionPane.showMessageDialog(contentPane,"Successful Updated");
					Login l = new Login();
					setVisible(false);
					l.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(contentPane,e1.getMessage());
					
				}
				
				
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnSubmit.setBounds(10, 344, 99, 37);
		contentPane.add(btnSubmit);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Comfirm if you want to exit","Restaurant Billing System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
					System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnExit.setBounds(443, 344, 99, 37);
		contentPane.add(btnExit);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				setVisible(false);
				l.setVisible(true);
			}
		});
		btnSignIn.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnSignIn.setBounds(148, 344, 99, 37);
		contentPane.add(btnSignIn);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewPass2.setText("");
				OldUserName.setText("");
				NewPass1.setText("");
				NewUserName.setText("");
				OldPassword.setText("");
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnReset.setBounds(301, 344, 99, 37);
		contentPane.add(btnReset);
	}

}
