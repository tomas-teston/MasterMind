package es.upm.miw.mastermind;

import es.upm.miw.mastermind.controllers.OperationController;
import es.upm.miw.mastermind.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	void interact(OperationController operationController);
}
