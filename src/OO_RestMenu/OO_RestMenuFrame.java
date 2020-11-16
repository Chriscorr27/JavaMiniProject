package OO_RestMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;


@SuppressWarnings({ "unused", "serial" })
public class OO_RestMenuFrame extends JFrame {

	private JPanel RestTitle;
	private JTextField TxtChic_FR;
	private JTextField TxtChic_Soup;
	private JTextField TxtVeg_Rice;
	private JTextField TxtPaneer_Fried;
	private JTextField TxtMS;
	private JTextField TxtCoca;
	private JTextField TxtFrooti;
	private JTextField TxtCOM;
	private JTextField TxtCOD;
	private JTextField TxtSub1;
	private JTextField TxtTax;
	private JTextField TxtSub2;
	private JTextField TxtTotal;

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
					OO_RestMenuFrame frame = new OO_RestMenuFrame();
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
	public OO_RestMenuFrame() {
		setType(Type.UTILITY);
		setAlwaysOnTop(true);
		setTitle("JAVA MINI PROJECT");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 968, 686);
		RestTitle = new JPanel();
		RestTitle.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(RestTitle);
		RestTitle.setLayout(null);
		
		JPanel mainTitlePanel = new JPanel();
		mainTitlePanel.setBackground(Color.BLACK);
		mainTitlePanel.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		mainTitlePanel.setForeground(new Color(0, 0, 0));
		mainTitlePanel.setBounds(0, 0, 962, 156);
		RestTitle.add(mainTitlePanel);
		mainTitlePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT BILL SYSTEM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 60));
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(83, 11, 850, 134);
		mainTitlePanel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panel_1.setBounds(0, 167, 304, 229);
		RestTitle.add(panel_1);
		panel_1.setLayout(null);
		
		TxtChic_FR = new JTextField();
		TxtChic_FR.setText("0");
		TxtChic_FR.setHorizontalAlignment(SwingConstants.CENTER);
		TxtChic_FR.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtChic_FR.setBounds(185, 49, 92, 29);
		panel_1.add(TxtChic_FR);
		TxtChic_FR.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Meal");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(130, 11, 101, 39);
		panel_1.add(lblNewLabel_1);
		
		TxtChic_Soup = new JTextField();
		TxtChic_Soup.setForeground(new Color(0, 0, 0));
		TxtChic_Soup.setText("0");
		TxtChic_Soup.setHorizontalAlignment(SwingConstants.CENTER);
		TxtChic_Soup.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtChic_Soup.setColumns(10);
		TxtChic_Soup.setBounds(185, 89, 92, 29);
		panel_1.add(TxtChic_Soup);
		
		TxtVeg_Rice = new JTextField();
		TxtVeg_Rice.setHorizontalAlignment(SwingConstants.CENTER);
		TxtVeg_Rice.setText("0");
		TxtVeg_Rice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtVeg_Rice.setColumns(10);
		TxtVeg_Rice.setBounds(185, 129, 92, 29);
		panel_1.add(TxtVeg_Rice);
		
		TxtPaneer_Fried = new JTextField();
		TxtPaneer_Fried.setHorizontalAlignment(SwingConstants.CENTER);
		TxtPaneer_Fried.setText("0");
		TxtPaneer_Fried.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtPaneer_Fried.setColumns(10);
		TxtPaneer_Fried.setBounds(185, 172, 92, 29);
		panel_1.add(TxtPaneer_Fried);
		
		JLabel lblNewLabel_2 = new JLabel("Chic. Fried Rice");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(34, 49, 124, 25);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Chic. Soup");
		lblNewLabel_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(34, 89, 124, 25);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Veg Rice");
		lblNewLabel_2_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(34, 129, 124, 25);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Paneer Fried");
		lblNewLabel_2_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(34, 172, 124, 25);
		panel_1.add(lblNewLabel_2_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panel_3.setBounds(0, 398, 304, 161);
		RestTitle.add(panel_3);
		panel_3.setLayout(null);
		
		TxtCOM = new JTextField();
		TxtCOM.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtCOM.setHorizontalAlignment(SwingConstants.CENTER);
		TxtCOM.setColumns(10);
		TxtCOM.setBounds(146, 32, 129, 29);
		panel_3.add(TxtCOM);
		
		TxtCOD = new JTextField();
		TxtCOD.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtCOD.setHorizontalAlignment(SwingConstants.CENTER);
		TxtCOD.setColumns(10);
		TxtCOD.setBounds(146, 72, 129, 29);
		panel_3.add(TxtCOD);
		
		JLabel lblNewLabel_2_5 = new JLabel("Cost of Meal");
		lblNewLabel_2_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5.setBounds(27, 36, 109, 25);
		panel_3.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Cost of Drinks");
		lblNewLabel_2_5_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_1.setBounds(27, 76, 109, 25);
		panel_3.add(lblNewLabel_2_5_1);
		
		TxtSub1 = new JTextField();
		TxtSub1.setHorizontalAlignment(SwingConstants.CENTER);
		TxtSub1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtSub1.setColumns(10);
		TxtSub1.setBounds(146, 112, 129, 29);
		panel_3.add(TxtSub1);
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("SubTotal");
		lblNewLabel_2_5_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_5_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_1_1.setBounds(27, 116, 109, 25);
		panel_3.add(lblNewLabel_2_5_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(Color.BLACK);
		panel_4.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panel_4.setBounds(639, 167, 323, 480);
		RestTitle.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Recipt");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBounds(136, 11, 101, 39);
		panel_4.add(lblNewLabel_1_1_1);
		
		JTextArea Recipt = new JTextArea();
		Recipt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Recipt.setBounds(20, 47, 282, 409);
		panel_4.add(Recipt);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panel_1_1.setBounds(314, 167, 304, 229);
		RestTitle.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Drinks");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(127, 11, 101, 39);
		panel_1_1.add(lblNewLabel_1_1);
		
		TxtMS = new JTextField();
		TxtMS.setText("0");
		TxtMS.setHorizontalAlignment(SwingConstants.CENTER);
		TxtMS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtMS.setColumns(10);
		TxtMS.setBounds(185, 47, 92, 29);
		panel_1_1.add(TxtMS);
		
		TxtCoca = new JTextField();
		TxtCoca.setText("0");
		TxtCoca.setHorizontalAlignment(SwingConstants.CENTER);
		TxtCoca.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtCoca.setColumns(10);
		TxtCoca.setBounds(185, 99, 92, 29);
		panel_1_1.add(TxtCoca);
		
		TxtFrooti = new JTextField();
		TxtFrooti.setText("0");
		TxtFrooti.setHorizontalAlignment(SwingConstants.CENTER);
		TxtFrooti.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtFrooti.setColumns(10);
		TxtFrooti.setBounds(185, 147, 92, 29);
		panel_1_1.add(TxtFrooti);
		
		JLabel lblNewLabel_2_4 = new JLabel("Milkshake");
		lblNewLabel_2_4.setForeground(new Color(64, 64, 64));
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_4.setBounds(51, 51, 124, 25);
		panel_1_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Coca-Cola");
		lblNewLabel_2_4_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_4_1.setBounds(51, 99, 124, 25);
		panel_1_1.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Frooti");
		lblNewLabel_2_4_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_4_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_4_2.setBounds(51, 147, 124, 25);
		panel_1_1.add(lblNewLabel_2_4_2);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setForeground(Color.BLACK);
		panel_3_2.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panel_3_2.setBounds(0, 562, 618, 85);
		RestTitle.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Bill bill = new Bill();
				bill.QuantityOfFrooti=Integer.parseInt(TxtFrooti.getText());
				bill.QuantityOfCoca=Integer.parseInt(TxtCoca.getText());
				bill.QuantityOfMS=Integer.parseInt(TxtMS.getText());
				bill.QuantityOfPaneer_Fried=Integer.parseInt(TxtPaneer_Fried.getText());
				bill.QuantityOfChic_Soup=Integer.parseInt(TxtChic_Soup.getText());
				bill.QuantityOfVeg_Rice=Integer.parseInt(TxtVeg_Rice.getText());
				bill.QuantityOfChic_FR=Integer.parseInt(TxtChic_FR.getText());
				String subTotal="Rs. "+Double.toString(bill.getSubTotal());
				String total = "Rs. "+Double.toString(bill.getTotal());
				String tax = "Rs. "+Double.toString(bill.Tax);
				TxtCOD.setText("Rs. "+Double.toString(bill.CostOfDrinks));
				TxtCOM.setText("Rs. "+Double.toString(bill.CostOfMeal));
				TxtSub1.setText(subTotal);
				TxtTax.setText(tax);
				TxtSub2.setText(subTotal);
				TxtTotal.setText(total);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(mainTitlePanel,"Quantity of items should be in integer");
					
				}
			}
		});
		btnTotal.setBackground(Color.LIGHT_GRAY);
		btnTotal.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnTotal.setBounds(23, 24, 113, 37);
		panel_3_2.add(btnTotal);
		
		JButton btnRecipt = new JButton("Recipt");
		btnRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int refs = 1325 + (int) (Math.random()*4238);
				
				//########################################################//
				Calendar timer = Calendar.getInstance();
				SimpleDateFormat fTime = new SimpleDateFormat("HH:mm:ss");
				SimpleDateFormat fDate = new SimpleDateFormat("dd-MM:yyyy");
				Recipt.append("                Restaurant Billing System:\n\n"+
							"   Reference:\t\t                  "+refs+
							"\n========================================\n"+
							"   Meals:\t\t       "+TxtCOM.getText()+"\n\n"+
							"   Drinks:\t\t       "+TxtCOD.getText()+"\n\n"+
							"   Cost of Items:\t       "+TxtSub1.getText()+"\n\n"+
							"========================================\n"+
							"   Tax:\t\t        "+TxtTax.getText()+"\n\n"+
							"   SubTotal:\t\t       "+TxtSub2.getText()+"\n\n"+
							"   Total:\t\t       "+TxtTotal.getText()+"\n\n"+
							"========================================\n"+
							"   Date: "+fDate.format(timer.getTime())+
							"\tTime: "+fTime.format(timer.getTime())+
							"\n\n\t     Thank You "
						);
				
			}
		});
		btnRecipt.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnRecipt.setBackground(Color.LIGHT_GRAY);
		btnRecipt.setBounds(172, 24, 113, 37);
		panel_3_2.add(btnRecipt);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtFrooti.setText("0");
				TxtCoca.setText("0");
				TxtMS.setText("0");
				TxtPaneer_Fried.setText("0");
				TxtChic_Soup.setText("0");
				TxtVeg_Rice.setText("0");
				TxtChic_FR.setText("0");
				TxtCOD.setText("");
				TxtCOM.setText("");
				TxtSub1.setText("");
				TxtTax.setText("");
				TxtSub2.setText("");
				TxtTotal.setText("");
				Recipt.setText("");
				
			}
			
		});
		btnClear.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(325, 24, 113, 37);
		panel_3_2.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(mainTitlePanel, "Comfirm if you want to exit","Restaurant Billing System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
					System.exit(0);
				
			}
				
		
		});
		btnExit.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(482, 24, 113, 37);
		panel_3_2.add(btnExit);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setForeground(Color.BLACK);
		panel_3_1.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panel_3_1.setBounds(314, 398, 304, 161);
		RestTitle.add(panel_3_1);
		
		TxtTax = new JTextField();
		TxtTax.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtTax.setHorizontalAlignment(SwingConstants.CENTER);
		TxtTax.setColumns(10);
		TxtTax.setBounds(146, 32, 129, 29);
		panel_3_1.add(TxtTax);
		
		TxtSub2 = new JTextField();
		TxtSub2.setHorizontalAlignment(SwingConstants.CENTER);
		TxtSub2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtSub2.setColumns(10);
		TxtSub2.setBounds(146, 72, 129, 29);
		panel_3_1.add(TxtSub2);
		
		JLabel lblNewLabel_2_5_2 = new JLabel("Tax");
		lblNewLabel_2_5_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_5_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_2.setBounds(27, 36, 109, 25);
		panel_3_1.add(lblNewLabel_2_5_2);
		
		JLabel lblNewLabel_2_5_1_2 = new JLabel("SubTotal");
		lblNewLabel_2_5_1_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_5_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_1_2.setBounds(27, 76, 109, 25);
		panel_3_1.add(lblNewLabel_2_5_1_2);
		
		TxtTotal = new JTextField();
		TxtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		TxtTotal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TxtTotal.setColumns(10);
		TxtTotal.setBounds(146, 112, 129, 29);
		panel_3_1.add(TxtTotal);
		
		JLabel lblNewLabel_2_5_1_1_1 = new JLabel("Total");
		lblNewLabel_2_5_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_5_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_1_1_1.setBounds(27, 116, 109, 25);
		panel_3_1.add(lblNewLabel_2_5_1_1_1);
	}
}
