package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.CombinationControllerVisitor;
import es.upm.miw.mastermind.controllers.RandomCombinationController;
import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.models.Game;

public class LocalRandomCombinationController extends LocalCombinationController
	implements RandomCombinationController {

	protected LocalRandomCombinationController(Game game) {
		super(game);
	}

	@Override public Combination getCombination() {
		return new Combination().random();
	}

	@Override
	public void accept(CombinationControllerVisitor combinationControllerVisitor) {
		combinationControllerVisitor.visit(this);
	}

}
