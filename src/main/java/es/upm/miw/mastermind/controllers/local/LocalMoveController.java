package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.ColocateControllerVisitor;
import es.upm.miw.mastermind.controllers.Error;
import es.upm.miw.mastermind.controllers.MoveController;
import es.upm.miw.mastermind.controllers.OperationControllerVisitor;
import es.upm.miw.mastermind.models.Coordinate;
import es.upm.miw.mastermind.models.Game;

public class LocalMoveController extends LocalColocateController implements
		MoveController {

	private Coordinate origin;

	LocalMoveController(Game game, LocalCoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void remove(Coordinate origin) {
		assert origin != null;
		assert this.validateOrigin(origin) == null;
		this.origin = origin;
		super.remove(origin);
	}

	public Error validateOrigin(Coordinate origin) {
		assert origin != null;
		if (!this.full(origin)) {
			return Error.NOT_PROPERTY;
		}
		return null;
	}

	@Override
	public void put(Coordinate target) {
		assert target != null;
		assert origin != null;
		assert this.validateTarget(origin, target) == null;
		super.put(target);
		origin = null;
	}

	public Error validateTarget(Coordinate origin, Coordinate target) {
		Error error = super.validateTarget(target);
		if (error != null) {
			return error;
		}
		if (origin.equals(target)) {
			return Error.REPEATED_COORDINATE;
		}
		return null;
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
