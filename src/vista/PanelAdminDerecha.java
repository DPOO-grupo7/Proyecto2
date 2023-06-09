package vista;

import javax.swing.*;
import java.awt.*;


public class PanelAdminDerecha extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JButton primer;
	private JButton segun;
	private JButton tercer;
	private JButton guardar;
	private String[] nombres = {"Tipo de habitacion ", "Numero de habitacion ", "Tarifa"};
	


	public PanelAdminDerecha(String tipo, VentanaAdmin ventana) 

	{
		this.setLayout(new GridLayout(8, 1));
		this.setBackground(Color.decode("#f5f6fb"));
		if (tipo == "habitaciones")
		{
			
			
			primer = new JButton("Tipo de habitacion ");
			segun = new JButton("Numero de habitacion ");
			tercer = new JButton("Tarifa");
			guardar = new JButton("Guardar");
			
	        //dere.add(new JLabel());
	        this.add(primer);
	        this.add(new JLabel());
	        this.add(segun);
	        this.add(new JLabel());
	        this.add(tercer);
	        this.add(new JLabel());
	        this.add(guardar);
	        this.add(new JLabel());
		}
		else if (tipo == "servicios")
		{
			
			
			primer = new JButton("");
			segun = new JButton("Producto");
			tercer = new JButton("Tarifa");
			guardar = new JButton("Guardar");
			
	        //dere.add(new JLabel());
	        this.add(new JLabel());
	        this.add(new JLabel());
	        this.add(segun);
	        this.add(new JLabel());
	        this.add(tercer);
	        this.add(new JLabel());
	        this.add(guardar);
	        this.add(new JLabel());
		}
		else if (tipo == "personal")
		{
			
			primer = new JButton("Usuario");
			segun = new JButton("Contraseña ");
			tercer = new JButton("Salario");
			guardar = new JButton("Guardar");
			
	        //dere.add(new JLabel());
	        this.add(primer);
	        this.add(new JLabel());
	        this.add(segun);
	        this.add(new JLabel());
	        this.add(tercer);
	        this.add(new JLabel());
	        this.add(guardar);
	        this.add(new JLabel());
		}
		else if (tipo == "tarifa")
		{
			
			primer = new JButton("");
			segun = new JButton("Fecha");
			tercer = new JButton("Tarifa");
			guardar = new JButton("Guardar");
			
	        //dere.add(new JLabel());
	        this.add(new JLabel());
	        this.add(new JLabel());
	        this.add(segun);
	        this.add(new JLabel());
	        this.add(tercer);
	        this.add(new JLabel());
	        this.add(guardar);
	        this.add(new JLabel());
		}
		primer.addActionListener(ventana);
		segun.addActionListener(ventana);
		tercer.addActionListener(ventana);
		guardar.addActionListener(ventana);
	}



	public String[] getNombres() {
		return nombres;
	}



	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}	
}
