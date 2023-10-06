package Clases.Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class miCuenta extends JPanel {

	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miCuenta frame = new miCuenta();
					//frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
					//frame.setLocation(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//private JPanel contentPane;

	/**
	 * Create the panel.
	 */
	public miCuenta() {
		setLayout(new BorderLayout());
		//add(lblNewLabel, BorderLayout.CENTER);
		setBackground(new Color(126, 46, 224));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(miCuenta.class.getResource("/img/Panda.png")));
		lblNewLabel.setBounds(0, 6, 482, 570);
		add(lblNewLabel);
		
	}
	
}
