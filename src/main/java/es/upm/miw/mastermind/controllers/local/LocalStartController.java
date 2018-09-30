package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.controllers.StartController;
import es.upm.miw.mastermind.models.Game;
import es.upm.miw.mastermind.models.ModeGame;
import es.upm.miw.mastermind.models.State;
import es.upm.miw.mastermind.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	LocalStartController(Game game) {
		super(game);
	}

	public void start(int modeGame) {
		assert new ClosedInterval(0, 1).includes(modeGame);
		assert this.getState() == State.INITIAL;
		this.setModeGame(ModeGame.getModeGameByIndex(modeGame - 1));
		this.setState(State.CONFIG_SECRET);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}
}
