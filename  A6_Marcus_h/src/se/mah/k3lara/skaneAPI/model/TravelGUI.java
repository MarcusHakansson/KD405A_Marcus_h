package se.mah.k3lara.skaneAPI.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class TravelGUI extends JFrame {
	private JTextField searchField;
	private JTextArea resultArea;
	private ArrayList<Station> searchStations;
	private JTextField fromField;
	private JTextField toField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelGUI frame = new TravelGUI();
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
	public TravelGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 328);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		searchField = new JTextField();
		searchField.setBounds(186, 6, 161, 26);
		contentPane.add(searchField);
		searchField.setColumns(10);

		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultArea.setText("Searching");

				new getStation().start();

			}
		});
		searchButton.setBounds(359, 6, 85, 29);
		contentPane.add(searchButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 44, 582, 127);
		contentPane.add(scrollPane);

		resultArea = new JTextArea();
		scrollPane.setViewportView(resultArea);

		JLabel lblSkDinaResmls = new JLabel("Sök dina resmåls ID");
		lblSkDinaResmls.setBounds(6, 11, 136, 16);
		contentPane.add(lblSkDinaResmls);

		fromField = new JTextField();
		fromField.setBounds(41, 177, 130, 26);
		contentPane.add(fromField);
		fromField.setColumns(10);

		toField = new JTextField();
		toField.setBounds(216, 177, 130, 26);
		contentPane.add(toField);
		toField.setColumns(10);

		JLabel lblFrn = new JLabel("Från");
		lblFrn.setBounds(6, 182, 35, 16);
		contentPane.add(lblFrn);

		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(183, 182, 35, 16);
		contentPane.add(lblTill);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 215, 582, 79);
		contentPane.add(scrollPane_1);

		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);

		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new searchURL().start();
			}
		});
		button.setBounds(359, 177, 85, 29);
		contentPane.add(button);

	}

	public class getStation extends Thread {
		@Override
		public void run() {

			resultArea.setText("");
			searchStations = new ArrayList<Station>();
			searchStations.addAll(Parser.getStationsFromURL(searchField.getText()));
			for (Station s : searchStations) {
				resultArea.append(s.getStationName() + " number:" + s.getStationNbr() + "\n");
			}
		}
	}

	public class searchURL extends Thread {
		@Override
		public void run() {
			resultArea.setText("");
			// Fetches information from two station ID values from which you
			// would like to travel, and how many departures you would like to
			// see.
			String searchURL = Constants.getURL(fromField.getText(), toField.getText(), 1);
																							
			// Gets the information about the journeys.
			Journeys journeys = Parser.getJourneys(searchURL);
			for (Journey journey : journeys.getJourneys()) {
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);
				textArea.setText("Från: " + journey.getStartStation() + " - " + journey.getEndStation() + " Departs "
						+ time + " that is in " + journey.getTimeToDeparture() + " minutes. And it is "
						+ journey.getDepTimeDeviation() + " min late");

			}
		}
	}
}
