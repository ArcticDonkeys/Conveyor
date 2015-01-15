package UserInterfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JComboBox;

import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
class ImagePanel extends JPanel {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;

	  public ImagePanel(String img) {
	    this(new ImageIcon(img).getImage());
	  }

	  public ImagePanel(Image img) {
	    this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	  }

	  public void paintComponent(Graphics g) {
	    g.drawImage(img, 0, 0, null);
	  }
	}

public class UserInterface {

	private JFrame frmArcticDonkeys;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					UserInterface window = new UserInterface();
					window.frmArcticDonkeys.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImagePanel panel2 = new ImagePanel(new ImageIcon("/images/background.png").getImage());
		frmArcticDonkeys = new JFrame();
		frmArcticDonkeys.setTitle("Arctic Donkeys");
		frmArcticDonkeys.getContentPane().add(panel2);
		frmArcticDonkeys.setIconImage(Toolkit.getDefaultToolkit().getImage("/images/arcticdonkeylogo.jpg"));
		frmArcticDonkeys.setBounds(100, 100, 674, 423);
		frmArcticDonkeys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel() {  
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {  
                 Image img = Toolkit.getDefaultToolkit().getImage(  
                          UserInterface.class.getResource("/images/background.jpg"));  
                 g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
		};  
        frmArcticDonkeys.setContentPane(contentPane);
		frmArcticDonkeys.getContentPane().setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_8.setBounds(558, 221, 75, 32);
		frmArcticDonkeys.getContentPane().add(panel_8);
		
		JLabel lblKm = new JLabel("Km");
		lblKm.setForeground(Color.WHITE);
		panel_8.add(lblKm);
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setBounds(558, 186, 75, 32);
		frmArcticDonkeys.getContentPane().add(panel_7);
		
		JLabel lblRicther_1 = new JLabel("Ricther");
		lblRicther_1.setForeground(Color.WHITE);
		panel_7.add(lblRicther_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(441, 226, 116, 22);
		frmArcticDonkeys.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(441, 191, 116, 22);
		frmArcticDonkeys.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(441, 151, 116, 22);
		frmArcticDonkeys.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(441, 111, 116, 22);
		frmArcticDonkeys.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBounds(338, 226, 91, 27);
		frmArcticDonkeys.getContentPane().add(panel_4);
		
		JLabel lblFocalDepth = new JLabel("Focal Depth:");
		lblFocalDepth.setForeground(Color.WHITE);
		panel_4.add(lblFocalDepth);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBounds(338, 191, 91, 27);
		frmArcticDonkeys.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Magnitude:");
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBounds(338, 151, 91, 27);
		frmArcticDonkeys.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Longitude:");
		lblNewLabel_1.setForeground(Color.WHITE);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(338, 111, 91, 27);
		frmArcticDonkeys.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Latitude:");
		lblNewLabel.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(26, 168, 91, 27);
		frmArcticDonkeys.getContentPane().add(panel);
		
		JLabel label = new JLabel("District:");
		label.setForeground(Color.WHITE);
		panel.add(label);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setForeground(Color.BLACK);
		comboBox.setBounds(129, 168, 116, 27);
		comboBox.addItem("Uskudar");
		comboBox.addItem("Kadikoy");
		comboBox.addItem("Besiktas");
		comboBox.addItem("Bakirkoy");
		frmArcticDonkeys.getContentPane().add(comboBox);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(164, 13, 288, 47);
		panel_5.setOpaque(false);
		frmArcticDonkeys.getContentPane().add(panel_5);
		
		JLabel lblRealtimeDecisionSupport = new JLabel("The Conveyor");
		lblRealtimeDecisionSupport.setForeground(Color.WHITE);
		lblRealtimeDecisionSupport.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_5.add(lblRealtimeDecisionSupport);
		
		JPanel panel_6 = new JPanel();
		
		panel_6.setBounds(322, 66, 315, 252);
		panel_6.setOpaque(false);
		frmArcticDonkeys.getContentPane().add(panel_6);
		
		JLabel lblEarthquake = new JLabel("Earthquake");
		lblEarthquake.setForeground(Color.WHITE);
		lblEarthquake.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_6.add(lblEarthquake);
		
		JButton btnSend = new JButton("Send");
		btnSend.setForeground(Color.BLACK);
		btnSend.setBounds(514, 329, 97, 25);
		frmArcticDonkeys.getContentPane().add(btnSend);
		
		JLabel lblZvalueParameter = new JLabel("Z-Value Parameter");
		lblZvalueParameter.setForeground(Color.WHITE);
		lblZvalueParameter.setBounds(13, 229, 124, 16);
		contentPane.add(lblZvalueParameter);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(149, 221, 142, 27);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Randomized");
		comboBox_1.addItem("DistanceFromSea");
		comboBox_1.addItem("BuildingAge");
	
		btnSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println(textField.getText());
			}
		});

		
			
		
		
	}
}
