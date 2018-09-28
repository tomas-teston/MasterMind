package es.upm.miw.mastermind.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Board {

	private Combination secretCombination;

	private int limitRows;

	private int injured;

	private int killed;

	Board(int limitRows, Combination secretCombination) {
		assert limitRows > 0;
		assert secretCombination != null;
		this.limitRows = limitRows;
		this.secretCombination = secretCombination;
		this.injured = 0;
		this.killed = 0;
	}

	public void setSecretCombination(Combination secretCombination) {
		this.secretCombination = secretCombination;
	}

	public Combination getSecretCombination() {
		return this.secretCombination;
	}

	public void calculateKilledAndInjured(Combination combinationPlay) {

		this.killed = 0;
		this.injured = 0;

		List<Color> colorAlreadyChecked = new ArrayList<Color>();
		for (int i = 0; i < Combination.DIMENSION; i++) {
			Color color = combinationPlay.getColorAtPosition(i);

			if (this.secretCombination.equalsColorAtPosition(color, i)) {
				this.killed++;
			} else {
				if (secretCombination.containsColor(color) && !colorAlreadyChecked.contains(color)) {
					this.injured++;
				}
				colorAlreadyChecked.add(color);
			}
		}
	}

	public int getKilled() {
		return this.killed;
	}

	public int getInjured() {
		return this.injured;
	}

	public boolean existMasterMind() {
		return killed == Combination.DIMENSION;
	}

}
