package com.conversor.model;

import java.util.HashMap;
import java.util.List;

public class ConversorDeUnidadesModel {
	
	HashMap<String, Double> equivalencias;
	private String unidadesMoneda[] = {"Peso Dominicano","Dólar","Euro","Yen Japonés"};
	private String unidadesLongitud[] = {"Milímetro","Centímetro","Metro","Kilómetro","Pulgada","Yarda"};
	private String unidadesMasa[] = {"Gramo","Miligramo","Kilogramo","Tonelada"};
	private String unidadesTiempo[] = {"Minuto","Milisegundo","Segundo","Hora","Día"};
	
	public ConversorDeUnidadesModel() {
		
		equivalencias = new HashMap<>();

        // Monedas > Peso Dominicano
        equivalencias.put("Peso Dominicano", 1.00);
        equivalencias.put("Dólar", 56.3);
        equivalencias.put("Euro", 61.93);
        equivalencias.put("Yen Japonés", 0.39);

        // Longitudes > Milímetro
        equivalencias.put("Milímetro", 1.00);
        equivalencias.put("Centímetro", 10.00);
        equivalencias.put("Metro", 1000.00);
        equivalencias.put("Kilómetro", 1000000.00);
        equivalencias.put("Pulgada", 25.4);
        equivalencias.put("Yarda", 914.4);

        // Masas > Gramo
        equivalencias.put("Gramo", 1.00);
        equivalencias.put("Miligramo", 0.001);
        equivalencias.put("Kilogramo", 100.00);
        equivalencias.put("Tonelada", 1000000.00);

        // Tiempo > Minuto
        equivalencias.put("Minuto", 1.00);
        equivalencias.put("Milisegundo", 0.0000167);
        equivalencias.put("Segundo", 0.02);
        equivalencias.put("Hora", 60.00);
        equivalencias.put("Día", 1440.00);
	}
	
	public double convertir(String origen, String destino, double monto) {
		return monto*this.equivalencias.get(origen)/equivalencias.get(destino);
	}
	
	public String[] actualizarComboBox(String magnitudSeleccionada) {
		String[] resultado;
		switch (magnitudSeleccionada) {
		case "Moneda":
			resultado = unidadesMoneda;
			break;
		case "Longitud":
			resultado = unidadesLongitud;
			break;
		case "Masa":
			resultado = unidadesMasa;
			break;
		case "Tiempo":
			resultado = unidadesTiempo;
			break;
		default: 
			resultado = unidadesMoneda;
		}
		
		return resultado;
	}
}
