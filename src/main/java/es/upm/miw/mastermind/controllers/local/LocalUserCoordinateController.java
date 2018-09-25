package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.CoordinateControllerVisitor;
import es.upm.miw.mastermind.controllers.UserCoordinateController;
import es.upm.miw.mastermind.models.Coordinate;
import es.upm.miw.mastermind.models.Game;

public class LocalUserCoordinateController extends LocalCoordinateController
	implements UserCoordinateController {

	protected LocalUserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		return new Coordinate();
	}

	@Override
	public Coordinate getTarget() {
		return new Coordinate();
	}

	@Override
	public void accept(CoordinateControllerVisitor coordinateControllerVisitor) {
		coordinateControllerVisitor.visit(this);
	}

}
