package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.ContinueController;
import es.upm.miw.mastermind.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
