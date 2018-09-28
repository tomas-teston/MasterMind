package es.upm.miw.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import es.upm.miw.mastermind.utils.ClosedIntervalInteger;

public class Combination {

	private List<Color> colors;

	public static final int DIMENSION = 4;

	private static final ClosedIntervalInteger LIMITS = new ClosedIntervalInteger(0, Combination.DIMENSION-1);

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

	public int getListColorDimension() {
		return this.getColors().size();
	}

	public boolean equals(Combination combination) {
		for (int i = 0; i < combination.DIMENSION; i++) {
			if (!this.equalsColorAtPosition(combination.getColorAtPosition(i), i))
				return false;
		}
		return true;
	}

	public void random() {
		/*Random random = new Random(System.currentTimeMillis());
		coordinate.setRow(random.nextInt(Combination.DIMENSION));
		coordinate.setColumn(random.nextInt(Combination.DIMENSION));*/
	}

}
