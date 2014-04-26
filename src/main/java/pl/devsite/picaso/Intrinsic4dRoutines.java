package pl.devsite.picaso;

import static pl.devsite.picaso.Const4d.*;
import static pl.devsite.picaso.Const4dSerial.*;
import static pl.devsite.picaso.Serial4dLibrary.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * source: PICASO_INTRINSIC4DROUTINES.INC
 *
 * @author dmn
 */
public class Intrinsic4dRoutines {

	protected Serial serial;
	public static final long TimeLimit4D = 400;
	private int beginIgnoreAckCounter = 0;

	public Intrinsic4dRoutines(Serial serial) {
		this.serial = serial;
	}

	public void WriteChars(char[] charsout) throws IOException {
		serial.write(charsout);
	}

	public void WriteChars(String charsout) throws IOException {
		serial.write(charsout);
	}

	public void WriteBytes(byte[] Source) throws IOException {
		serial.write(Source);
	}

	public void WriteBytes(int[] Source) throws IOException {
		byte[] b = new byte[Source.length];
		for (int i = 0; i < Source.length; i++) {
			b[i] = (byte) Source[i];
		}
		serial.write(b);
	}

	public void WriteWords(char[] Source) throws IOException {
		serial.write(Source);
	}

	public void WriteWords(int[] Source) throws IOException {
		serial.write(Source);
	}

	public void getbytes(byte[] data, int size) throws IOException, IllegalArgumentException {
		if (data == null || data.length != size) {
			throw new IllegalArgumentException("Length must be " + size);
		}
		long sttime;
		int readc;
		readc = 0;
		sttime = System.currentTimeMillis();
		while ((readc != size) && (System.currentTimeMillis() - sttime < TimeLimit4D)) {
			data[readc++] = serial.read();
		}
		if ((readc != size)) {
			throw new IOException("Not enough data read");
		}
	}

	public byte getbyte() throws IOException {
		byte[] result = new byte[1];
		getbytes(result, 1);
		return result[0];
	}

	public void waitForAck() throws IOException {
		long t = System.currentTimeMillis();
		while (System.currentTimeMillis() - t < 3000) {
			while (serial.isAvailable()) {
				if (6 == getbyte()) {
					return;
				}
			}
		}
		throw new IOException("No ACK received");
	}

	public void GetAck() throws IOException {
		if (beginIgnoreAckCounter > 0) {
			return;
		}
		byte r = getbyte();
		if (0x6 != r) {
			throw new IOException("Expected 0x6, not 0x" + Integer.toHexString(r));
		}
	}

	public int GetWord() throws IOException {
		byte readx[] = new byte[2];
		getbytes(readx, 2);
		int result = (readx[0] & 0xff) << 8 | (readx[1] & 0xff);
		return result;
	}

	public String getString(int strLen) {
		byte readx[] = new byte[strLen];
		return new String(readx);
	}

	public int GetAckResp() throws IOException {
		if (beginIgnoreAckCounter > 0) {
			return 0;
		}
		GetAck();
		return GetWord();
	}

	public int GetAckRes2Words(int[] words) throws IllegalArgumentException, IOException {
		if (beginIgnoreAckCounter > 0) {
			return 0;
		}
		if (words == null || words.length != 2) {
			throw new IllegalArgumentException("Length must be 2");
		}
		int Result;
		GetAck();
		Result = GetWord();
		words[0] = GetWord();
		words[1] = GetWord();
		return Result;
	}

	public void GetAck2Words(int[] words) throws IllegalArgumentException, IOException {
		if (beginIgnoreAckCounter > 0) {
			return;
		}
		if (words == null || words.length != 2) {
			throw new IllegalArgumentException("Length must be 2");
		}
		GetAck();
		words[0] = GetWord();
		words[1] = GetWord();
	}

	public int GetAckResSector(byte[] Sector) throws IllegalArgumentException, IOException {
		if (beginIgnoreAckCounter > 0) {
			return 0;
		}
		if (Sector == null || Sector.length != 512) {
			throw new IllegalArgumentException("Length must be 512");
		}
		int Result;
		GetAck();
		Result = GetWord();
		getbytes(Sector, 512);
		return Result;
	}

	public String GetAckResStr() throws IOException {
		if (beginIgnoreAckCounter > 0) {
			return "";
		}
		int Result;
		GetAck();
		Result = GetWord();
		return getString(Result);
	}

	public int GetAckResData(byte[] OutData, int size) throws IllegalArgumentException, IOException {
		if (beginIgnoreAckCounter > 0) {
			return 0;
		}
		int Result;
		GetAck();
		Result = GetWord();
		getbytes(OutData, size);
		return Result;
	}

	public void beginIgnoreAck() {
		beginIgnoreAckCounter += 1;
	}

