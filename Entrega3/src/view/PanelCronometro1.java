package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelCronometro1 extends JPanel{
private JButton btnAgregar;
private PanelBotonesCrono panelBotonesCrono;
	
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
	
	public PanelCronometro1() {
		
		setLayout(new BorderLayout());
        setBorder( new TitledBorder( "Cronometro" ) );
        
        panelBotonesCrono = new PanelBotonesCrono();
        add(panelBotonesCrono, BorderLayout.NORTH);
        JPanel panelCronometro = new JPanel( );
        
        panelCronometro.setBackground( Color.WHITE );
        add(panelCronometro);
        
        nAutor = new JLabel("Nombre del autor de la actividad");
        nActividad = new JLabel("Titulo de la actividad");
        nDescripcion = new JLabel("Descripcion:");
        Tipo = new JLabel("Tipo de Actividad");
        
        JButton btnAgregar= new JButton( "Agregar" );
        
        panelCronometro.add(nAutor);
        panelCronometro.add(espacioAutor);
        
        panelCronometro.add(nActividad);
        panelCronometro.add(espacioTitulo);
        
        panelCronometro.add(nDescripcion);
        panelCronometro.add(espacioDescripcion);
        
        panelCronometro.add(Tipo);
        panelCronometro.add(Fecha);
        
        panelCronometro.add(btnAgregar);
        
	}
	
	
}

