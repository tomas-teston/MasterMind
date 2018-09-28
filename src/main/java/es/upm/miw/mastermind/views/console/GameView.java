package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.ColocateControllerVisitor;
import es.upm.miw.mastermind.controllers.ColocateController;
import es.upm.miw.mastermind.controllers.PlayController;
import es.upm.miw.mastermind.models.Color;
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
	public void visit(PlayController playController) {
		CombinationView combinationView = new CombinationView("Intento " + (playController.takeAttemp() + 1), new Combination());
		combinationView.read();
		Error error = playController.validateCombination(combinationView.getCombination());
		if (error != null) {
			io.writeln("" + error);
		} else {
			playController.putCombination(combinationView.getCombination());
			this.showGame(playController);
		}
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
