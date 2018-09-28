package es.upm.miw.mastermind.utils;

public class LimitedStringDialog {

	private String title;

	private ClosedIntervalString limits;

	private ClosedIntervalStringView limitsView;

	public LimitedStringDialog(String title, int min, int max){
		assert title != null;
		this.limits = new ClosedIntervalString(min, max);
		limitsView = new ClosedIntervalStringView("El valor debe tener una longitud entre ", limits);
		this.title = title + " " + limitsView + ": ";
	}

	public LimitedStringDialog(String title, int max){
		this(title, 1, max);
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
