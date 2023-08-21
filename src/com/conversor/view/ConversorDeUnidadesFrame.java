package com.conversor.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;

import javax.swing.*;

import com.conversor.controller.ConversorDeUnidadesController;

public class ConversorDeUnidadesFrame extends JFrame{
	
	private JLabel labelTitulo, labelMagnitud, labelRazonConversion;
	private JComboBox<String> comboMagnitud, comboMagnitudOrigen,comboMagnitudDestino;
	private TextField textoOrigen,textoDestino;
	private JButton botonLinkedIn, botonGitHub;
	
	
	public ConversorDeUnidadesFrame(){
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(900,600); 
		setTitle("Conversor Java - One");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Container container = this.getContentPane();
		container.setLayout(null);		
		cargarCampos(container);
		cargarAcciones();
		
		
		String magnitudes[] = {"Moneda","Longitud","Masa","Tiempo"};
		
	}

	private void cargarCampos(Container container) {
		
		labelTitulo = new JLabel("Conversor De Unidades");
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 30));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelMagnitud = new JLabel("Magnitud");
		labelMagnitud.setFont(new Font("Arial", Font.BOLD, 18));
		comboMagnitud = new JComboBox<>();
		comboMagnitudOrigen = new JComboBox<>();
		comboMagnitudDestino = new JComboBox<>();
		textoOrigen = new TextField();
		textoDestino = new TextField();
		labelRazonConversion = new JLabel("Razón:");
		labelRazonConversion.setFont(new Font("Arial", Font.BOLD, 18));
		botonLinkedIn = new JButton();
		botonGitHub = new JButton();
		
		labelTitulo.setBounds(263, 69, 360, 30);
		labelMagnitud.setBounds(293, 146, 320, 30);
		comboMagnitud.setBounds(293, 186, 300, 30);
		comboMagnitudOrigen.setBounds(173, 264, 200, 30);
		comboMagnitudDestino.setBounds(446, 264, 200, 30);
		textoOrigen.setBounds(173, 315, 200, 30);
		textoDestino.setBounds(446, 315, 200, 30);
		labelRazonConversion.setBounds(173, 424, 200, 30);
		
		container.add(labelTitulo);
		container.add(labelMagnitud);
		container.add(comboMagnitud);
		container.add(comboMagnitudOrigen);
		container.add(comboMagnitudDestino);
		container.add(textoOrigen);
		container.add(textoDestino);
		container.add(labelRazonConversion);
	}
	
	private void cargarAcciones() {
		comboMagnitud.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
  
            }
        });
			
		comboMagnitudOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		comboMagnitudDestino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		botonLinkedIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		botonGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
	//============================================================================================================================

	public JComboBox<String> getComboMagnitudOrigen() {
		return comboMagnitudOrigen;
	}

	public void setComboMagnitudOrigen(JComboBox<String> comboMagnitudOrigen) {
		this.comboMagnitudOrigen = comboMagnitudOrigen;
	}

	public JComboBox<String> getComboMagnitudDestino() {
		return comboMagnitudDestino;
	}

	public void setComboMagnitudDestino(JComboBox<String> comboMagnitudDestino) {
		this.comboMagnitudDestino = comboMagnitudDestino;
	}
	
	//============================================================================================================================

	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	ConversorDeUnidadesFrame ventana = new ConversorDeUnidadesFrame();
            ventana.setVisible(true);
            
        });
        
	}

	private ActionListener listenerComboBox = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//actualizarComboBox((String)comboMagnitud.getSelectedItem());
			
		}
	};
	
	private ActionListener listenerTextField = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			logicaDeConversion Convertir = new logicaDeConversion();
			if(e.getSource()== comboMagnitudOrigen) {
				// Implementar logica para convertir.
			}
		};
	};
	
}