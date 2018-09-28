package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Combination;

public interface CombinationController {

	Combination getCombination();

	void accept(CombinationControllerVisitor combinationControllerVisitor);

}
