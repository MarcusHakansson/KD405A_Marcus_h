import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class FrogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrogGUI frame = new FrogGUI();
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
	public FrogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Frog frog1 = new Frog(1,"Rolf",100);
		
		String frog1Name = frog1.getName();
		int frogAge = frog1.getAge();
		int frogSize = frog1.getSize();
		
		myFrogs = new Frog[3];
		
		myFrogs[0] = new Frog(70, "Joel", 1);
		myFrogs[1] = new Frog(20, "Boll", 60);
		myFrogs[2] = new Frog(10, "Mästergrodan", 3);
		
		
		
		
		txtText = new JTextField();
		txtText.setText(frog1Name + " " +frogAge+ " " + frogSize);
		txtText.setBounds(108, 72, 228, 144);
		contentPane.add(txtText);
		txtText.setColumns(10);
		
		
	}
}
