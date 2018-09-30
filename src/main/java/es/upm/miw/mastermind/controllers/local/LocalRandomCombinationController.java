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

	/*@Override
	public Coordinate getOrigin() {
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			origin.random();
			ok = this.full(origin);
		} while (!ok);
		Coordinate result = origin;
		origin = null;
		return result;
	}

	@Override
	public Coordinate getTarget() {
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			target.random();
			ok = this.empty(target);
		} while (!ok);
		Coordinate result = target;
		target = null;
		return result;
	}

	public Coordinate getTarget(Coordinate origin) {
		assert origin != null;
		boolean ok;
		Coordinate target;
		do {
			target = this.getTarget();
			ok = !origin.equals(target);
		} while(!ok);
		return target;
	}*/

	@Override public Combination getCombination() {
		return new Combination().random();
	}

	@Override public Combination getTarget(Combination origin) {
		return null;
	}

	@Override
	public void accept(CombinationControllerVisitor combinationControllerVisitor) {
		combinationControllerVisitor.visit(this);
	}

}
