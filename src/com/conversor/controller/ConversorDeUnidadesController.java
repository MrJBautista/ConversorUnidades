package com.conversor.controller;

import java.util.List;

import com.conversor.model.ConversorDeUnidadesModel;
import com.conversor.view.ConversorDeUnidadesFrame;

public class ConversorDeUnidadesController {
	
	ConversorDeUnidadesFrame conversorDeUnidaDesFrame;
	ConversorDeUnidadesModel conversorDeUnidaDesModel;
	
	public ConversorDeUnidadesController() {
		this.conversorDeUnidaDesFrame = new ConversorDeUnidadesFrame();
		this.conversorDeUnidaDesModel = new ConversorDeUnidadesModel();
	}
	
	
	public void Print() {
		String[] ae = conversorDeUnidaDesModel.actualizarComboBox("Moneda");
		for(String e:ae) {
			System.out.println(e);
		}
	}
	
}