	public void endIgnoreAck() {
		beginIgnoreAckCounter -= 1;
		if (beginIgnoreAckCounter == 0) {
			try {
				Thread.sleep(100);
				{
					boolean something;
					do {
						something = false;
						for (int i = 0; i < 10; i++) {
							if (serial.isAvailable()) {
								something = true;
							}
							serial.clearBuf();
							Thread.sleep(12);
						}
					} while (something);
				}
			} catch (InterruptedException ex) {
				Logger.getLogger(Intrinsic4dRoutines.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public void SetThisBaudrate(int Newrate) {
		try {
			Thread.sleep(10);               // seems to be needed to enable Windows to change speed
			SetBaudrate(Newrate);
			Thread.sleep(50); // thow away any potential rubbish
		} catch (InterruptedException ex) {
			Logger.getLogger(Intrinsic4dRoutines.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void SetBaudrate(int Newrate) {
		int BaudRate = 9600;
		switch (Newrate) {
			case BAUD_110:
				BaudRate = 110;
				break;
			case BAUD_300:
				BaudRate = 300;
				break;
			case BAUD_600:
				BaudRate = 600;
				break;
			case BAUD_1200:
				BaudRate = 1200;
				break;
			case BAUD_2400:
				BaudRate = 2400;
				break;
			case BAUD_4800:
				BaudRate = 4800;
				break;
			case BAUD_9600:
				BaudRate = 9600;
				break;
			case BAUD_14400:
				BaudRate = 14400;
				break;
			case BAUD_19200:
				BaudRate = 19200;
				break;
			case BAUD_31250:
				BaudRate = 31250;
				break;
			case BAUD_38400:
				BaudRate = 38400;
				break;
			case BAUD_56000:
				BaudRate = 56000;
				break;
			case BAUD_57600:
				BaudRate = 57600;
				break;
			case BAUD_115200:
				BaudRate = 115200;
				break;
			case BAUD_128000:
				BaudRate = 133928; // actual rate is not 128000 ;
				break;
			case BAUD_256000:
				BaudRate = 281250; // actual rate is not  256000 ;
				break;
			case BAUD_300000:
				BaudRate = 312500; // actual rate is not  300000 ;
				break;
			case BAUD_375000:
				BaudRate = 401785; // actual rate is not  375000 ;
				break;
			case BAUD_500000:
				BaudRate = 562500; // actual rate is not  500000 ;
				break;
			case BAUD_600000:
				BaudRate = 703125; // actual rate is not  600000 ;
				break;
		}
		serial.setBaud(BaudRate);
	}
	/*
	 public void SetBaudrate(int Newrate)
	 {
	 DCB com1dcb ;
	 GetCommState(ComHandle4D,&com1dcb) ;
	 com1dcb.ByteSize = 8 ;
	 com1dcb.StopBits = ONESTOPBIT ;
	 com1dcb.Parity   = NOPARITY ;
	 com1dcb.XonChar  = 0 ;
	 com1dcb.XoffChar = 0 ;
	 com1dcb.fBinary  = 1 ; //TRUE ;
	 switch(Newrate)
	 {
	 case BAUD_110    : com1dcb.BaudRate = 110 ;
	 break ;
	 case BAUD_300    : com1dcb.BaudRate = 300 ;
	 break ;
	 case BAUD_600    : com1dcb.BaudRate = 600 ;
	 break ;
	 case BAUD_1200   : com1dcb.BaudRate = 1200 ;
	 break ;
	 case BAUD_2400   : com1dcb.BaudRate = 2400 ;
	 break ;
	 case BAUD_4800   : com1dcb.BaudRate = 4800 ;
	 break ;
	 case BAUD_9600   : com1dcb.BaudRate = 9600 ;
	 break ;
	 case BAUD_14400  : com1dcb.BaudRate = 14400 ;
	 break ;
	 case BAUD_19200  : com1dcb.BaudRate = 19200 ;
	 break ;
	 case BAUD_31250  : com1dcb.BaudRate = 31250 ;
	 break ;
	 case BAUD_38400  : com1dcb.BaudRate = 38400 ;
	 break ;
	 case BAUD_56000  : com1dcb.BaudRate = 56000 ;
	 break ;
	 case BAUD_57600  : com1dcb.BaudRate = 57600 ;
	 break ;
	 case BAUD_115200 : com1dcb.BaudRate = 115200 ;
	 break ;
	 case BAUD_128000 : com1dcb.BaudRate = 133928 ; // actual rate is not 128000 ;
	 break ;
	 case BAUD_256000 : com1dcb.BaudRate = 281250 ; // actual rate is not  256000 ;
	 break ;
	 case BAUD_300000 : com1dcb.BaudRate = 312500 ; // actual rate is not  300000 ;
	 break ;
	 case BAUD_375000 : com1dcb.BaudRate = 401785 ; // actual rate is not  375000 ;
	 break ;
	 case BAUD_500000 : com1dcb.BaudRate = 562500 ; // actual rate is not  500000 ;
	 break ;
	 case BAUD_600000 : com1dcb.BaudRate = 703125 ; // actual rate is not  600000 ;
	 break ;
	 }
	 SetCommState(ComHandle4D,&com1dcb) ;
	 }


	 public void SetThisBaudrate(int Newrate)
	 {
	 try {
	 FlushFileBuffers(ComHandle4D) ;  // ensure the change bause rate gets out
	 Thread.sleep(10) ;               // seems to be needed to enable Windows to change speed
	 SetBaudrate(Newrate) ;
	 Thread.sleep(50) ; // thow away any potential rubbish
	 PurgeComm(ComHandle4D,PURGE_TXABORT+PURGE_RXABORT+PURGE_TXCLEAR+PURGE_RXCLEAR) ; // thow away any potential rubbish
	 } catch (InterruptedException ex) {
	 Logger.getLogger(Intrinsic4dRoutines.class.getName()).log(Level.SEVERE, null, ex);
	 }
	 }
	 */
}
