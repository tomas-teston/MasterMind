package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
