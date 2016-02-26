import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	protected JTextField Hour1;
	protected JTextField minutes1;
	protected JLabel ShowTime;
	protected JLabel AlarmTime;
	protected JLabel AlarmSet;
	protected JLabel background;
	private Clip clip;
	// private ClockLogic DigitalClockGUI;
	private ClockLogic clockLogic;

	public void setTimeOnLabel(String time) {

		ShowTime.setText(time);

	}

	public void activateAlarm(boolean activate) {

		if (activate == true) {

			try {

				AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(
						"/Users/Marcus/Documents/STUDIER/IxD/PROGRAMMING/GitHub/KD405A_Marcus_h/Assignment_5/Sounds/Alarma.wav")
								.getAbsoluteFile());
				
				clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();

				background.setIcon(new ImageIcon(
						"/Users/Marcus/Documents/STUDIER/IxD/PROGRAMMING/GitHub/KD405A_Marcus_h/Assignment_5/Pics/Red.jpg"));

			} catch (Exception e) {
				e.printStackTrace();
				

			}

		} else {
			background.setIcon(new ImageIcon(
					"/Users/Marcus/Documents/STUDIER/IxD/PROGRAMMING/GitHub/KD405A_Marcus_h/Assignment_5/Pics/gradient.jpg"));
			clip.stop();
		}

	}

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

		AlarmSet = new JLabel("ALARM SET");
		AlarmSet.setFont(new Font("OCR A Std", Font.PLAIN, 13));
		AlarmSet.setForeground(Color.WHITE);
		AlarmSet.setBounds(247, 56, 102, 16);
		contentPane.add(AlarmSet);

		AlarmTime = new JLabel("");
		AlarmTime.setForeground(Color.WHITE);
		AlarmTime.setBounds(267, 82, 61, 16);
		contentPane.add(AlarmTime);

		JLabel lblMin = new JLabel("MIN");
		lblMin.setForeground(Color.WHITE);
		lblMin.setBounds(108, 54, 41, 16);
		contentPane.add(lblMin);

		JLabel lblHour = new JLabel("HOUR");
		lblHour.setForeground(Color.WHITE);
		lblHour.setBounds(6, 54, 41, 16);
		contentPane.add(lblHour);

		ShowTime = new JLabel("");
		ShowTime.setForeground(Color.WHITE);
		ShowTime.setFont(new Font("OCR A Std", Font.PLAIN, 25));
		ShowTime.setBounds(216, 6, 165, 53);
		contentPane.add(ShowTime);

		JLabel lblAlarma = new JLabel("ALARMA");
		lblAlarma.setFont(new Font("OCR A Std", Font.PLAIN, 33));
		lblAlarma.setForeground(Color.WHITE);
		lblAlarma.setBounds(26, 6, 155, 40);
		contentPane.add(lblAlarma);

		Hour1 = new JTextField();
		Hour1.setBounds(53, 49, 50, 26);
		contentPane.add(Hour1);
		Hour1.setColumns(10);

		minutes1 = new JTextField();
		minutes1.setColumns(10);
		minutes1.setBounds(147, 49, 50, 26);
		contentPane.add(minutes1);

		JButton HourButton = new JButton("Set Alarm");
		HourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Integer.parseInt(Hour1.getText()) <= 24) {

				} else {
					JOptionPane.showMessageDialog(null, "Hours must be between 1-24 hours");
				}
				if (Integer.parseInt(minutes1.getText()) >= 0 && Integer.parseInt(minutes1.getText()) <= 59) {
				} else {
					JOptionPane.showMessageDialog(null, "Minutes must be between 0-59 minutes");
				}
				AlarmTime.setText(Hour1.getText() + ":" + minutes1.getText());

				clockLogic.setAlarm(Integer.parseInt(Hour1.getText()), Integer.parseInt(minutes1.getText()));

				Hour1.setText("");
				minutes1.setText("");

			}

		});

		HourButton.setBounds(6, 77, 97, 29);
		contentPane.add(HourButton);

		JButton MinButton = new JButton("Clear Alarm");
		MinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();

			}
		});

		MinButton.setBounds(100, 77, 97, 29);
		contentPane.add(MinButton);

		background = new JLabel("");
		background.setIcon(new ImageIcon(
				"/Users/Marcus/Documents/STUDIER/IxD/PROGRAMMING/GitHub/KD405A_Marcus_h/Assignment_5/Pics/gradient.jpg"));
		background.setBounds(0, 0, 390, 113);
		contentPane.add(background);

		clockLogic = new ClockLogic(this);

	}
}
