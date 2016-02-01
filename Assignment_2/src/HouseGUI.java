import java.awt.BorderLayout;


import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int randomYear;
	private int randomSize;
	private Random random = new Random();
	private ArrayList<House> houselist = new ArrayList<House>(); //ArrayList
	private House [] myHouses; //Arraylisten instansieras. 
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 438, 266);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textArea.append("Uppgift 1.2"+ "\n");
		
		House myHouse1 = new House(1907,33);
		House myHouse2 = new House(1952,36);
		House myHouse3 = new House(2015,250);
		
		textArea.append("House 1 is built " + myHouse1.getYearBuilt() + " and is " + myHouse1.getSize() + " kvm" + "\n");
		textArea.append("House 2 is built " + myHouse2.getYearBuilt() + " and is " + myHouse2.getSize() + " kvm" + "\n");
		textArea.append("House 3 is built " + myHouse3.getYearBuilt() + " and is " + myHouse3.getSize() + " kvm" + "\n");
		
		System.out.println("House 1 is built " + myHouse1.getYearBuilt() + " and is " + myHouse1.getSize() + " kvm");
		System.out.println("House 2 is built " + myHouse2.getYearBuilt() + " and is " + myHouse2.getSize() + " kvm");
		System.out.println("House 3 is built " + myHouse3.getYearBuilt() + " and is " + myHouse3.getSize() + " kvm");
		
		//1.3
		
		textArea.append("Uppgift 1.3"+ "\n");
		
		myHouses = new House[10];
		
		myHouses[0] = new House(1907,33);
		myHouses[1] = new House(1952,36);
		myHouses[2] = new House(2015,250);
		myHouses[3] = new House(1980,338);
		myHouses[4] = new House(1940,96);
		myHouses[5] = new House(2003,150);
		myHouses[6] = new House(1967,53);
		myHouses[7] = new House(1983,389);
		myHouses[8] = new House(1032,450);
		myHouses[9] = new House(1999,93);
		
		for(int i = 0; i < 10; i++){
			textArea.append("House " + (i+1) + " is built " + myHouses[i].getYearBuilt() + " and is " + myHouses[i].getSize() + " kvm " + "\n");
		}
		
		//1.4
		
		textArea.append("Uppgift 1.4"+ "\n");
	
		for(int i = 0; i < 100; i++){
		
		randomYear = random.nextInt(House.getMaxYear() - House.getMinYear() + 1) + House.getMinYear();
		randomSize = random.nextInt(House.getMaxSize() - House.getMinSize() + 1) + House.getMinSize();
		
		houselist.add(new House(randomYear, randomSize)); //
		
		System.out.println(houselist.get(i).getYearBuilt() + "\t" + houselist.get(i).getSize());
		textArea.append("House " + (i+1) + " is built " + houselist.get(i).getYearBuilt() + " and is " + houselist.get(i).getSize() + " kvm" + "\n");
	
		}
	}
}

		
		
		

