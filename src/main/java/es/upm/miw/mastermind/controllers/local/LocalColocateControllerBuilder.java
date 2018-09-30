package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.models.Game;
import es.upm.miw.mastermind.models.ModeGame;
//import es.upm.miw.mastermind.utils.ClosedInterval;

class LocalColocateControllerBuilder {

	private LocalColocateController[] colocateControllerArray;

	private Game game;

	LocalColocateControllerBuilder(Game game) {
		this.game = game;
		colocateControllerArray = new LocalColocateController[game.getNumMaxPlays()];
	}

	void build(int numMaxPlays) {
		LocalCombinationController[] combinationController = new LocalCombinationController[numMaxPlays];
		for (int i = 0; i < numMaxPlays; i++) {
			if (game.getModeGame() == ModeGame.ONE_PLAYER) {
				combinationController[i] = new LocalUserCombinationController(game);
			} else if (game.getModeGame() == ModeGame.DEMO) {
				combinationController[i] = new LocalRandomCombinationController(game);
			}
		}
		for (int i = 0; i < numMaxPlays; i++) {
				this.colocateControllerArray[i] = new LocalPutController(game, combinationController[i]);
		}
	}

	LocalColocateController getColocateController() {
		return colocateControllerArray[game.take()];
	}
}
