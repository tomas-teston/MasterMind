package es.upm.miw.mastermind.controllers;

public interface OperationControllerVisitor {

	void visit(StartController startController);

	void visit(ConfigurationSecretController configurationSecretController);

	void visit(PutController putController);

	void visit(ContinueController continueController);

}

