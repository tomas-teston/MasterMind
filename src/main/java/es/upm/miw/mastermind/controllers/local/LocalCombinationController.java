package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.CombinationController;
import es.upm.miw.mastermind.models.Game;

public abstract class LocalCombinationController extends LocalController
		implements CombinationController {

	protected LocalCombinationController(Game game) {
		super(game);
	}
}
