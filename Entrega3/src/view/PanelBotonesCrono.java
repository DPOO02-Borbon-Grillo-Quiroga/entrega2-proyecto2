package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelBotonesCrono extends JPanel{
	private JButton iniciar;
	private JButton pausar;
	private JButton reanudar;
	private JButton terminar;
	
	public PanelBotonesCrono() {
		
		setLayout(new BorderLayout());
        
        
        JPanel panelBotonesCrono = new JPanel( );
        
        panelBotonesCrono.setBackground( Color.WHITE );
        add(panelBotonesCrono);
        
        JButton iniciar = new JButton("Iniciar");
        JButton pausar = new JButton("Pausar");
        JButton reanudar = new JButton("Reanudar");
        JButton terminar = new JButton( "Terminar" );
        
        panelBotonesCrono.add(iniciar);
        panelBotonesCrono.add(pausar);
        
        panelBotonesCrono.add(reanudar);
        panelBotonesCrono.add(terminar);
        
        
	}
	
	
}

