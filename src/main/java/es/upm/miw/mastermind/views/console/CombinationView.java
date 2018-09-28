package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.models.Color;
import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.utils.IO;
import es.upm.miw.mastermind.utils.LimitedStringDialog;

class CombinationView {

	private String title;

	private Combination combination;

	private IO io;

	CombinationView(String title, Combination combination) {
		assert combination != null;
		assert title != null;
		this.title = title;
		io = new IO();
		this.combination = combination;
	}

	public Combination getCombination() {
		return this.combination;
	}

	void read() {
		io.writeln(title + " [Introduce 4 letras: A (amarillo), R (rojo), V (verde), Z (azul)]");
		combination.setColors(Color.getListCodesByStringCode(new LimitedStringDialog("Letras: ", 1, 4).read().toUpperCase()));
	}

}
