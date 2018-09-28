package es.upm.miw.mastermind;

import es.upm.miw.mastermind.controllers.OperationController;
import es.upm.miw.mastermind.controllers.local.LocalLogic;
import es.upm.miw.mastermind.views.console.ConsoleView;

public class MasterMind {

	private Logic logic;

	private View view;

	public MasterMind(View view, Logic logic) {
		this.view = view;
		this.logic = logic;
	}

	public void play() {
		OperationController controller;
		do {
			controller = logic.getOperationController();
			if (controller != null){
				view.interact(controller);
			}
		} while (controller != null);
	}

	public static void main(String[] args) {
		new MasterMind(new ConsoleView(), new LocalLogic()).play();
	}
}
