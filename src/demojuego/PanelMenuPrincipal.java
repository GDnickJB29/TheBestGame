package demojuego;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMenuPrincipal extends JPanel {

  public PanelMenuPrincipal() {
    inciarComponentes();
  }

  private void inciarComponentes() {
    GridLayout distribucionBotones = new GridLayout(3, 1);

    this.setLayout(distribucionBotones);

    JPanel contenedorBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));

    JButton btnInicio = new JButton("Inicio");
    btnInicio.setMinimumSize(new Dimension(300, 100));
    btnInicio.setPreferredSize(new Dimension(300, 150));
    btnInicio.setMaximumSize(new Dimension(300, 100));
    
    contenedorBoton.add(btnInicio);
    this.add(contenedorBoton);
    contenedorBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));

    JButton btnConfigurar = new JButton("Configurar");
    btnConfigurar.setMinimumSize(new Dimension(300, 100));
    btnConfigurar.setPreferredSize(new Dimension(300, 150));
    btnConfigurar.setMaximumSize(new Dimension(300, 100));
    
    contenedorBoton.add(btnConfigurar);
    this.add(contenedorBoton);
    contenedorBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));

    JButton btnSalir = new JButton("Salir");
    btnSalir.setMinimumSize(new Dimension(300, 100));
    btnSalir.setPreferredSize(new Dimension(300, 150));
    btnSalir.setMaximumSize(new Dimension(300, 100));
    
    contenedorBoton.add(btnSalir);
    this.add(contenedorBoton);
    contenedorBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));

  }
}
