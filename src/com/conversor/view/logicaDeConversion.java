package com.conversor.view;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;

/*
1 dolar a euro = 1*56.3/61.93
*/

public class logicaDeConversion {
	
	public double convertir(JComboBox<String> Origen, JComboBox<String> Destino, double valor){
	
		Map<String, Double> unidades = new HashMap<>();

        // Monedas > Peso Dominicano
        unidades.put("Peso Dominicano", 1.00);
        unidades.put("Dólar", 56.3);
        unidades.put("Euro", 61.93);
        unidades.put("Yen Japonés", 0.39);

        // Longitudes > Milímetro
        unidades.put("Milímetro", 1.00);
        unidades.put("Centímetro", 10.00);
        unidades.put("Metro", 1000.00);
        unidades.put("Kilómetro", 1000000.00);
        unidades.put("Pulgada", 25.4);
        unidades.put("Yarda", 914.4);

        // Masas > Gramo
        unidades.put("Gramo", 1.00);
        unidades.put("Miligramo", 0.001);
        unidades.put("Kilogramo", 100.00);
        unidades.put("Tonelada", 1000000.00);

        // Tiempo > Minuto
        unidades.put("Minuto", 1.00);
        unidades.put("Milisegundo", 0.0000167);
        unidades.put("Segundo", 0.02);
        unidades.put("Hora", 60.00);
        unidades.put("Día", 1440.00);
        
		return valor*unidades.get(Origen)/unidades.get(Destino);
	}
}