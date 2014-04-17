package pl.devsite.picaso;
/**
 *
 * source: PICASO_SERIAL_4DLIBRARY.H
 *
 * @author dmn
 */
public class Serial4dLibrary {

	// SPE Version 1.2 added peekM and pokeM
	// SPE Version 1.1 added bus_ and pin_ functions
	static int Err4D_OK = 0;
	static int Err4D_Timeout = 1;
	static int Err4D_NAK = 2; // other than ACK received
	static String[] Error4DText = new String[]{"OK\0", "Timeout\0", "NAK\0", "Length\0", "Invalid\0"};
}
