import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Choice;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TryIt extends JFrame {

	private JPanel contentPane;
	private static JComboBox<Screen> c_1;
	private Random rand = new Random();
	private JTextField PixelHightField;
	private JTextField PixelWidthField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
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
	public TryIt() {
		
		/**chooseScreen thread = new chooseScreen();
		thread.start();
		*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Creates a dropdown list to choose screen
		c_1 = new JComboBox<Screen>();
		c_1.setBounds(218, 44, 213, 29);
		contentPane.add(c_1);
		c_1.addItem(Screen.ASSIGNMENT_7);
		c_1.addItem(Screen.FLOOR_5);
		c_1.addItem(Screen.MEDEA_1);
		c_1.addItem(Screen.MEDEA_2);
		c_1.addItem(Screen.MEDEA_3);
		
		
		JButton btnPushToHack = new JButton("Push to HACK");
		btnPushToHack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Chooses the object in the droplistArray and makes it in to a String. 
				Object cs = c_1.getSelectedItem();
				cs.toString();
				System.out.println(cs);
				
				PixelController px = PixelController.getInstance((Screen) cs);
				
				/** First try at hacking screens, makin pixel mania
				float r = rand.nextFloat();
				float g = rand.nextFloat();
				float b = rand.nextFloat();
				
				int i = rand.nextInt(50);
				
				Color randomColor = new Color(r, g, b);
				
				px.setPixel(20+i, 10+i, randomColor);
				px.setPixel(21+i, 9+i, randomColor);
				px.setPixel(22+i, 9+i, randomColor);
				px.setPixel(23+i, 9+i, randomColor);
				px.setPixel(24+i, 10+i, randomColor);
				
				*/
				
				int m = Integer.parseInt(PixelHightField.getText());
				
				//for(int m = 0; m<1 m++){

				px.setPixel(1+m,3+m,Color.RED);
				px.setPixel(1+m,4+m,Color.RED);
				px.setPixel(1+m,5+m,Color.RED);
				px.setPixel(1+m,6+m,Color.RED);
				px.setPixel(1+m,12+m,Color.RED);
				px.setPixel(1+m,13+m,Color.RED);
				px.setPixel(1+m,14+m,Color.RED);
				px.setPixel(1+m,15+m,Color.RED);
				
				px.setPixel(2+m,2+m,Color.RED);
				px.setPixel(2+m,7+m,Color.RED);
				px.setPixel(2+m,11+m,Color.RED);
				px.setPixel(2+m,16+m,Color.RED);

				px.setPixel(3+m,1+m,Color.RED);
				px.setPixel(3+m,8+m,Color.RED);
				px.setPixel(3+m,10+m,Color.RED);
				px.setPixel(3+m,17+m,Color.RED);

				px.setPixel(4+m,1+m,Color.RED);
				px.setPixel(4+m,9+m,Color.RED);
				px.setPixel(4+m,17+m,Color.RED);

				px.setPixel(5+m,1+m,Color.RED);
				px.setPixel(5+m,17+m,Color.RED);

				px.setPixel(6+m,1+m,Color.RED);
				px.setPixel(6+m,17+m,Color.RED);

				px.setPixel(7+m,1+m,Color.RED);
				px.setPixel(7+m,17+m,Color.RED);

				px.setPixel(8+m,1+m,Color.RED);
				px.setPixel(8+m,17+m,Color.RED);

				px.setPixel(9+m,2+m,Color.RED);
				px.setPixel(9+m,16+m,Color.RED);

				px.setPixel(10+m,3+m,Color.RED);
				px.setPixel(10+m,15+m,Color.RED);

				px.setPixel(11+m,4+m,Color.RED);
				px.setPixel(11+m,14+m,Color.RED);

				px.setPixel(12+m,5+m,Color.RED);
				px.setPixel(12+m,13+m,Color.RED);

				px.setPixel(13+m,6+m,Color.RED);
				px.setPixel(13+m,12+m,Color.RED);

				px.setPixel(14+m,7+m,Color.RED);
				px.setPixel(14+m,11+m,Color.RED);

				px.setPixel(15+m,8+m,Color.RED);
				px.setPixel(15+m,10+m,Color.RED);

				px.setPixel(16+m,9+m,Color.RED);
			
				
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
				}
			//}
			
		});
		btnPushToHack.setBounds(26, 121, 405, 136);
		contentPane.add(btnPushToHack);
		
		JLabel lblChooseScreenTo = new JLabel("Choose Screen to HACK");
		lblChooseScreenTo.setBounds(26, 49, 155, 16);
		contentPane.add(lblChooseScreenTo);
		
		JLabel lblSetPixels = new JLabel("Set pixels  for position");
		lblSetPixels.setBounds(26, 93, 155, 16);
		contentPane.add(lblSetPixels);
		
		PixelHightField = new JTextField();
		PixelHightField.setBounds(266, 85, 51, 26);
		contentPane.add(PixelHightField);
		PixelHightField.setColumns(10);
		
		PixelWidthField = new JTextField();
		PixelWidthField.setColumns(10);
		PixelWidthField.setBounds(380, 85, 51, 26);
		contentPane.add(PixelWidthField);
		
		JLabel lblHight = new JLabel("Hight");
		lblHight.setBounds(220, 90, 61, 16);
		contentPane.add(lblHight);
		
		JLabel lblWidth = new JLabel("Width ");
		lblWidth.setBounds(329, 90, 61, 16);
		contentPane.add(lblWidth);
	}
	
	public void paintHeart(){	
		
	}
	
}
