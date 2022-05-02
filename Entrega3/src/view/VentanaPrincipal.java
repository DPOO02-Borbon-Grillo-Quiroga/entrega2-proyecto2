package view;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class VentanaPrincipal extends JFrame {
	
	private PanelParticipante panelParticipante;
	private PanelProyecto panelProyecto;
	private PanelActividades panelActividades;
	private PanelCronometro1 panelCronometro;
	
	public VentanaPrincipal()
	{
		setSize( 700, 700 );
		setLayout( new GridLayout( 4 , 1 ) );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        setTitle( "PROYECTO 2" );
        
        panelParticipante = new PanelParticipante();
        add(panelParticipante);
        
        panelProyecto = new PanelProyecto();
        add(panelProyecto);
        
        panelActividades = new PanelActividades();
        add(panelActividades);
        
        panelCronometro = new PanelCronometro1();
        add(panelCronometro);
	}
	
	 public static void main (String[] args)
	    {
	        VentanaPrincipal  ventana = new  VentanaPrincipal( );
	        ventana.setVisible( true );
	    }
}
