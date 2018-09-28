package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.ColocateController;
import es.upm.miw.mastermind.models.Game;

abstract class LocalColocateController extends LocalOperationController
		implements ColocateController {

	private LocalCombinationController combinationController;

	protected LocalColocateController(Game game, LocalCombinationController combinationController) {
		super(game);
		assert combinationController != null;
		this.combinationController = combinationController;
	}

}
