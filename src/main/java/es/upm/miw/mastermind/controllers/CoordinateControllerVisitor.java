package es.upm.miw.mastermind.controllers;

public interface CoordinateControllerVisitor {

	void visit(UserCoordinateController userCoordinateController);

	void visit(RandomCoordinateController randomCoordinateController);
}
