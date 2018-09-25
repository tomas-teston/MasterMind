package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.CoordinateController;
import es.upm.miw.mastermind.controllers.RandomCoordinateController;
import es.upm.miw.mastermind.controllers.UserCoordinateController;
import es.upm.miw.mastermind.models.Coordinate;

class MoveOriginCoordinateView extends ColocateCoordinateView {

	private Coordinate origin;

	MoveOriginCoordinateView(CoordinateController coordinateController) {
		super(coordinateController);
	}

	Coordinate getCoordinate() {
		origin = this.getCoordinateController().getOrigin();
		this.getCoordinateController().accept(this);
		return origin;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("De", origin).read();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.show("quita de", origin);
	}

}
