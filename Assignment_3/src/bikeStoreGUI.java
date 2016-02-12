import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class bikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField Color;
	private JTextField Price;
	private JTextField Size;

	
	bikeStore Store = new bikeStore();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bikeStoreGUI frame = new bikeStoreGUI();
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
	public bikeStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 108, 456, 91);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

		Color = new JTextField();
		Color.setBounds(27, 263, 130, 26);
		contentPane.add(Color);
		Color.setColumns(10);

		Price = new JTextField();
		Price.setColumns(10);
		Price.setBounds(169, 263, 130, 26);
		contentPane.add(Price);

		Size = new JTextField();
		Size.setColumns(10);
		Size.setBounds(311, 263, 130, 26);
		contentPane.add(Size);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Store.addBike(Color.getText(),Integer.parseInt(Size.getText()),Integer.parseInt(Price.getText()));
			textArea.setText(Store.getAllBikes());
			Color.setText("");
			Price.setText("");
			Size.setText("");
			
			}
		});
		btnSave.setBounds(6, 301, 456, 26);
		contentPane.add(btnSave);

		JLabel lblBike = new JLabel("COLOR");
		lblBike.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		//lblBike.setForeground(Color.WHITE);
		lblBike.setBounds(60, 235, 61, 16);
		contentPane.add(lblBike);

		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		//lblPrice.setForeground(Color.WHITE);
		lblPrice.setBounds(205, 235, 61, 16);
		contentPane.add(lblPrice);

		JLabel lblSize = new JLabel("SIZE");
		lblSize.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		//lblSize.setForeground(Color.WHITE);
		lblSize.setBounds(358, 235, 40, 16);
		contentPane.add(lblSize);
		
		JLabel lblThaBikeShop = new JLabel("THA BIKE SHOP");
		lblThaBikeShop.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		//lblThaBikeShop.setForeground(Color.WHITE);
		lblThaBikeShop.setBounds(155, 48, 220, 26);
		contentPane.add(lblThaBikeShop);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/Marcus/Documents/STUDIER/IxD/PROGRAMMING/GitHub/KD405A_Marcus_h/Assignment_3/Pics/cyklen.jpg"));
		lblNewLabel.setBounds(0, 0, 470, 333);
		contentPane.add(lblNewLabel);
	}
}
