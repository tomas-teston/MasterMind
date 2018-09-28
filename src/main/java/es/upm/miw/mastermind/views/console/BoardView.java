package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.PresenterController;
import es.upm.miw.mastermind.utils.IO;

class BoardView {

	private PresenterController controller;

	BoardView(PresenterController controller) {
		assert controller != null;
		this.controller = controller;
	}

	void write() {
		IO io = new IO();;
		io.writeln("Muertos: " + Integer.toString(controller.killed()) );
		io.writeln("Heridos: " + Integer.toString(controller.injured()));
		io.writeln();
	}
}
