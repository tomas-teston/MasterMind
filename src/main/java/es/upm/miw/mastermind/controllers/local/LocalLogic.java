package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.Logic;
import es.upm.miw.mastermind.models.Game;

public class LocalLogic implements Logic {

	private Game game;

	private LocalColocateControllerBuilder colocateControllerBuilder;

	private LocalStartController startController;

	private LocalContinueController continueController;

	public LocalLogic() {
		game = new Game();
		colocateControllerBuilder = new LocalColocateControllerBuilder(game);
		startController = new LocalStartController(game, colocateControllerBuilder);
		continueController = new LocalContinueController(game);
	}

	public LocalOperationController getOperationController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
		case IN_GAME:
			return colocateControllerBuilder.getColocateController();
		case FINAL:
			return continueController;
		case EXIT:
		default:
			return null;
		}
	}
}
