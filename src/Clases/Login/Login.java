package Clases.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField usuario;
	private JPasswordField password2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(254, 255, 253));
		frame.setBounds(500, 400, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenido!");
		lblNewLabel.setForeground(new Color(93, 151, 51));
		lblNewLabel.setFont(new Font("PingFang SC", Font.BOLD, 35));
		lblNewLabel.setBounds(143, 87, 238, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUser = new JLabel("Usuario");
		lblUser.setBounds(110, 179, 61, 16);
		frame.getContentPane().add(lblUser);
		
		usuario = new JTextField();
		usuario.setBounds(216, 174, 187, 26);
		frame.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		JLabel lblPass = new JLabel("Contraseña");
		lblPass.setBounds(110, 237, 97, 16);
		frame.getContentPane().add(lblPass);
		
		JButton btnIngresar = new JButton("Iniciar Sesión");
		btnIngresar.setBackground(new Color(93, 151, 51));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String pass = password2.getText();
				String user = usuario.getText();
				
				if(pass.contains("1234") && user.contains("Admin")){
					
					password2.setText(null);
					usuario.setText(null);
					
					Bienvenida menu = new Bienvenida();
					Bienvenida.main(null);
					
				}
				
				else {
					
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inválido","Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIngresar.setBounds(187, 321, 117, 29);
		frame.getContentPane().add(btnIngresar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 297, 488, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 133, 488, 12);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/img/logo.png")));
		lblNewLabel_1.setBounds(186, 0, 146, 114);
		frame.getContentPane().add(lblNewLabel_1);
		
		password2 = new JPasswordField();
		password2.setBounds(216, 232, 187, 26);
		frame.getContentPane().add(password2);
	}
}
