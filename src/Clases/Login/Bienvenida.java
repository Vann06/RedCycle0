package Clases.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
					//frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bienvenida() {
		setTitle("RedCycle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 100, 1000, 700);
	
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Mi Cuenta");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				miCuenta vent1 = new miCuenta();
				nuevoPanel(vent1); 
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("¿Cómo lo Clasifico?");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clasifico vent2 = new Clasifico();
				nuevoPanel(vent2);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Mis Residuos");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				MisResiduos ventanaMisResiduos = new MisResiduos();
				nuevoPanel(ventanaMisResiduos);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		
		JMenuItem mntmCreacionSede = new JMenuItem("");
		menuBar.add(mntmCreacionSede);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 
	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(331, 107, 618, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Bienvenida.class.getResource("/img/User.png")));
		lblNewLabel_3.setBounds(26, 67, 278, 339);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Mi Cuenta");
		lblNewLabel.setFont(new Font("PingFang SC", Font.BOLD, 20));
		lblNewLabel.setBounds(333, 93, 114, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione las clasificaciones de");
		lblNewLabel_1.setBounds(333, 121, 209, 54);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("residuos que le interesen:");
		lblNewLabel_2.setBounds(333, 167, 178, 16);
		panel.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Orgánica");
		chckbxNewCheckBox.setBounds(331, 203, 128, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Plástico");
		chckbxNewCheckBox_1.setBounds(331, 247, 128, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Vidrio");
		chckbxNewCheckBox_2.setBounds(450, 247, 128, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Metal");
		chckbxNewCheckBox_3.setBounds(450, 203, 128, 23);
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Multicapa");
		chckbxNewCheckBox_4.setBounds(331, 293, 128, 23);
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Papel y Cartón");
		chckbxNewCheckBox_5.setBounds(450, 293, 128, 23);
		panel.add(chckbxNewCheckBox_5);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(93, 151, 51));
		btnNewButton.setForeground(new Color(93, 151, 51));
		btnNewButton.setBounds(439, 365, 139, 41);
		panel.add(btnNewButton);
		
		JLabel lblPanda = new JLabel("");
		lblPanda.setIcon(new ImageIcon(Bienvenida.class.getResource("/img/Panda.png")));
		lblPanda.setBounds(6, 6, 403, 645);
		contentPane.add(lblPanda);
	}
	
	private void nuevoPanel(JPanel panelActual) {
		contentPane.removeAll();
		contentPane.add(panelActual);
		contentPane.repaint();
		contentPane.revalidate();
		
		
	}
}
