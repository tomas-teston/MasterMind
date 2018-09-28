package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.ContinueController;
import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.models.Game;
import es.upm.miw.mastermind.models.State;

public class LocalContinueController extends LocalOperationController implements ContinueController {

	LocalContinueController(Game game) {
		super(game);
	}

	public void resume(boolean another) {
		assert this.getState() == State.FINAL;
		if (another) {
			this.clear();
			this.setState(State.INITIAL);
		} else {
			this.setState(State.EXIT);
		}
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
