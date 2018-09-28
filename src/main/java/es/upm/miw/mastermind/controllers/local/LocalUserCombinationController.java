package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.CombinationControllerVisitor;
import es.upm.miw.mastermind.controllers.UserCombinationController;
import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.models.Game;

public class LocalUserCombinationController extends LocalCombinationController
	implements UserCombinationController {

	protected LocalUserCombinationController(Game game) {
		super(game);
	}

	@Override public Combination getCombination() {
		return new Combination();
	}

	@Override
	public void accept(CombinationControllerVisitor combinationControllerVisitor) {
		combinationControllerVisitor.visit(this);
	}

}
