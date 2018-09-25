package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Color;
import es.upm.miw.mastermind.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();

	Error validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
