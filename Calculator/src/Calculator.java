import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldAnswer;
	private JButton btn3;
	private JButton btn4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(10, 23, 180, 47);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(244, 23, 180, 47);
		frame.getContentPane().add(textField2);
		
		JButton btn1 = new JButton("+");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,answer;
				try{
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					answer = num1 + num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please, Enter Valid Number");
				}
			}
		});
		btn1.setBounds(20, 90, 150, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("-");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,answer;
				try{
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					answer = num1 - num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please, Enter Valid Number");
				}
			}
		});
		btn2.setBounds(254, 90, 150, 23);
		frame.getContentPane().add(btn2);
		
		JLabel lblNewLabel = new JLabel("RESULT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(82, 188, 108, 47);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setColumns(10);
		textFieldAnswer.setBounds(244, 188, 180, 47);
		frame.getContentPane().add(textFieldAnswer);
		
		btn3 = new JButton("*");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,answer;
				try{
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					answer = num1 * num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please, Enter Valid Number");
				}
			}
		});
		btn3.setBounds(20, 133, 150, 23);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("/");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double num1,num2,answer;
				try{
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					answer = num1 / num2;
					textFieldAnswer.setText(Double.toString(answer));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please, Enter Valid Number");
				}
			}
		});
		btn4.setBounds(254, 133, 150, 23);
		frame.getContentPane().add(btn4);
	}
}
