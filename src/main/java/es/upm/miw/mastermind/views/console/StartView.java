package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.StartController;
import es.upm.miw.mastermind.utils.LimitedIntDialog;

class StartView {

	void interact(StartController startController){
		int modeGame = new LimitedIntDialog("1. Partida \n2. Demo?\n", 1, 2).read();
		startController.start(modeGame);
	}
}
