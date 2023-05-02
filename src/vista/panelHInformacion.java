package vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class panelHInformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image imagen;

	public panelHInformacion() {
		imagen = new ImageIcon("./imagenes/FotoHotel.jpg").getImage();

		Color Silver = new Color(192, 192, 192);
		// Esta ventana tiene 3 secciones

		setLayout(new GridLayout(3, 1, 0, 0));

		// Opciones adicionals que pueden aparecer
		JPanel OpcionesAdicionales = new JPanel();
		// objetos que van dentro de este panel
		JLabel EtiquetaOpciones = new JLabel("Opciones Adicionales: ");

		// deberia ser un for para las posibles caracteristicas que hay
		JLabel Vista = new JLabel(" Vista ");
		Vista.setVerticalAlignment(SwingConstants.CENTER);
		JLabel Cocina = new JLabel(" Cocina ");
		Cocina.setVerticalAlignment(SwingConstants.CENTER);
		JLabel Balcon = new JLabel(" Balcon ");
		Balcon.setVerticalAlignment(SwingConstants.CENTER);
		OpcionesAdicionales.setLayout(new FlowLayout());
		OpcionesAdicionales.add(EtiquetaOpciones);
		OpcionesAdicionales.add(Vista);
		OpcionesAdicionales.add(Cocina);
		OpcionesAdicionales.add(Balcon);
		OpcionesAdicionales.setBackground(Silver);

		// tipos de habitaciones
		JPanel TiposHabitaciones = new JPanel();
		JLabel Estandar = new JLabel(" Estandar ");
		JLabel Suite = new JLabel(" Suite ");
		JLabel SuiteDoble = new JLabel(" SuiteDoble ");
		TiposHabitaciones.setLayout(new FlowLayout());
		TiposHabitaciones.add(Estandar);
		TiposHabitaciones.add(Suite);
		TiposHabitaciones.add(SuiteDoble);
		// el grid de ocupacion

		JLabel GRID = new JLabel(" ACA VA EL GRID ");

		// Agregar todo a PanelInformacion

		add(OpcionesAdicionales);
		add(TiposHabitaciones);
		add(GRID);

	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

		setOpaque(false);
		super.paint(g);
	}

}