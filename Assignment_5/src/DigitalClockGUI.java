import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JTextField Hour;
	private JTextField minutes;
	

	public void setTimeOnLabel(String time) {
	}
	
	public void activateAlarm(boolean activate){
	}
	
	Calendar cal = Calendar.getInstance();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlarma = new JLabel("ALARMA");
		lblAlarma.setFont(new Font("OCR A Std", Font.PLAIN, 33));
		lblAlarma.setForeground(Color.WHITE);
		lblAlarma.setBounds(26, 6, 155, 40);
		contentPane.add(lblAlarma);
		
		JTextArea ShowTime = new JTextArea();
		ShowTime.setBounds(204, 6, 177, 53);
		contentPane.add(ShowTime);
		
		System.out.println("Calendar's hour " + 	cal.get(Calendar.HOUR));
		System.out.println("Calendar's min: " +   cal.get(Calendar.MINUTE));
		System.out.println("Calendar's sec: " +     cal.get(Calendar.SECOND));
		
		JTextArea AlarmWhenSet = new JTextArea();
		AlarmWhenSet.setBounds(204, 71, 177, 26);
		contentPane.add(AlarmWhenSet);
		
		Hour = new JTextField();
		Hour.setBounds(6, 49, 97, 26);
		contentPane.add(Hour);
		Hour.setColumns(10);
		
		minutes = new JTextField();
		minutes.setColumns(10);
		minutes.setBounds(100, 49, 97, 26);
		contentPane.add(minutes);
		
		JButton HourButton = new JButton("Set Alarm");
		HourButton.setBounds(6, 77, 97, 29);
		contentPane.add(HourButton);
		
		JButton MinButton = new JButton("Clear Alarm");
		MinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MinButton.setBounds(100, 77, 97, 29);
		contentPane.add(MinButton);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("/Users/Marcus/Documents/STUDIER/IxD/PROGRAMMING/GitHub/KD405A_Marcus_h/Assignment_5/Pics/gradient.jpg"));
		background.setBounds(0, 0, 390, 113);
		contentPane.add(background);
	}
}
