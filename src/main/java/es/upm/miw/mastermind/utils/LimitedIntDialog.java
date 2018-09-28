package es.upm.miw.mastermind.utils;

public class LimitedIntDialog {

	private String title;

	private ClosedIntervalInteger limits;

	private ClosedIntervalIntegerView limitsView;

	public LimitedIntDialog(String title, int min, int max){
		assert title != null;
		this.limits = new ClosedIntervalInteger(min, max);
		limitsView = new ClosedIntervalIntegerView("El valor debe estar entre ", limits);
		this.title = title + " " + limitsView + ": ";
	}

	public LimitedIntDialog(String title, int max){
		this(title, 1, max);
	}

	public int read(){
		IO io = new IO();
		int value;
		boolean ok;
		do {
			value = io.readInt(title);
			ok = limits.includes(value);
			if (!ok) {
				limitsView.writeln();
			}
		} while (!ok);
		return value;
	}
}
