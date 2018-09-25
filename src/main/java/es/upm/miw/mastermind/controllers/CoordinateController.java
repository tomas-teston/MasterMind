package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Coordinate;

public interface CoordinateController {

	Coordinate getOrigin();

	Coordinate getTarget();

	void accept(CoordinateControllerVisitor coordinateControllerVisitor);

}
