package es.upm.miw.mastermind.controllers.local;

import es.upm.miw.mastermind.controllers.ColocateController;
import es.upm.miw.mastermind.controllers.CoordinateController;
import es.upm.miw.mastermind.controllers.Error;
import es.upm.miw.mastermind.models.Coordinate;
import es.upm.miw.mastermind.models.Game;

abstract class LocalColocateController extends LocalOperationController
		implements ColocateController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(
			Game game,
			LocalCoordinateController coordinateController) {
		super(game);
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}

	public Error validateTarget(Coordinate target) {
		if (!this.empty(target)) {
			System.out.println("Error no libre");
			return Error.NOT_EMPTY;
		}
		return null;
	}

	public CoordinateController getCoordinateController() {
		return coordinateController;
	}

}
