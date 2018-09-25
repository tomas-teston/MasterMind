package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.CoordinateController;
import es.upm.miw.mastermind.controllers.RandomCoordinateController;
import es.upm.miw.mastermind.controllers.UserCoordinateController;
import es.upm.miw.mastermind.models.Coordinate;

class PutTargetCoordinateView extends ColocateCoordinateView {

	private Coordinate target;

	PutTargetCoordinateView(CoordinateController coordinateController) {
		super(coordinateController);
	}

	Coordinate getCoordinate(){
		target = this.getCoordinateController().getTarget();
		this.getCoordinateController().accept(this);
		return target;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("En", target).read();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.show("pone en", target);
	}

}
