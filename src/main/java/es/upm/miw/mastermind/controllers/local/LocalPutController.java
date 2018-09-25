package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.ColocateControllerVisitor;
import es.upm.miw.mastermind.controllers.Error;
import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.controllers.PutController;
import es.upm.miw.mastermind.models.Coordinate;
import es.upm.miw.mastermind.models.Game;

public class LocalPutController extends LocalColocateController implements
		PutController {

	LocalPutController(Game game, LocalCoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void put(Coordinate target) {
		assert this.validateTarget(target) == null;
		super.put(target);
	}

	public Error validateTarget(Coordinate target) {
		return super.validateTarget(target);
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
