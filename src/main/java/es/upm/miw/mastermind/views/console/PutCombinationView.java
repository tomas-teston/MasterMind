package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.CombinationController;
import es.upm.miw.mastermind.controllers.RandomCombinationController;
import es.upm.miw.mastermind.controllers.UserCombinationController;
import es.upm.miw.mastermind.models.Combination;

class PutCombinationView extends ColocateCombinationView {

	private Combination combination;

	PutCombinationView(CombinationController combinationController) {
		super(combinationController);
	}

	Combination getCombination(){
		combination = this.getCombinationController().getCombination();
		this.getCombinationController().accept(this);
		return combination;
	}

	@Override
	public void visit(UserCombinationController userCombinationController) {
		new CombinationView("", combination).read();
	}

	@Override
	public void visit(RandomCombinationController randomCombinationController) {
		this.show("La máquina pone: ", combination);
	}

}
