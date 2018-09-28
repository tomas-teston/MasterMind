package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.Logic;
import es.upm.miw.mastermind.models.Game;

public class LocalLogic implements Logic {

	private Game game;

	private LocalStartController startController;

    private LocalConfigurationSecretController configurationSecretController ;

	private LocalContinueController continueController;

	private LocalColocateControllerBuilder colocateControllerBuilder;

	public LocalLogic() {
		game = new Game();
		startController = new LocalStartController(game);
		colocateControllerBuilder = new LocalColocateControllerBuilder(game);
		configurationSecretController = new LocalConfigurationSecretController(game, colocateControllerBuilder);
		continueController = new LocalContinueController(game);
	}

	public LocalOperationController getOperationController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
        case CONFIG_SECRET:
            return configurationSecretController;
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
