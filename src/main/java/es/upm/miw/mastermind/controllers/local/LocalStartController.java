package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.controllers.StartController;
import es.upm.miw.mastermind.models.Game;
import es.upm.miw.mastermind.models.State;
import es.upm.miw.mastermind.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalColocateControllerBuilder colocateControllerBuilder;

	LocalStartController(Game game,
			LocalColocateControllerBuilder colocateControllerBuilder) {
		super(game);
		assert colocateControllerBuilder != null;
		this.colocateControllerBuilder = colocateControllerBuilder;
	}

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		assert this.getState() == State.INITIAL;
		colocateControllerBuilder.build(users);
		this.setState(State.IN_GAME);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
