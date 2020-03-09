import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class prueba extends JPanel {

	/**
	 * Create the panel.
	 */
	public prueba() {
		setLayout(null);
		
		JLabel lblHola = new JLabel("HOLA");
		lblHola.setBounds(25, 90, 27, 14);
		add(lblHola);
		
		JButton btnBoton = new JButton("Boton");
		btnBoton.setBounds(77, 86, 89, 23);
		add(btnBoton);

	}
}
