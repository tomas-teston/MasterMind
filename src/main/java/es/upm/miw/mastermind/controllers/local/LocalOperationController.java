package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.OperationController;
import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
