package pl.devsite.picaso;

/**
 *
 * @author dmn
 */
public class TextAlignment {
	
	private static String MAXLENGTH = "          " + "          " + "          ";

	public static String alignLeft(String line) {
		String l;
		if (line.length() > MAXLENGTH.length()) {
			l = line.substring(0, MAXLENGTH.length());
		} else {
			l = line + MAXLENGTH.substring(line.length());
		}
		return l;
	}

	public static String alignRight(String line) {
		String l;
		if (line.length() > MAXLENGTH.length()) {
			l = line.substring(line.length() - MAXLENGTH.length(), line.length());
		} else {
			l = MAXLENGTH.substring(line.length()) + line;
		}
		return l;
	}

	public static String alignCenter(String line) {
		String l;
		if (line.length() > MAXLENGTH.length()) {
			l = line.substring(line.length() / 2 - 15, line.length() / 2 + 15);
		} else {
			int all = MAXLENGTH.length() - line.length();
			int partr = all / 2;
			int partl = all - partr;
			l = MAXLENGTH.substring(0, partl) + line + MAXLENGTH.substring(0, partr);
		}
		return l;
	}
}
