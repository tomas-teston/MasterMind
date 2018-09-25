package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
