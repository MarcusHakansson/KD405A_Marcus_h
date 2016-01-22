package se.mah.kd406A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSlider;
import java.awt.Insets;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtMarcusHkansson;
	private JTextField txtrnstigen;
	private JTextField textField_1;
	private JTextField txtMarcushakanssongmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnMedlemmar = new JMenu("ARKIV");
		menuBar.add(mnMedlemmar);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnMedlemmar.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnMedlemmar.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("MEDLEM");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmSkMedlem = new JMenuItem("Sök medlem");
		mnMedlem.add(mntmSkMedlem);
		
		JMenu mnHjlp = new JMenu("HJÄLP");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 198, 173, 256);
		contentPane.add(scrollPane);
		
		JTextArea txtrLoremOrem = new JTextArea();
		scrollPane.setViewportView(txtrLoremOrem);
		txtrLoremOrem.setText("Madeleine W \nRobin M\rIda H \nMarcus H \nOskar H\nAntonia J\nJohannes J\nJennifer L \nLinn N \nDaniel S\nMadeleine N\nFredrik P\nHampus B\nClara L\nKristoffer H\nSebastian N\nAndrée R\nMarianne B\nBasse W\nElise L\nFreja D\nJonathan H\nEmil B\nMattias W\nMarcus O\nAmina M");
		
		textField = new JTextField();
		textField.setText("2000-03-27");
		textField.setBounds(330, 232, 246, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtMarcusHkansson = new JTextField();
		txtMarcusHkansson.setText("Basse W");
		txtMarcusHkansson.setBounds(330, 194, 246, 26);
		contentPane.add(txtMarcusHkansson);
		txtMarcusHkansson.setColumns(10);
		
		txtrnstigen = new JTextField();
		txtrnstigen.setText("Pyrolavägen 19");
		txtrnstigen.setBounds(330, 270, 246, 26);
		contentPane.add(txtrnstigen);
		txtrnstigen.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("070-441 05 24");
		textField_1.setBounds(330, 308, 246, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtMarcushakanssongmailcom = new JTextField();
		txtMarcushakanssongmailcom.setText("BasseThaMan@hotmail.com");
		txtMarcushakanssongmailcom.setBounds(330, 346, 246, 26);
		contentPane.add(txtMarcushakanssongmailcom);
		txtMarcushakanssongmailcom.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(376, 384, 117, 29);
		contentPane.add(btnSave);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(269, 199, 50, 16);
		contentPane.add(lblNamn);
		
		JLabel lblPernr = new JLabel("Pernr:");
		lblPernr.setBounds(269, 237, 50, 16);
		contentPane.add(lblPernr);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(268, 275, 50, 16);
		contentPane.add(lblAdress);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setBounds(269, 313, 50, 16);
		contentPane.add(lblTel);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setBounds(269, 351, 50, 16);
		contentPane.add(lblMail);
		
		JLabel lblMedlemmar = new JLabel("Medlemmar");
		lblMedlemmar.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblMedlemmar.setBounds(67, 166, 108, 16);
		contentPane.add(lblMedlemmar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/Marcus/Documents/STUDIER/IxD/PROGRAMMING/GitHub/KD405A_Marcus_h/Assignment_1/src/PICS/animal-gym-logo-E441ED8166-seeklogo.com.gif"));
		label.setBounds(23, 16, 200, 138);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/PICS/IMG_20151207_124708.jpg")));
		lblNewLabel.setBounds(376, 16, 146, 166);
		contentPane.add(lblNewLabel);
	}
}
