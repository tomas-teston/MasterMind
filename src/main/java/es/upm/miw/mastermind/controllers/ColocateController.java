package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Combination;

public interface ColocateController extends OperationController, PresenterController{

	void putCombination(Combination combinationPlay);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

	CombinationController getCombinationController();

	boolean existMasterMind();

	boolean spentAttempts();

	int takeAttemp();



}
