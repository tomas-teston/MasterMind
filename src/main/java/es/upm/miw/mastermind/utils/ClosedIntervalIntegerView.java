package es.upm.miw.mastermind.utils;

class ClosedIntervalIntegerView {

	private String title;

	private ClosedIntervalInteger closedIntervalInteger;

	private IO io;

	public ClosedIntervalIntegerView(String title, ClosedIntervalInteger closedIntervalInteger){
		assert title != null;
		assert closedIntervalInteger != null;
		this.title = title;
		this.closedIntervalInteger = closedIntervalInteger;
		io = new IO();
	}

	public void writeln() {
		io.writeln(title + " " + this.toString());
	}

	@Override
	public String toString() {
		return "[" + closedIntervalInteger.getMin() + ", " + closedIntervalInteger.getMax() + "]";
	}
}
