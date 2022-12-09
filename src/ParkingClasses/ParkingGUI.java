package ParkingClasses;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class ParkingGUI extends JFrame {

	
	JPanel mainPanel = new JPanel(new BorderLayout());
	private final JLabel label = new JLabel("");
	private final JLabel lblNewLabel = new JLabel("How many days are you parking?");
	private final JTextField textField = new JTextField();
	private final JButton btnNewButton = new JButton("Add more cars");
	private final JButton btnNewButton_1 = new JButton("Continue");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingGUI frame = new ParkingGUI();
					frame.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ParkingGUI() {
		textField.setBounds(233, 52, 86, 20);
		textField.setColumns(10);
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(mainPanel);
				mainPanel.setLayout(null);
				label.setBounds(9, 52, 267, 29);
		
				mainPanel.add(label);
		lblNewLabel.setBounds(66, 52, 210, 29);
		
		mainPanel.add(lblNewLabel);
		
		mainPanel.add(textField);
		btnNewButton.setBounds(59, 204, 135, 23);
		
		mainPanel.add(btnNewButton);
		btnNewButton_1.setBounds(256, 204, 89, 23);
		
		mainPanel.add(btnNewButton_1);
	}
	