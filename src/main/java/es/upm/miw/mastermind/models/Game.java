package es.upm.miw.mastermind.models;
import es.upm.miw.mastermind.controllers.Error;

public class Game {

	private State state;

	private Attempt attempt;

	private Board board;

	private ModeGame modeGame;

	public static final int NUM_ROWS_BOARD = 10;

	public Game() {
		state = State.INITIAL;
		attempt = new Attempt();
		board = new Board(Game.NUM_ROWS_BOARD, null);
	}

	public State getState() {
		return state;
	}

	public void setState(State state){
		this.state = state;
	}

	public void setSecret(Combination secret) {
		this.board.setSecretCombination(secret);
	}

	public Combination getSecret() {
		return this.board.getSecretCombination();
	}

	public void setModeGame(ModeGame modeGame) {
		this.modeGame = modeGame;
	}

	public ModeGame getModeGame() {
		return this.modeGame;
	}

	public int getNumMaxPlays() {
		return NUM_ROWS_BOARD;
	}

	public int take() {
		return attempt.take();
	}

	public void upAttemp() {
		attempt.up();
	}

	public int killed() {
		return board.getKilled();
	}

	public int injured() {
		return board.getInjured();
	}

	public Error isCorrectCombination(Combination combinationCheck) {
		if (Combination.DIMENSION != combinationCheck.combinationDimension()) {
			return Error.COMBINATION_ERROR;
		}
		return null;
	}

	public void calculateKilledAndInjured(Combination combinationPlay) { this.board.calculateKilledAndInjured(combinationPlay); }

	public boolean existMastermind() { return this.board.existMasterMind(); }

	public boolean spentAttempts() { return this.attempt.spentAttempts(NUM_ROWS_BOARD); }

	public void clear() { this.attempt.clear(); }

}
