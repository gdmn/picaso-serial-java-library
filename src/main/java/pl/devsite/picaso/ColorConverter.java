package pl.devsite.picaso;

/**
 *
 * @author dmn
 */
public class ColorConverter {

	/**
	 * Convert RGB color to 16bit (565 bits).
	 */
	public static int color16bit(double r, double g, double b) {
		if (r < 0 || r > 1
				|| g < 0 || g > 1
				|| b < 0 || b > 1) {
			throw new IllegalArgumentException("Color out of bounds");
		}
		int result = 0;
		result += (int) Math.round(r * 0x1F) << 11;
		result += (int) Math.round(g * 0x3F) << 5;
		result += (int) Math.round(b * 0x1F);
		return result;
	}

	/**
	 * Convert 24bit (888 bits) color to 16bit (565 bits).
	 */
	public static int colorTo16bit(int color) {
		if (color < 0 || color > 0xFFFFFF) {
			throw new IllegalArgumentException("Color out of bounds");
		}
		int result = 0;
		int r, g, b;
		double dr, dg, db;
		r = (color & 0xFF0000) >> 16;
		g = (color & 0xFF00) >> 8;
		b = (color) & 0xFF;
		dr = (double) r / 0xFF;
		dg = (double) g / 0xFF;
		db = (double) b / 0xFF;
		result += (int) Math.round(dr * 0x1F) << 11;
		result += (int) Math.round(dg * 0x3F) << 5;
		result += (int) Math.round(db * 0x1F);
		return result;
	}
}
