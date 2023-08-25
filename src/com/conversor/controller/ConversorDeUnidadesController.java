package com.conversor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.conversor.model.ConversorDeUnidadesModel;
import com.conversor.view.ConversorDeUnidadesFrame;

public class ConversorDeUnidadesController{
	private ConversorDeUnidadesFrame vista;
	private ConversorDeUnidadesModel modelo;
	
	
	public ConversorDeUnidadesController(ConversorDeUnidadesFrame vista, ConversorDeUnidadesModel modelo) {		
		this.vista = vista;
		this.modelo = modelo;
		ActualizarComboBoxes();
		ConverirDesdeComboLeft();
		ConverirDesdeComboRight();
		validarTextFields();
	}
	
	public void Iniciar() {
		vista.setVisible(true);
		vista.setLocationRelativeTo(null);
	}
	
	public void ActualizarComboBoxes() {
		vista.SetListenerComboMagnitud(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] magnitudes = modelo.actualizarComboBox(vista.getComboMagnitud());
				vista.setComboMagnitudRight(magnitudes,1);
				vista.setComboMagnitudLeft(magnitudes,0);
			}});
	}

	public void ConverirDesdeComboLeft() {
		vista.SetListenerComboMagnitudLeft(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.validarSeleccionComboBoxes();
			}});
	}
	
	public void ConverirDesdeComboRight() {
		vista.SetListenerComboMagnitudRight(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.validarSeleccionComboBoxes();
			}});
	}

	public void AbrirLinkedIn() {
		vista.SetListenerComboMagnitud(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}});
	}

	public void AbrirGitHub() {
		vista.SetListenerComboMagnitud(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}});
	}
	 
	
	private void validarTextFields() {
		DocumentListener doclist = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            	convertir();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
            	convertir();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
            	convertir();
            }    
		};

		vista.SetListenertextBoxLeft(doclist);
	}
	
	private void convertir() {
		
		double resultado;
		try { 
			resultado = modelo.convertir( 
					vista.getComboMagnitudLeft(),
					vista.getComboMagnitudRight(), 
					Double.valueOf(vista.getTextBoxLeft()));
			vista.setTextBoxRight(String.valueOf(resultado)); 
		}catch (Exception e) {
			JOptionPane.showMessageDialog(vista, "Ingrese un número válido");
			vista.setTextBoxLeft("1.00");
			e.printStackTrace();
			
		}
		System.out.println(vista.getTextBoxLeft());
	}
}
