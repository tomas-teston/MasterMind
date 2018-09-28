package es.upm.miw.mastermind.utils;

public class ClosedIntervalInteger {

	private int min;

	private int max;

	public ClosedIntervalInteger(int min, int max) {
		assert min <= max;
		this.min = min;
		this.max = max;
	}

	public boolean includes(int value) {
		return min <= value && value <= max;
	}

	int getMin() {
		return min;
	}

	int getMax() {
		return max;
	}

}
