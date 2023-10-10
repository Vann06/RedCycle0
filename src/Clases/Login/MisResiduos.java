package Clases.Login;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import Clases.Driver;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MisResiduos extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtCantResiduos;

	private Driver driver = new Driver();
	
	/**
	 * Create the panel.
	 */
	public MisResiduos() {
		
		setBackground(new Color(198, 198, 198));
		setLayout(null);
		
		JLabel labelFondo1 = new JLabel("New label");
		labelFondo1.setForeground(new Color(255, 255, 255));
		Color blanco = Color.white;
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(MisResiduos.class.getResource("/img/bote_azul.png")));
		lblNewLabel_4.setBounds(485, 316, 101, 161);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MisResiduos.class.getResource("/img/bote_amarillo.png")));
		lblNewLabel_3.setBounds(734, 324, 120, 153);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MisResiduos.class.getResource("/img/bote_verde.png")));
		lblNewLabel_2.setBounds(729, 140, 108, 161);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MisResiduos.class.getResource("/img/bote_rojo.png")));
		lblNewLabel_1.setBounds(499, 159, 45, 91);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MisResiduos.class.getResource("/img/planta.png")));
		lblNewLabel.setBounds(308, 149, 89, 79);
		add(lblNewLabel);
		
		JLabel lbClasificacion4 = new JLabel("Plastico");
		lbClasificacion4.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion4.setBounds(864, 358, 70, 24);
		add(lbClasificacion4);
		
		JLabel lbClasificacion3 = new JLabel("Vidrio");
		lbClasificacion3.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion3.setBounds(864, 170, 70, 24);
		add(lbClasificacion3);
		
		JLabel lbClasificacion2 = new JLabel("Papel");
		lbClasificacion2.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion2.setBounds(596, 358, 70, 24);
		add(lbClasificacion2);
		
		JLabel lbClasificacion1 = new JLabel("Peligrosos");
		lbClasificacion1.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion1.setBounds(596, 170, 70, 24);
		add(lbClasificacion1);
		
		JLabel lbCantContenedor4 = new JLabel("00");
		lbCantContenedor4.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor4.setBounds(864, 423, 70, 24);
		add(lbCantContenedor4);
		
		JLabel lbCantContenedor2 = new JLabel("00");
		lbCantContenedor2.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor2.setBounds(596, 438, 70, 24);
		add(lbCantContenedor2);
		
		JLabel lbCantContenedor3 = new JLabel("00");
		lbCantContenedor3.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor3.setBounds(864, 249, 70, 24);
		add(lbCantContenedor3);
		
		JLabel lbCantContenedor1 = new JLabel("00");
		lbCantContenedor1.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor1.setBounds(596, 249, 70, 24);
		add(lbCantContenedor1);
		
		JLabel lbContenedor4 = new JLabel("Cantidad");
		lbContenedor4.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor4.setBounds(864, 392, 70, 24);
		add(lbContenedor4);
		
		JLabel lbContenedor3 = new JLabel("Cantidad");
		lbContenedor3.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor3.setBounds(864, 204, 70, 24);
		add(lbContenedor3);
		
		JLabel lbContenedor2 = new JLabel("Cantidad");
		lbContenedor2.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor2.setBounds(596, 392, 70, 24);
		add(lbContenedor2);
		
		JLabel lbContenedor1 = new JLabel("Cantidad");
		lbContenedor1.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor1.setBounds(596, 204, 70, 24);
		add(lbContenedor1);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setOpaque(true);
		btnGuardar.setBackground(new Color(11, 187, 19));
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setBounds(189, 377, 108, 31);
		add(btnGuardar);
		
		txtCantResiduos = new JTextField();
		txtCantResiduos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				try {
					int cantBas = 0;
					String cantBasura = txtCantResiduos.getText();
					cantBas = Integer.parseInt(cantBasura);
					if(cantBas <= 0) {
						JOptionPane.showMessageDialog(null, "Número incorrecto, ingrese una cantidad mayor a cero!", "Error", JOptionPane.ERROR_MESSAGE);
					}else {
						
					}
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Ingrese un número!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		txtCantResiduos.setBounds(123, 323, 244, 31);
		add(txtCantResiduos);
		txtCantResiduos.setColumns(10);
		
		JLabel lbTitulocb = new JLabel("Seleccione el articulo que desee clasificar");
		lbTitulocb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbTitulocb.setBounds(123, 236, 257, 24);
		add(lbTitulocb);
		
		JComboBox cbClasificacion = new JComboBox();
		cbClasificacion.setForeground(new Color(11, 187, 19));
		cbClasificacion.setBounds(123, 270, 244, 31);
		add(cbClasificacion);
		
		JLabel labelTitulo = new JLabel("Mis Residuos");
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		labelTitulo.setOpaque(true);
		labelTitulo.setForeground(Color.black);
		labelTitulo.setBackground(Color.WHITE);
		labelTitulo.setBounds(123, 181, 174, 31);
		add(labelTitulo);
	
		labelFondo1.setOpaque(true);
		labelFondo1.setBackground(blanco);
		labelFondo1.setBounds(82, 125, 333, 322);
		
		add(labelFondo1);
		
		JLabel labelFondo2 = new JLabel("New label");
		labelFondo2.setOpaque(true);
		labelFondo2.setForeground(Color.WHITE);
		labelFondo2.setBackground(Color.WHITE);
		labelFondo2.setBounds(459, 125, 548, 373);
		add(labelFondo2);

	}
	
	
}
