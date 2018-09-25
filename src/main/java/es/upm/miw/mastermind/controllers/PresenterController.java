package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Color;
import es.upm.miw.mastermind.models.Coordinate;

public interface PresenterController {

	Color getColor(Coordinate coordinate);

}
