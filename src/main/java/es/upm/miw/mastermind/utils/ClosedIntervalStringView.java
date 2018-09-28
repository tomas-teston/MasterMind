package es.upm.miw.mastermind.utils;

class ClosedIntervalStringView {

	private String title;

	private ClosedIntervalString closedIntervalString;

	private IO io;

	public ClosedIntervalStringView(String title, ClosedIntervalString closedIntervalString){
		assert title != null;
		assert closedIntervalString != null;
		this.title = title;
		this.closedIntervalString = closedIntervalString;
		io = new IO();
	}

	public void writeln() {
		io.writeln(title + " " + this.toString());
	}

	@Override
	public String toString() {
		return "[" + closedIntervalString.getMin() + ", " + closedIntervalString.getMax() + "]";
	}
}
