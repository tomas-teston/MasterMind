package es.upm.miw.mastermind.utils;

public class ClosedInterval {

	private int min;

	private int max;

	public ClosedInterval(int min, int max) {
		assert min <= max;
		this.min = min;
		this.max = max;
	}

	public boolean includes(int value) {
		return min <= value && value <= max;
	}

	public boolean includes(String value) {
		return min <= value.length() && value.length() <= max;
	}

	int getMin() {
		return min;
	}

	int getMax() {
		return max;
	}

}
