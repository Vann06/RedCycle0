package Clases.Login;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Clasifico extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Clasifico() {
		setBackground(new Color(69, 153, 196));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Text 1.1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 61));
		lblNewLabel.setBounds(10, 53, 524, 163);
		add(lblNewLabel);

	}

}
