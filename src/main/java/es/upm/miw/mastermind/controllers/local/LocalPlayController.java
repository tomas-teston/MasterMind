package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.ColocateControllerVisitor;
import es.upm.miw.mastermind.controllers.Error;
import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.controllers.PlayController;
import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.models.Game;

public class LocalPlayController extends LocalColocateController implements
		PlayController {

	LocalPlayController(Game game, LocalCombinationController combinationController) {
		super(game, combinationController);
	}


	public Error validateCombination(Combination combination) {
		return super.validateCombination(combination);
	}

	@Override
	public void putCombination(Combination combinationPlay) {
		super.play(combinationPlay);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

	@Override
	public void accept(ColocateControllerVisitor colocateControllerVisitor) {
		colocateControllerVisitor.visit(this);
	}

}
