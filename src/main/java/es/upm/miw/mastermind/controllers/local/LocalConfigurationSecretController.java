package es.upm.miw.mastermind.controllers.local;

import java.util.List;

import es.upm.miw.mastermind.controllers.ConfigurationSecretController;
import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.models.Color;
import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.models.Game;
import es.upm.miw.mastermind.models.State;
import es.upm.miw.mastermind.controllers.Error;

public class LocalConfigurationSecretController extends LocalOperationController implements
		ConfigurationSecretController {

	private LocalColocateControllerBuilder colocateControllerBuilder;

	LocalConfigurationSecretController(Game game, LocalColocateControllerBuilder colocateControllerBuilder) {
		super(game);
		assert colocateControllerBuilder != null;
		this.colocateControllerBuilder = colocateControllerBuilder;
	}

	@Override public void configurationSecret (Combination secret) {
		assert secret != null;
		assert this.getState() == State.CONFIG_SECRET;
		this.setSecretCombination(secret);
	}

	@Override public Error isCorrectCombinationSecret() {
		return super.isCorrectCombinationSecret();
	}

	@Override public void start() {
		assert this.getState() == State.CONFIG_SECRET;
		colocateControllerBuilder.build(Game.NUM_ROWS_BOARD);
		this.setState(State.IN_GAME);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}
}
