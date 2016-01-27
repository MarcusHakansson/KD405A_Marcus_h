import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Calculator myCalculator = new Calculator();
		
		textField = new JTextField();
		textField.setBounds(16, 6, 237, 99);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton Button_7 = new JButton("7");
		Button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		Button_7.setBounds(16, 117, 71, 47);
		contentPane.add(Button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button_8.setBounds(99, 117, 71, 47);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_9.setBounds(182, 117, 71, 47);
		contentPane.add(button_9);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
			}
		});
		button_plus.setBounds(265, 58, 71, 47);
		contentPane.add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
			}
		});
		button_minus.setBounds(265, 117, 71, 47);
		contentPane.add(button_minus);
		
		JButton Button_mult = new JButton("*");
		Button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
			}
		});
		Button_mult.setBounds(265, 176, 71, 47);
		contentPane.add(Button_mult);
		
		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_equals.setBounds(265, 235, 71, 47);
		contentPane.add(button_equals);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_4.setBounds(16, 176, 71, 47);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_5.setBounds(99, 176, 71, 47);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_6.setBounds(182, 176, 71, 47);
		contentPane.add(button_6);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				myCalculator.numberButtonPressed(1);
				
			}
		});
		button_1.setBounds(16, 235, 71, 47);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_2.setBounds(99, 235, 71, 47);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_3.setBounds(182, 235, 71, 47);
		contentPane.add(button_3);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				myCalculator.clear();
			}
		});
		btnAc.setBounds(265, 6, 71, 47);
		contentPane.add(btnAc);
	}

}
