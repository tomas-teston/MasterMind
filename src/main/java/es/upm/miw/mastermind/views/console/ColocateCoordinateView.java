package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.CoordinateController;
import es.upm.miw.mastermind.controllers.CoordinateControllerVisitor;
import es.upm.miw.mastermind.models.Coordinate;
import es.upm.miw.mastermind.utils.IO;

abstract class ColocateCoordinateView implements CoordinateControllerVisitor {

	private CoordinateController coordinateController;

	private IO io;

	protected ColocateCoordinateView(CoordinateController coordinateController){
		assert coordinateController != null;
		this.coordinateController = coordinateController;
		io = new IO();
	}

	abstract Coordinate getCoordinate();

	protected void show(String infix, Coordinate coordinate){
		new CoordinateView("La máquina " + infix + " ", coordinate).write();
		io.readString(". Pulse enter para continuar");
	}

	protected CoordinateController getCoordinateController(){
		return coordinateController;
	}
}
