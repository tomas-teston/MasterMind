package es.upm.miw.mastermind.controllers;

import es.upm.miw.mastermind.models.Combination;

public interface PutController extends ColocateController {

	Error validateCombination(Combination combination);

}
