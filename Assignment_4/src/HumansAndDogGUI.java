import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumansAndDogGUI extends JFrame {

	private String humanName;
	private JPanel contentPane;
	private JTextField NewHuman;
	private JTextField BuyDog;
	JTextArea textArea;
	
	Human Human1;
	Dog Dog1;
	
	
	
	
	JTextArea textArea_errorMessages;
	private JLabel lblErrorMessages;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogGUI frame = new HumansAndDogGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public HumansAndDogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/**Forces the name to be more then 3 letter, otherwise prints error message*/
			if(NewHuman.getText().length() < 3){
				textArea_errorMessages.setText("Du måste skriva in ett namn som är längre än 3 bokstäver");
		
			}
			
			Human1 = new Human(NewHuman.getText());
			
			textArea.setText(Human1.getName());
			
			
			}
		
			
		});
		btnNewButton.setBounds(220, 6, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(NewHuman.getText().isEmpty()){
					textArea_errorMessages.setText("För att köpa en hund måste den ha en ägare först");
					
				}else{
					
					Dog1 = new Dog(BuyDog.getText());
					
					Human1.buyDog(Dog1);
					
					textArea.setText(Dog1.getName());
					
					BuyDog.setText("");
				}
			}
		});
		btnBuyDog.setBounds(220, 47, 117, 29);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			textArea.setText(Human1.getInfo(Human1.getName()));
				
				
			}
		});
		btnPrintInfo.setBounds(220, 88, 117, 29);
		contentPane.add(btnPrintInfo);
		
		NewHuman = new JTextField();
		NewHuman.setBounds(52, 6, 130, 26);
		contentPane.add(NewHuman);
		NewHuman.setColumns(10);
		
		BuyDog = new JTextField();
		BuyDog.setColumns(10);
		BuyDog.setBounds(52, 47, 130, 26);
		contentPane.add(BuyDog);
		
		textArea = new JTextArea();
		textArea.setBounds(52, 129, 356, 51);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Info");
		lblNewLabel.setBounds(52, 109, 61, 16);
		contentPane.add(lblNewLabel);
		
		textArea_errorMessages = new JTextArea();
		textArea_errorMessages.setBounds(52, 216, 356, 56);
		contentPane.add(textArea_errorMessages);
		
		lblErrorMessages = new JLabel("Error Messages");
		lblErrorMessages.setBounds(52, 192, 100, 16);
		contentPane.add(lblErrorMessages);
	}
}
