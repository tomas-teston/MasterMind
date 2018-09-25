package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Coordinate;

public interface MoveController extends ColocateController {

	Error validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	Error validateTarget(Coordinate origin, Coordinate target);

}
