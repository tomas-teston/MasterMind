package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.CoordinateController;
import es.upm.miw.mastermind.models.Coordinate;
import es.upm.miw.mastermind.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
