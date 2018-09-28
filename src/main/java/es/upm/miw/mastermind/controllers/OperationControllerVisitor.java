package es.upm.miw.mastermind.controllers;

public interface OperationControllerVisitor {

	void visit(StartController startController);

	void visit(ConfigurationSecretController configurationSecretController);

	void visit(PlayController playController);

	void visit(ContinueController continueController);

}

