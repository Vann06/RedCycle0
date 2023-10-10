package Clases.Login;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class MisResiduos extends JPanel {
	private JTextField txtCantResiduos;

	/**
	 * Create the panel.
	 */
	public MisResiduos() {
		setBackground(new Color(198, 198, 198));
		setLayout(null);
		
		JLabel labelFondo1 = new JLabel("New label");
		labelFondo1.setForeground(new Color(255, 255, 255));
		Color blanco = Color.white;
		
		JLabel lbClasificacion4 = new JLabel("Plastico");
		lbClasificacion4.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion4.setBounds(709, 375, 70, 24);
		add(lbClasificacion4);
		
		JLabel lbClasificacion3 = new JLabel("Vidrio");
		lbClasificacion3.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion3.setBounds(709, 249, 70, 24);
		add(lbClasificacion3);
		
		JLabel lbClasificacion2 = new JLabel("Papel");
		lbClasificacion2.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion2.setBounds(485, 375, 70, 24);
		add(lbClasificacion2);
		
		JLabel lbClasificacion1 = new JLabel("Peligrosos");
		lbClasificacion1.setHorizontalAlignment(SwingConstants.CENTER);
		lbClasificacion1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbClasificacion1.setBounds(485, 249, 70, 24);
		add(lbClasificacion1);
		
		JLabel lbCantContenedor4 = new JLabel("00");
		lbCantContenedor4.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor4.setBounds(786, 337, 70, 24);
		add(lbCantContenedor4);
		
		JLabel lbCantContenedor2 = new JLabel("00");
		lbCantContenedor2.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor2.setBounds(586, 329, 70, 24);
		add(lbCantContenedor2);
		
		JLabel lbCantContenedor3 = new JLabel("00");
		lbCantContenedor3.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor3.setBounds(786, 204, 70, 24);
		add(lbCantContenedor3);
		
		JLabel lbCantContenedor1 = new JLabel("00");
		lbCantContenedor1.setHorizontalAlignment(SwingConstants.CENTER);
		lbCantContenedor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCantContenedor1.setBounds(586, 204, 70, 24);
		add(lbCantContenedor1);
		
		JLabel lbContenedor4 = new JLabel("Cantidad");
		lbContenedor4.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor4.setBounds(786, 291, 70, 24);
		add(lbContenedor4);
		
		JLabel lbContenedor3 = new JLabel("Cantidad");
		lbContenedor3.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor3.setBounds(786, 159, 70, 24);
		add(lbContenedor3);
		
		JLabel lbContenedor2 = new JLabel("Cantidad");
		lbContenedor2.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor2.setBounds(586, 283, 70, 24);
		add(lbContenedor2);
		
		JLabel lbContenedor1 = new JLabel("Cantidad");
		lbContenedor1.setHorizontalAlignment(SwingConstants.CENTER);
		lbContenedor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbContenedor1.setBounds(586, 159, 70, 24);
		add(lbContenedor1);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBackground(new Color(11, 187, 19));
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setBounds(205, 356, 98, 31);
		add(btnGuardar);
		
		txtCantResiduos = new JTextField();
		txtCantResiduos.setBounds(129, 302, 244, 31);
		add(txtCantResiduos);
		txtCantResiduos.setColumns(10);
		
		JLabel lbTitulocb = new JLabel("Seleccione el articulo que desee clasificar");
		lbTitulocb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbTitulocb.setBounds(129, 215, 257, 24);
		add(lbTitulocb);
		
		JComboBox cbClasificacion = new JComboBox();
		cbClasificacion.setForeground(new Color(11, 187, 19));
		cbClasificacion.setBounds(129, 249, 244, 31);
		add(cbClasificacion);
		
		JLabel labelTitulo = new JLabel("Mis Residuos");
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		labelTitulo.setOpaque(true);
		labelTitulo.setForeground(Color.black);
		labelTitulo.setBackground(Color.WHITE);
		labelTitulo.setBounds(129, 150, 174, 31);
		add(labelTitulo);
	
		labelFondo1.setOpaque(true);
		labelFondo1.setBackground(blanco);
		labelFondo1.setBounds(82, 125, 333, 300);
		
		add(labelFondo1);
		
		JLabel labelFondo2 = new JLabel("New label");
		labelFondo2.setOpaque(true);
		labelFondo2.setForeground(Color.WHITE);
		labelFondo2.setBackground(Color.WHITE);
		labelFondo2.setBounds(459, 125, 477, 300);
		add(labelFondo2);

	}
}
