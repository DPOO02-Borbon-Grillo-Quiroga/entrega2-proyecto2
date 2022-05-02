package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelActividades extends JPanel{
private JButton btnAgregar;
	private JLabel nAutor;	
	private JLabel nActividad;
	private JLabel nDescripcion;
	private JLabel Tipo;
	private JLabel nFecha;
	private JLabel horaInicio;
	private JLabel horaFinal;
	
	
	JTextField espacioAutor = new JTextField(18);
	JTextField espacioTitulo = new JTextField(18);
	JTextField espacioDescripcion = new JTextField(18);
	JTextField Fecha = new JTextField(18);
	JTextField espacioHoraI = new JTextField(18);
	JTextField espacioHoraF = new JTextField(18);
	
	public PanelActividades() {
		
		setLayout(new BorderLayout());
        setBorder( new TitledBorder( "Agregar actividad" ) );
        
        
        JPanel panelActividades = new JPanel( );
        
        panelActividades.setBackground( Color.WHITE );
        add(panelActividades);
        
        nAutor = new JLabel("Nombre del autor");
        nActividad = new JLabel("Nombre de la actividad");
        nDescripcion = new JLabel("Descripcion de la actividad");
        nFecha = new JLabel("Fecha (YYYY-MM-DD)");
        horaInicio = new JLabel("Fecha inicio (hh-mm-ss)");
        horaFinal = new JLabel("Fecha Final (hh-mm-ss)");
        JButton btnAgregar= new JButton( "Crear" );
        
        panelActividades.add(nAutor);
        panelActividades.add(espacioAutor);
        
        panelActividades.add(nActividad);
        panelActividades.add(espacioTitulo);
        
        panelActividades.add(nDescripcion);
        panelActividades.add(espacioDescripcion);
        
        panelActividades.add(nFecha);
        panelActividades.add(Fecha);
        
        panelActividades.add(horaInicio);
        panelActividades.add(espacioHoraI);
        
        panelActividades.add(horaFinal);
        panelActividades.add(espacioHoraF);
        
        panelActividades.add(btnAgregar);
        
	}
	
	
}

