package es.upm.miw.mastermind.controllers;

public interface CombinationControllerVisitor {

	void visit(UserCombinationController userCombinationController);

	void visit(RandomCombinationController randomCombinationController);
}
