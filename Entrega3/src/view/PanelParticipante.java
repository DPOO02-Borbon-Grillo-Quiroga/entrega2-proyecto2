package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelParticipante extends JPanel{

	private JButton btnAgregar;
	
	private JLabel nParticipante;
	private JLabel nCorreo;
	private JLabel cambioLinea;
	
	
	
	JTextField espacioNombre = new JTextField(18);
	JTextField espacioCorreo = new JTextField(18);
	
	public PanelParticipante() {
		
		setLayout( new GridLayout( 1 , 3 ) );
        setBorder( new TitledBorder( "Agregar Participante" ) );
        
        
        JPanel panelParticipante = new JPanel( );
        
        panelParticipante.setBackground( Color.WHITE );
        add(panelParticipante);
        
        nParticipante = new JLabel("Nombre del Participante");
        nCorreo = new JLabel("Correo");
        cambioLinea = new JLabel("                                                                                             ");
        JButton btnAgregar= new JButton( "Agregar" );
        
        
        panelParticipante.add(nParticipante);
        panelParticipante.add(espacioNombre);
        
        panelParticipante.add(nCorreo);
        panelParticipante.add(espacioCorreo);
        panelParticipante.add(btnAgregar);
        
	}
	
	
}
