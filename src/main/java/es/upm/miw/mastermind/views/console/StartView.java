package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.StartController;
import es.upm.miw.mastermind.utils.LimitedIntDialog;

class StartView {

	void interact(StartController startController){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.start(users);
		new BoardView(startController).write();
	}
}
