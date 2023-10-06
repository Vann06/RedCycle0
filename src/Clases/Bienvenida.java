package Clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
<<<<<<< HEAD
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.Toolkit;
=======
>>>>>>> 3fe998f94c49ebeee88796e32dfa019f255ae183

public class Bienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	private JTextField textField;
=======
	private JPanel contentPane;
>>>>>>> 3fe998f94c49ebeee88796e32dfa019f255ae183

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
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
	public Bienvenida() {
<<<<<<< HEAD
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 380);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(50, 211, 61, 16);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(120, 206, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
=======
		setTitle("RedCycle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCreacionSede = new JMenuItem("Creacion Usuario");
		mnNewMenu.add(mntmCreacionSede);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Como lo Clasifico?");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Mis Residuos");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
>>>>>>> 3fe998f94c49ebeee88796e32dfa019f255ae183
	}
}
