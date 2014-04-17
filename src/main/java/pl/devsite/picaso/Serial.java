package pl.devsite.picaso;

import java.io.IOException;

/**
 *
 * @author dmn
 */
public interface Serial {

	boolean connect();

	void disconnect();

	void write(int... data) throws IOException;

	void write(char... data) throws IOException;

	void write(byte... data) throws IOException;

	void write(String data) throws IOException;

	byte read() throws IOException;

	boolean isAvailable();
	
	void setBaud(int baud);
}
