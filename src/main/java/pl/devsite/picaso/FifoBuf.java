package pl.devsite.picaso;

import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author dmn
 */
public class FifoBuf {

	private LinkedList<Byte> buf = new LinkedList<>();

	public synchronized void put(byte b) {
		buf.addLast(b);
		this.notify();
	}

	public synchronized byte pop() throws IOException {
		if (!isAvailable()) {
			throw new IOException("Data not available in FifoBuf");
		}
		byte b = buf.removeFirst();
		//System.out.println("out: 0x"+Integer.toHexString(b)+" = "+b);
		return b;
	}

	public synchronized boolean isAvailable() {
		return buf.size() > 0;
	}

	public synchronized void clear() {
		buf.clear();
	}

	@Override
	public String toString() {
		return buf.toString();
	}
	
}
