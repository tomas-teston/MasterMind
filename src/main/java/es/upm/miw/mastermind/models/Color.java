package es.upm.miw.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public enum Color {
	YELLOW("A"),
	RED("R"),
	GRREN("V"),
	BLUE("Z"),
	WHITE("B"),
	BLACK("N");

	private String value;

	Color(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static Color getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}

	public static List<Color> getListCodesByStringCode(String code) {
		String[] colorsSplit = code.split("");
		List<Color> listColors = new ArrayList<>();
		for (String codeColorSplit : colorsSplit) {
			for (Color c : Color.values()) {
				if (codeColorSplit.equals(c.value)) {
					listColors.add(Color.valueOf(c.name()));
				}
			}
		}

		return listColors;
	}

}