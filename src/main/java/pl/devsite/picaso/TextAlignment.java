package pl.devsite.picaso;

import java.io.IOException;

/**
 *
 * @author dmn
 */
public class TextAlignment {

	public static String WHOLELINE = "          " + "          " + "          ";
	public static int MAXLENGTH = WHOLELINE.length();
	private final Compound4dRoutines dev;
	private int charsAlreadyPut = 0;

	public TextAlignment(Compound4dRoutines dev) {
		this.dev = dev;
	}

	/**
	 * remove non ascii characters.
	 */
	public static String standarizeLine(String l) {
		String[][] replaces = new String[][]{
			{"Ł", "L"},
			{"Ś", "S"},
			{"Ą", "A"},
			{"Ę", "E"},
			{"Ó", "O"},
			{"Ż", "Z"},
			{"Ź", "Z"},
			{"Ć", "C"},
			{"Ń", "N"},
			{"ł", "l"},
			{"ś", "s"},
			{"ą", "a"},
			{"ę", "e"},
			{"ó", "o"},
			{"ż", "z"},
			{"ź", "z"},
			{"ć", "c"},
			{"ń", "n"},
		};
		for (String[] r : replaces) {
			l = l.replace(r[0], r[1]);
		}
		return l.replaceAll("[^\\p{ASCII}]", ".");
	}

	public static String alignLeft(String line) {
		line = standarizeLine(line);
		String l;
		if (line.length() > MAXLENGTH) {
			l = line.substring(0, MAXLENGTH);
		} else {
			l = line + WHOLELINE.substring(line.length());
		}
		return l;
	}

	public static String alignRight(String line) {
		line = standarizeLine(line);
		String l;
		if (line.length() > MAXLENGTH) {
			l = line.substring(line.length() - MAXLENGTH, line.length());
		} else {
			l = WHOLELINE.substring(line.length()) + line;
		}
		return l;
	}

	public static String alignCenter(String line) {
		line = standarizeLine(line);
		String l;
		if (line.length() > MAXLENGTH) {
			l = line.substring(line.length() / 2 - 15, line.length() / 2 + 15);
		} else {
			int all = MAXLENGTH - line.length();
			int partr = all / 2;
			int partl = all - partr;
			l = WHOLELINE.substring(0, partl) + line + WHOLELINE.substring(0, partr);
		}
		return l;
	}

	public void putstrReset() {
		charsAlreadyPut = 0;
	}

	/**
	 * @param alignment 0 = left, 1 = center, 2 = right
	 */
	public void putstr(int alignment, String str) throws IOException {
		str = standarizeLine(str);
		int newLine;
		do {
			newLine = str.indexOf('\n');
			String current;
			if (newLine >= 0) {
				current = str.substring(0, newLine);
				str = str.substring(newLine + 1);
			} else {
				current = str;
			}
			if (current.length() > 0) {
				switch (alignment) {
					case 0:
						dev.putstr(current);
						charsAlreadyPut += current.length();
						charsAlreadyPut %= TextAlignment.MAXLENGTH;
						break;
					case 1:
						int startLeft = (TextAlignment.MAXLENGTH - current.length()) / 2;
						if (startLeft >= charsAlreadyPut) {
							current = TextAlignment.WHOLELINE.substring(0, startLeft - charsAlreadyPut) + current;
							dev.putstr(current);
							charsAlreadyPut += current.length();
							charsAlreadyPut %= TextAlignment.MAXLENGTH;
						} else {
							if (current.length() > TextAlignment.MAXLENGTH - charsAlreadyPut) {
								current = current.substring(0, TextAlignment.MAXLENGTH - charsAlreadyPut);
							}
							dev.putstr(current);
							charsAlreadyPut += current.length();
							charsAlreadyPut %= TextAlignment.MAXLENGTH;
						}
						break;
					case 2:
						if (TextAlignment.MAXLENGTH - charsAlreadyPut > current.length()) {
							current = TextAlignment.WHOLELINE.substring(0, TextAlignment.MAXLENGTH - charsAlreadyPut - current.length()) + current;
						} else {
							current = current.substring(current.length() - (TextAlignment.MAXLENGTH - charsAlreadyPut), current.length());
						}
						dev.putstr(current);
						charsAlreadyPut = 0;
						break;
				}
			}
			if (newLine >= 0) {
				if (!(alignment == 2 && charsAlreadyPut == 0)) {
					dev.putstr(TextAlignment.WHOLELINE.substring(0, TextAlignment.MAXLENGTH - charsAlreadyPut));
					charsAlreadyPut = 0;
				}
			}
		} while (newLine >= 0);
	}
}
