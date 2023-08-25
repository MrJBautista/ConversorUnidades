package com.conversor.controller;

import com.conversor.model.ConversorDeUnidadesModel;
import com.conversor.view.ConversorDeUnidadesFrame;

public class iniciar {

	public static void main(String[] args) {
		ConversorDeUnidadesFrame frame = new ConversorDeUnidadesFrame();
		ConversorDeUnidadesModel model = new ConversorDeUnidadesModel();
		ConversorDeUnidadesController controller = new ConversorDeUnidadesController(frame, model);
		controller.Iniciar();
	}
}
