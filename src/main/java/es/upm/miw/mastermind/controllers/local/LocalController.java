package es.upm.miw.mastermind.controllers.local;
import es.upm.miw.mastermind.controllers.Error;

import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.models.Game;
import es.upm.miw.mastermind.models.ModeGame;
import es.upm.miw.mastermind.models.State;

public abstract class LocalController {

	private Game game;

	protected LocalController(Game game) {
		assert game != null;
		this.game = game;
	}

	protected State getState(){
		return game.getState();
	}

	public void setState(State state){
		assert state != null;
		game.setState(state);
	}

	public void setSecretCombination(Combination secret) {
		assert secret != null;
		game.setSecret(secret);
	}

	public void setModeGame(ModeGame modegame) {
		assert modegame != null;
		game.setModeGame(modegame);
	}

	public int takeAttemp() {
		return game.take();
	}

	public void play(Combination combination) {
		assert combination != null;
		game.calculateKilledAndInjured(combination);
		game.upAttemp();
		if (game.existMastermind() || game.spentAttempts()) {
			game.setState(State.FINAL);
		}
	}

	public int killed() { return game.killed(); }

	public int injured() { return game.injured(); }

	public boolean existMasterMind() {
		return game.existMastermind();
	}

	public boolean spentAttempts() { return game.spentAttempts(); }

	public Error isCorrectCombinationSecret() {
		return game.isCorrectCombination(game.getSecret());
	}

	public Error validateCombination(Combination combination){
		return game.isCorrectCombination(combination);
	}

	public void clear() {
		game.clear();
	}
}
