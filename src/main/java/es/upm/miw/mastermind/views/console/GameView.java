package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.ColocateControllerVisitor;
import es.upm.miw.mastermind.controllers.ColocateController;
import es.upm.miw.mastermind.controllers.PutController;
import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.models.Game;
import es.upm.miw.mastermind.utils.IO;
import es.upm.miw.mastermind.controllers.Error;

class GameView implements ColocateControllerVisitor {

	private IO io = new IO();

	private Game game;

	public void interact(ColocateController colocateController) {
		colocateController.accept(this);
	}

	@Override
	public void visit(PutController putController) {
		PutCombinationView putCombinationView = new PutCombinationView(putController.getCombinationController());
		this.put(putController, putCombinationView);
		this.showGame(putController);
	}

	private void put(PutController putController, ColocateCombinationView colocateCombinationView) {
		Combination combination;
		Error error = null;
		do {
			combination = colocateCombinationView.getCombination();
			error = putController.validateCombination(combination);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		putController.putCombination(combination);
	}

	private void showGame(ColocateController colocateController) {
		new BoardView(colocateController).write();
		if (colocateController.existMasterMind()) {
			this.writeWinner();
		} else if (colocateController.spentAttempts()) {
			this.writeSpentAttempts();
		}
	}

	private void writeWinner() {
		io.writeln("Win!");
	}

	private void writeSpentAttempts() {
		io.writeln("Turnos agotados!");
	}

}
