package demojuego;

import java.awt.Dimension;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

public VentanaPrincipal() {
	inciarComponentes();
}

private void inciarComponentes() {
	setPreferredSize(new Dimension(600, 400));
	setTitle("The best game of de world");
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);

	pack();
}

}
