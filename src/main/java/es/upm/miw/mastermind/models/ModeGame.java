package es.upm.miw.mastermind.models;

public enum ModeGame {
	ONE_PLAYER,
	DEMO;

	public static ModeGame getModeGameByIndex(int code) {
		return ModeGame.values()[code];
	}
}
