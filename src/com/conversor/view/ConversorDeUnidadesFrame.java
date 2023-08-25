package com.conversor.view;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.event.DocumentListener;

import java.awt.event.KeyAdapter;
import java.awt.event.TextListener;
import java.text.NumberFormat;
import java.awt.event.TextEvent;

public class ConversorDeUnidadesFrame extends JFrame{
	
	private JLabel labelTitulo, labelMagnitud, labelRazonConversion;
	private JComboBox<String> comboMagnitud, comboMagnitudLeft,comboMagnitudRight;
	private JFormattedTextField textBoxLeft,textBoxRight;
	private JButton botonLinkedIn, botonGitHub;
	private String[] magnitudes = {"Moneda","Longitud","Masa","Tiempo"}; //revisar
	private int comboLeftSelectedIndex;
	private int comboRightSelectedIndex;
	
	
	public ConversorDeUnidadesFrame(){
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(900,600); 
		setTitle("Conversor Java - One");
		setDefaultCloseOperation(EXIT_ON_CLOSE);;
		Container container = this.getContentPane();
		container.setLayout(null);		
		cargarCampos(container);
		SetListenertextBox();
		
		
	}

	private void cargarCampos(Container container) {
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setGroupingUsed(true);
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		
		labelTitulo = new JLabel("Conversor De Unidades");
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 30));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelMagnitud = new JLabel("Magnitud");
		labelMagnitud.setFont(new Font("Arial", Font.BOLD, 18));
		comboMagnitud = new JComboBox<>(magnitudes);
		comboMagnitudLeft = new JComboBox<>();
		comboMagnitudRight = new JComboBox<>();
		textBoxLeft = new JFormattedTextField(nf);
		textBoxRight = new JFormattedTextField(nf);
		textBoxRight.setEditable(false);
		labelRazonConversion = new JLabel("Razón:");
		labelRazonConversion.setFont(new Font("Arial", Font.BOLD, 18));
		botonLinkedIn = new JButton();
		botonGitHub = new JButton();
		
		labelTitulo.setBounds(263, 69, 360, 30);
		labelMagnitud.setBounds(293, 146, 320, 30);
		comboMagnitud.setBounds(293, 186, 300, 30);
		comboMagnitudLeft.setBounds(173, 264, 200, 30);
		comboMagnitudRight.setBounds(446, 264, 200, 30);
		textBoxLeft.setBounds(173, 315, 200, 30);
		textBoxRight.setBounds(446, 315, 200, 30);
		labelRazonConversion.setBounds(173, 424, 200, 30);
		botonLinkedIn.setBounds(786, 513, 40, 40);
		botonGitHub.setBounds(836, 513, 40, 40);
		
		container.add(labelTitulo);
		container.add(labelMagnitud);
		container.add(comboMagnitud);
		container.add(comboMagnitudLeft);
		container.add(comboMagnitudRight);
		container.add(textBoxLeft);
		container.add(textBoxRight);
		container.add(labelRazonConversion);
		container.add(botonGitHub);
		container.add(botonLinkedIn);
		
		
	}
	
	public void SetListenerComboMagnitud(ActionListener listener) {
		comboMagnitud.addActionListener(listener);
	}
	public void SetListenerComboMagnitudLeft(ActionListener listener) {
		comboMagnitudLeft.addActionListener(listener);
	}
	public void SetListenerComboMagnitudRight(ActionListener listener) {
		comboMagnitudRight.addActionListener(listener);
	}
	public void SetListenerbBtonLinkedIn(ActionListener listener) {
		botonLinkedIn.addActionListener(listener);
	}
	public void SetListenerBotonGitHub(ActionListener listener) {
		botonGitHub.addActionListener(listener);
	}

	public String getComboMagnitud() {
		return (String) comboMagnitud.getSelectedItem();
	}

	public void setComboMagnitud(String[] items) {
		for(String item: items) {			
			this.comboMagnitud.addItem(item);
		}
	}

	public String getComboMagnitudLeft() {
		return (String) comboMagnitudLeft.getSelectedItem();
	}

	public void setComboMagnitudLeft(String[] items, int index) {
		this.comboMagnitudLeft.removeAllItems();
		for(String item: items) {			
			this.comboMagnitudLeft.addItem(item);
		}
		comboMagnitudLeft.setSelectedIndex(index);
	}

	public String getComboMagnitudRight() {
		return (String) comboMagnitudRight.getSelectedItem();
	}

	public void setComboMagnitudRight(String[] items, int index) {
		this.comboMagnitudRight.removeAllItems();
		for(String item: items) {
			this.comboMagnitudRight.addItem(item);
		}
		comboMagnitudRight.setSelectedIndex(index);
	}
	
	public String getTextBoxLeft() {
		return textBoxLeft.getText();
	}
	
	public void setTextBoxLeft(String text) {
		this.textBoxLeft.setText(text);
	}
	
	public String getTextBoxRight() {
		return textBoxRight.getText();
	}
	
	public void setTextBoxRight(String text) {
		this.textBoxRight.setText(text);
	}
	
	public void validarSeleccionComboBoxes() {
		if(comboMagnitudLeft.getSelectedIndex() == comboMagnitudRight.getSelectedIndex()) {
			if(comboMagnitudLeft.getSelectedIndex() == comboLeftSelectedIndex) {
				comboMagnitudLeft.setSelectedIndex(comboRightSelectedIndex);
			}else {
				comboMagnitudRight.setSelectedIndex(comboLeftSelectedIndex);
			}
		}
		comboLeftSelectedIndex = comboMagnitudLeft.getSelectedIndex();
		comboRightSelectedIndex = comboMagnitudRight.getSelectedIndex();
	}
	
	public void SetListenertextBoxLeft(DocumentListener listener) {
		textBoxLeft.getDocument().addDocumentListener(listener);
	}
	
	public void SetListenertextBox() {
		textBoxLeft.addKeyListener(new KeyAdapter() {
			  @Override public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); String
			  t = textBoxLeft.getText();
			  if(!Character.isDigit(c)& c != '.' | t.contains(".")& c == '.'){ 
				  e.consume(); }
			  }});
	}
	
		//textBoxLeft.addKeyListener(validarCaracter);
		//textBoxRight.addKeyListener(validarCaracter);
	
	
}