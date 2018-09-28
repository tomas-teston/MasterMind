package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.View;
import es.upm.miw.mastermind.controllers.ConfigurationSecretController;
import es.upm.miw.mastermind.controllers.ContinueController;
import es.upm.miw.mastermind.controllers.OperationController;
import es.upm.miw.mastermind.controllers.PlayController;
import es.upm.miw.mastermind.controllers.StartController;

public class ConsoleView implements View {

	private StartView startView;

	private ConfigurationSecretView configurationSecretView;

	private GameView gameView;

	private ContinueView continueView;

	public ConsoleView(){
		startView = new StartView();
		configurationSecretView = new ConfigurationSecretView();
		gameView = new GameView();
		continueView = new ContinueView();
	}

	public void interact(OperationController operationController) {
		assert operationController != null;
		operationController.accept(this);
	}

	@Override
	public void visit(StartController startController) {
		startView.interact(startController);
	}

	@Override public void visit(ConfigurationSecretController configurationSecretController) {
		configurationSecretView.interact(configurationSecretController);
	}

	@Override public void visit(PlayController playController) {
		gameView.interact(playController);
	}

	@Override
	public void visit(ContinueController continueController) {
		continueView.interact(continueController);
	}


}
