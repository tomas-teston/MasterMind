package es.upm.miw.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import es.upm.miw.mastermind.utils.ClosedInterval;

public class Combination {

	private List<Color> colors;

	public static final int DIMENSION = 4;

	private static final ClosedInterval LIMITS = new ClosedInterval(0, Combination.DIMENSION-1);

	public Combination(){
		colors = new ArrayList<Color>();
	}

	public Combination(List<Color> colors){
		this();
		this.setColors(colors);
	}

	public List<Color> getColors() {
		return this.colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

	public boolean equalsColorAtPosition(Color color, int position) {
		assert color != null;
		assert position > 0 && position <= DIMENSION;
		return getColorAtPosition(position) == color;
	}

	public Color getColorAtPosition(int position) {
		assert position > 0 && position <= DIMENSION;
		return colors.get(position);
	}

	public boolean containsColor(Color color) {
		assert color != null;
		return colors.contains(color);
	}

	public int combinationDimension() {
		return this.getColors().size();
	}

	public Combination random() {
		for (int index = 0; index < DIMENSION; index++) {
			this.colors.add(Color.getRandom());
		}
		return this;
	}

	@Override public String toString() {
		return colors.toString();
	}
}
