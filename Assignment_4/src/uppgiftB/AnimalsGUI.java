package uppgiftB;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AnimalsGUI extends JFrame {

	private JPanel contentPane;
	static JTextArea textArea;
	
	public static ArrayList <Animal> animalList = new ArrayList<Animal>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		/**adds Animals to the arraylist */
		//Dog has this order String latinName, int gestationTime, boolean stupid, String friendlyName
		animalList.add(new Dog("Lycaon pictus",60,false));
		animalList.add(new Dog("Canis lupus familiaris",60,true,"Bilbo"));
		animalList.add(new Dog("Lycaon pictus",60,false));
		animalList.add(new Dog("Canis lupus familiaris",60,true, "Rickard"));
		//Snake has this order (String friendlyName,String latinName,boolean poisonus)
		animalList.add(new Snake("Lucas","Serpentes", false));
		animalList.add(new Snake("Oskar","Serpentes", true ));
		animalList.add(new Snake("Bubba","Serpentes", false ));
		animalList.add(new Snake("Rickard","Serpentes",true));
		//Cat has this order Cat(String latinName, int gestationTime, int numberOfLifes)
		animalList.add(new Cat("Felis catus",65,9));
		animalList.add(new Cat("Felis catus",65,5));
		animalList.add(new Cat("Felis catus",65,9));
		animalList.add(new Cat("Felis catus",65,9));
		for (Animal Animals : animalList){
			System.out.println(Animals.getInfo());

			
			
		}
		
	}

	/**
	 * Create the frame.
	 */
	public AnimalsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 23, 723, 317);
		contentPane.add(scrollPane);
		
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		
		for (Animal Animals : animalList){
		textArea_1.append(Animals.getInfo()+"\n");
		}
		
	}
	
	
}
