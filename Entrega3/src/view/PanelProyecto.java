package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelProyecto extends JPanel{
private JButton btnAgregar;
	
	private JLabel nProyecto;
	private JLabel nDescripcion;
	private JLabel fechaInicio;
	private JLabel fechaFinal;
	
	
	
	JTextField espacioNombre = new JTextField(18);
	JTextField espacioDescripcion = new JTextField(18);
	JTextField espacioFechaI = new JTextField(18);
	JTextField espacioFechaF = new JTextField(18);
	
	public PanelProyecto() {
		
		setLayout( new GridLayout( 0 , 1) );
        setBorder( new TitledBorder( "Agregar Proyecto" ) );
        
        
        JPanel panelProyecto = new JPanel( );
        
        panelProyecto.setBackground( Color.WHITE );
        add(panelProyecto);
        
        nProyecto = new JLabel("Nombre del Proyecto");
        nDescripcion = new JLabel("Descripcion del proyecto");
        fechaInicio = new JLabel("Fecha inicio (yyyy-mm-dd)");
        fechaFinal = new JLabel("Fecha Final (yyyy-mm-dd)");
        JButton btnAgregar= new JButton( "Crear" );
        
        
        panelProyecto.add(nProyecto);
        panelProyecto.add(espacioNombre);
        
        panelProyecto.add(nDescripcion);
        panelProyecto.add(espacioDescripcion);
        
        panelProyecto.add(fechaInicio);
        panelProyecto.add(espacioFechaI);
        panelProyecto.add(fechaFinal, BorderLayout.EAST);
        panelProyecto.add(espacioFechaF);
        panelProyecto.add(btnAgregar);
        
	}
	
	
}

