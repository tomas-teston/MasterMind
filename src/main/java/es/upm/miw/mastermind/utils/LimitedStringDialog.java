package es.upm.miw.mastermind.utils;

public class LimitedStringDialog {

	private String title;

	private ClosedInterval limits;

	private ClosedIntervalView limitsView;

	public LimitedStringDialog(String title, int min, int max){
		assert title != null;
		this.limits = new ClosedInterval(min, max);
		limitsView = new ClosedIntervalView("El valor debe tener una longitud entre ", limits);
		this.title = title + " " + limitsView + ": ";
	}

	public String read(){
		IO io = new IO();
		String value;
		boolean ok;
		do {
			value = io.readString(title);
			ok = limits.includes(value);
			if (!ok) {
				limitsView.writeln();
			}
		} while (!ok);
		return value;
	}
}
