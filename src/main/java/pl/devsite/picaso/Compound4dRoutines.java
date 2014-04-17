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
public class Compound4dRoutines extends Intrinsic4dRoutines {

	public Compound4dRoutines(Serial serial) {
		super(serial);
	}
	// SPE Version 1.2 added peekM and pokeM functions
	// SPE Version 1.1 added bus_ and pin_ functions

	public int bus_In() throws IOException {
		int[] towrite = new int[]{F_bus_In >> 8,
			F_bus_In};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void bus_Out(int Bits) throws IOException {
		int[] towrite = new int[]{F_bus_Out >> 8,
			F_bus_Out,
			Bits >> 8,
			Bits};
		WriteBytes(towrite);
		GetAck();
	}

	public int bus_Read() throws IOException {
		int[] towrite = new int[]{F_bus_Read >> 8,
			F_bus_Read};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void bus_Set(int IOMap) throws IOException {
		int[] towrite = new int[]{F_bus_Set >> 8,
			F_bus_Set,
			IOMap >> 8,
			IOMap};
		WriteBytes(towrite);
		GetAck();
	}

	public void bus_Write(int Bits) throws IOException {
		int[] towrite = new int[]{F_bus_Write >> 8,
			F_bus_Write,
			Bits >> 8,
			Bits};
		WriteBytes(towrite);
		GetAck();
	}

	public int charheight(char TestChar) throws IOException {
		int[] towrite = new int[]{F_charheight >> 8,
			F_charheight,
			TestChar};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int charwidth(char TestChar) throws IOException {
		int[] towrite = new int[]{F_charwidth >> 8, F_charwidth, TestChar};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Close(int Handle) throws IOException {
		int[] towrite = new int[]{F_file_Close >> 8, F_file_Close, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Count(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_Count >> 8, F_file_Count};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResp();
	}

	public int file_Dir(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_Dir >> 8, F_file_Dir};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResp();
	}

	public int file_Erase(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_Erase >> 8, F_file_Erase};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResp();
	}

	public int file_Error() throws IOException {
		int[] towrite = new int[]{F_file_Error >> 8, F_file_Error};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Exec(String Filename, int ArgCount, char[] Args) throws IOException {
		int[] towrite = new int[]{F_file_Exec >> 8, F_file_Exec};
		WriteBytes(towrite);
		WriteChars(Filename);
		towrite = new int[]{ArgCount >> 8, ArgCount};
		WriteBytes(towrite);
		WriteWords(Args);
		return GetAckResp();
	}

	public int file_Exists(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_Exists >> 8, F_file_Exists};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResp();
	}

	public int file_FindFirst(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_FindFirst >> 8, F_file_FindFirst};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResp();
	}

	public int file_FindNext() throws IOException {
		int[] towrite = new int[]{F_file_FindNext >> 8, F_file_FindNext};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public char file_GetC(int Handle) throws IOException {
		int[] towrite = new int[]{F_file_GetC >> 8, F_file_GetC, Handle >> 8, Handle};
		WriteBytes(towrite);
		return (char)GetAckResp();
	}

	public String file_GetS(int Size, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_GetS >> 8, F_file_GetS, Size >> 8, Size, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResStr();
	}

	public int file_GetW(int Handle) throws IOException {
		int[] towrite = new int[]{F_file_GetW >> 8, F_file_GetW, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Image(int X, int Y, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_Image >> 8, F_file_Image, X >> 8, X, Y >> 8, Y, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Index(int Handle, int HiSize, int LoSize, int Recordnum) throws IOException {
		int[] towrite = new int[]{F_file_Index >> 8, F_file_Index, Handle >> 8, Handle, HiSize >> 8, HiSize, LoSize >> 8, LoSize, Recordnum >> 8, Recordnum};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_LoadFunction(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_LoadFunction >> 8, F_file_LoadFunction};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResp();
	}

	public int file_LoadImageControl(String Datname, String GCIName, int Mode) throws IOException {
		int[] towrite = new int[]{F_file_LoadImageControl >> 8, F_file_LoadImageControl};
		WriteBytes(towrite);
		WriteChars(Datname);
		WriteChars(GCIName);
		towrite = new int[]{Mode >> 8, Mode};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Mount() throws IOException {
		int[] towrite = new int[]{F_file_Mount >> 8, F_file_Mount};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Open(String Filename, char Mode) throws IOException {
		int[] towrite = new int[]{F_file_Open >> 8, F_file_Open};
		WriteBytes(towrite);
		WriteChars(Filename);
		towrite = new int[]{Mode};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_PlayWAV(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_PlayWAV >> 8,
			F_file_PlayWAV};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResp();
	}

	public int file_PutC(char Character, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_PutC >> 8, F_file_PutC, Character, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_PutS(String StringOut, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_PutS >> 8,
			F_file_PutS};
		WriteBytes(towrite);
		WriteChars(StringOut);
		towrite = new int[]{Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_PutW(int Word, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_PutW >> 8, F_file_PutW, Word >> 8, Word, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Read(byte[] Data, int Size, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_Read >> 8, F_file_Read, Size >> 8, Size, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResData(Data, Size);
	}

	public int file_Rewind(int Handle) throws IOException {
		int[] towrite = new int[]{F_file_Rewind >> 8, F_file_Rewind, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Run(String Filename, int ArgCount, char[] Args) throws IOException {
		int[] towrite = new int[]{F_file_Run >> 8,
			F_file_Run};
		WriteBytes(towrite);
		WriteChars(Filename);
		towrite = new int[]{ArgCount >> 8,
			ArgCount};
		WriteBytes(towrite);
		WriteWords(Args);
		return GetAckResp();
	}

	public int file_ScreenCapture(int X, int Y, int Width, int Height, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_ScreenCapture >> 8, F_file_ScreenCapture, X >> 8, X, Y >> 8, Y, Width >> 8, Width, Height >> 8, Height, Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_Seek(int Handle, int HiWord, int LoWord) throws IOException {
		int[] towrite = new int[]{F_file_Seek >> 8, F_file_Seek, Handle >> 8, Handle, HiWord >> 8, HiWord, LoWord >> 8, LoWord};
		WriteBytes(towrite);
		return GetAckResp();
	}
	/*
	 public int file_Size(int  Handle, int *  HiWord, int *  LoWord)throws IOException
	 {
	 int[] towrite = new int[]{ F_file_Size >> 8,F_file_Size,Handle >> 8 , Handle };
	 WriteBytes(towrite);
	 return GetAckRes2Words(HiWord,LoWord) ;
	 }

	 public int file_Tell(int  Handle, int *  HiWord, int *  LoWord)throws IOException
	 {
	 int[] towrite = new int[]{ F_file_Tell >> 8, F_file_Tell,Handle >> 8,Handle };
	 WriteBytes(towrite);
	 return GetAckRes2Words(HiWord,LoWord) ;
	 }*/

	public void file_Unmount() throws IOException {
		int[] towrite = new int[]{F_file_Unmount >> 8,
			F_file_Unmount};
		WriteBytes(towrite);
		GetAck();
	}

	public int file_Write(int Size, byte[] Source, int Handle) throws IOException {
		int[] towrite = new int[]{F_file_Write >> 8, F_file_Write, Size >> 8, Size};
		WriteBytes(towrite);
		WriteBytes(Source);
		towrite = new int[]{Handle >> 8, Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int gfx_BevelShadow(int Value) throws IOException {
		int[] towrite = new int[]{F_gfx_BevelShadow >> 8, F_gfx_BevelShadow, Value >> 8, Value};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int gfx_BevelWidth(int Value) throws IOException {
		int[] towrite = new int[]{F_gfx_BevelWidth >> 8, F_gfx_BevelWidth, Value >> 8, Value};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int gfx_BGcolour(int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_BGcolour >> 8, F_gfx_BGcolour, Color >> 8, Color};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void gfx_Button(int Up, int x, int y, int buttonColour, int txtColour, int font, int txtWidth, int txtHeight, String text) throws IOException {
		int[] towrite = new int[]{F_gfx_Button >> 8, F_gfx_Button, Up >> 8, Up, x >> 8, x, y >> 8, y, buttonColour >> 8, buttonColour, txtColour >> 8, txtColour, font >> 8, font, txtWidth >> 8, txtWidth, txtHeight >> 8, txtHeight};
		WriteBytes(towrite);
		WriteChars(text);
		GetAck();
	}

	public void gfx_ChangeColour(int OldColor, int NewColor) throws IOException {
		int[] towrite = new int[]{F_gfx_ChangeColour >> 8, F_gfx_ChangeColour, OldColor >> 8, OldColor, NewColor >> 8, NewColor};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_Circle(int X, int Y, int Radius, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Circle >> 8,
			F_gfx_Circle,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Radius >> 8,
			Radius, Color >> 8, Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_CircleFilled(int X, int Y, int Radius, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_CircleFilled >> 8,
			F_gfx_CircleFilled,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Radius >> 8,
			Radius,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_Clipping(int OnOff) throws IOException {
		int[] towrite = new int[]{F_gfx_Clipping >> 8,
			F_gfx_Clipping,
			OnOff >> 8,
			OnOff};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_ClipWindow(int X1, int Y1, int X2, int Y2) throws IOException {
		int[] towrite = new int[]{F_gfx_ClipWindow >> 8,
			F_gfx_ClipWindow,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_Cls() throws IOException {
		int[] towrite = new int[]{F_gfx_Cls >> 8,
			F_gfx_Cls};
		WriteBytes(towrite);
		GetAck();
	}

	public int gfx_Contrast(int Contrast) throws IOException {
		int[] towrite = new int[]{F_gfx_Contrast >> 8,
			F_gfx_Contrast,
			Contrast >> 8,
			Contrast};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void gfx_Ellipse(int X, int Y, int Xrad, int Yrad, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Ellipse >> 8,
			F_gfx_Ellipse,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Xrad >> 8,
			Xrad,
			Yrad >> 8,
			Yrad,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_EllipseFilled(int X, int Y, int Xrad, int Yrad, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_EllipseFilled >> 8,
			F_gfx_EllipseFilled,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Xrad >> 8,
			Xrad,
			Yrad >> 8,
			Yrad,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public int gfx_FrameDelay(int Msec) throws IOException {
		int[] towrite = new int[]{F_gfx_FrameDelay >> 8,
			F_gfx_FrameDelay,
			Msec >> 8,
			Msec};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int gfx_Get(int Mode) throws IOException {
		int[] towrite = new int[]{F_gfx_Get >> 8,
			F_gfx_Get,
			Mode >> 8,
			Mode};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int gfx_GetPixel(int X, int Y) throws IOException {
		int[] towrite = new int[]{F_gfx_GetPixel >> 8,
			F_gfx_GetPixel,
			X >> 8,
			X,
			Y >> 8,
			Y};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void gfx_Line(int X1, int Y1, int X2, int Y2, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Line >> 8,
			F_gfx_Line,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public int gfx_LinePattern(int Pattern) throws IOException {
		int[] towrite = new int[]{F_gfx_LinePattern >> 8,
			F_gfx_LinePattern,
			Pattern >> 8,
			Pattern};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void gfx_LineTo(int X, int Y) throws IOException {
		int[] towrite = new int[]{F_gfx_LineTo >> 8,
			F_gfx_LineTo,
			X >> 8,
			X,
			Y >> 8,
			Y};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_MoveTo(int X, int Y) throws IOException {
		int[] towrite = new int[]{F_gfx_MoveTo >> 8,
			F_gfx_MoveTo,
			X >> 8,
			X,
			Y >> 8,
			Y};
		WriteBytes(towrite);
		GetAck();
	}
	/*
	 public int gfx_Orbit(int  Angle, int  Distance, int *  Xdest, int *  Ydest)throws IOException
	 {
	 int[] towrite = new int[]{F_gfx_Orbit >> 8 ,
	 F_gfx_Orbit ,
	 Angle >> 8 ,
	 Angle ,
	 Distance >> 8 ,
	 Distance };
	 WriteBytes(towrite);
	 GetAck2Words(Xdest,Ydest) ;
	 return 0 ;
	 }*/

	public int gfx_OutlineColour(int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_OutlineColour >> 8,
			F_gfx_OutlineColour,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void gfx_Panel(int Raised, int X, int Y, int Width, int Height, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Panel >> 8,
			F_gfx_Panel,
			Raised >> 8,
			Raised,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Width >> 8,
			Width,
			Height >> 8,
			Height,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_Polygon(int n, char[] Xvalues, char[] Yvalues, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Polygon >> 8,
			F_gfx_Polygon,
			n >> 8,
			n};
		WriteBytes(towrite);
		WriteWords(Xvalues);
		WriteWords(Yvalues);
		towrite = new int[]{Color >> 8, Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_PolygonFilled(int n, char[] Xvalues, char[] Yvalues, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_PolygonFilled >> 8,
			F_gfx_PolygonFilled,
			n >> 8,
			n};
		WriteBytes(towrite);
		WriteWords(Xvalues);
		WriteWords(Yvalues);
		towrite = new int[]{Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_Polyline(int n, char[] Xvalues, char[] Yvalues, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Polyline >> 8, F_gfx_Polyline, n >> 8, n};
		WriteBytes(towrite);
		WriteWords(Xvalues);
		WriteWords(Yvalues);
		towrite = new int[]{Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_PutPixel(int X, int Y, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_PutPixel >> 8,
			F_gfx_PutPixel,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_Rectangle(int X1, int Y1, int X2, int Y2, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Rectangle >> 8,
			F_gfx_Rectangle,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_RectangleFilled(int X1, int Y1, int X2, int Y2, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_RectangleFilled >> 8,
			F_gfx_RectangleFilled,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_ScreenCopyPaste(int Xs, int Ys, int Xd, int Yd, int Width, int Height) throws IOException {
		int[] towrite = new int[]{F_gfx_ScreenCopyPaste >> 8,
			F_gfx_ScreenCopyPaste,
			Xs >> 8,
			Xs,
			Ys >> 8,
			Ys,
			Xd >> 8,
			Xd,
			Yd >> 8,
			Yd,
			Width >> 8,
			Width,
			Height >> 8,
			Height};
		WriteBytes(towrite);
		GetAck();
	}

	public int gfx_ScreenMode(int ScreenMode) throws IOException {
		int[] towrite = new int[]{F_gfx_ScreenMode >> 8,
			F_gfx_ScreenMode,
			ScreenMode >> 8,
			ScreenMode};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void gfx_Set(int Func, int Value) throws IOException {
		int[] towrite = new int[]{F_gfx_Set >> 8,
			F_gfx_Set,
			Func >> 8,
			Func,
			Value >> 8,
			Value};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_SetClipRegion() throws IOException {
		int[] towrite = new int[]{F_gfx_SetClipRegion >> 8,
			F_gfx_SetClipRegion};
		WriteBytes(towrite);
		GetAck();
	}

	public int gfx_Slider(int Mode, int X1, int Y1, int X2, int Y2, int Color, int Scale, int Value) throws IOException {
		int[] towrite = new int[]{F_gfx_Slider >> 8,
			F_gfx_Slider,
			Mode >> 8,
			Mode,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2,
			Color >> 8,
			Color,
			Scale >> 8,
			Scale,
			Value >> 8,
			Value};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int gfx_Transparency(int OnOff) throws IOException {
		int[] towrite = new int[]{F_gfx_Transparency >> 8,
			F_gfx_Transparency,
			OnOff >> 8,
			OnOff};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int gfx_TransparentColour(int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_TransparentColour >> 8,
			F_gfx_TransparentColour,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void gfx_Triangle(int X1, int Y1, int X2, int Y2, int X3, int Y3, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_Triangle >> 8,
			F_gfx_Triangle,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2,
			X3 >> 8,
			X3,
			Y3 >> 8,
			Y3,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public void gfx_TriangleFilled(int X1, int Y1, int X2, int Y2, int X3, int Y3, int Color) throws IOException {
		int[] towrite = new int[]{F_gfx_TriangleFilled >> 8,
			F_gfx_TriangleFilled,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2,
			X3 >> 8,
			X3,
			Y3 >> 8,
			Y3,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		GetAck();
	}

	public int img_ClearAttributes(int Handle, int Index, int Value) throws IOException {
		int[] towrite = new int[]{F_img_ClearAttributes >> 8,
			F_img_ClearAttributes,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index,
			Value >> 8,
			Value};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_Darken(int Handle, int Index) throws IOException {
		int[] towrite = new int[]{F_img_Darken >> 8,
			F_img_Darken,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_Disable(int Handle, int Index) throws IOException {
		int[] towrite = new int[]{F_img_Disable >> 8,
			F_img_Disable,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_Enable(int Handle, int Index) throws IOException {
		int[] towrite = new int[]{F_img_Enable >> 8,
			F_img_Enable,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_GetWord(int Handle, int Index, int Offset) throws IOException {
		int[] towrite = new int[]{F_img_GetWord >> 8,
			F_img_GetWord,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index,
			Offset >> 8,
			Offset};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_Lighten(int Handle, int Index) throws IOException {
		int[] towrite = new int[]{F_img_Lighten >> 8,
			F_img_Lighten,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_SetAttributes(int Handle, int Index, int Value) throws IOException {
		int[] towrite = new int[]{F_img_SetAttributes >> 8,
			F_img_SetAttributes,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index,
			Value >> 8,
			Value};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_SetPosition(int Handle, int Index, int Xpos, int Ypos) throws IOException {
		int[] towrite = new int[]{F_img_SetPosition >> 8,
			F_img_SetPosition,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index,
			Xpos >> 8,
			Xpos,
			Ypos >> 8,
			Ypos};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_SetWord(int Handle, int Index, int Offset, int Word) throws IOException {
		int[] towrite = new int[]{F_img_SetWord >> 8,
			F_img_SetWord,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index,
			Offset >> 8,
			Offset,
			Word >> 8,
			Word};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_Show(int Handle, int Index) throws IOException {
		int[] towrite = new int[]{F_img_Show >> 8,
			F_img_Show,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int img_Touched(int Handle, int Index) throws IOException {
		int[] towrite = new int[]{F_img_Touched >> 8,
			F_img_Touched,
			Handle >> 8,
			Handle,
			Index >> 8,
			Index};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int media_Flush() throws IOException {
		int[] towrite = new int[]{F_media_Flush >> 8,
			F_media_Flush};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void media_Image(int X, int Y) throws IOException {
		int[] towrite = new int[]{F_media_Image >> 8,
			F_media_Image,
			X >> 8,
			X,
			Y >> 8,
			Y};
		WriteBytes(towrite);
		GetAck();
	}

	public int media_Init() throws IOException {
		int[] towrite = new int[]{F_media_Init >> 8,
			F_media_Init};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int media_RdSector(byte[] SectorIn) throws IOException {
		int[] towrite = new int[]{F_media_RdSector >> 8,
			F_media_RdSector};
		WriteBytes(towrite);
		return GetAckResSector(SectorIn);
	}

	public int media_ReadByte() throws IOException {
		int[] towrite = new int[]{F_media_ReadByte >> 8,
			F_media_ReadByte};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int media_ReadWord() throws IOException {
		int[] towrite = new int[]{F_media_ReadWord >> 8,
			F_media_ReadWord};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void media_SetAdd(int HiWord, int LoWord) throws IOException {
		int[] towrite = new int[]{F_media_SetAdd >> 8,
			F_media_SetAdd,
			HiWord >> 8,
			HiWord,
			LoWord >> 8,
			LoWord};
		WriteBytes(towrite);
		GetAck();
	}

	public void media_SetSector(int HiWord, int LoWord) throws IOException {
		int[] towrite = new int[]{F_media_SetSector >> 8,
			F_media_SetSector,
			HiWord >> 8,
			HiWord,
			LoWord >> 8,
			LoWord};
		WriteBytes(towrite);
		GetAck();
	}

	public void media_Video(int X, int Y) throws IOException {
		int[] towrite = new int[]{F_media_Video >> 8,
			F_media_Video,
			X >> 8,
			X,
			Y >> 8,
			Y};
		WriteBytes(towrite);
		GetAck();
	}

	public void media_VideoFrame(int X, int Y, int Framenumber) throws IOException {
		int[] towrite = new int[]{F_media_VideoFrame >> 8,
			F_media_VideoFrame,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Framenumber >> 8,
			Framenumber};
		WriteBytes(towrite);
		GetAck();
	}

	public int media_WriteByte(int Byte) throws IOException {
		int[] towrite = new int[]{F_media_WriteByte >> 8,
			F_media_WriteByte,
			Byte >> 8,
			Byte};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int media_WriteWord(int Word) throws IOException {
		int[] towrite = new int[]{F_media_WriteWord >> 8,
			F_media_WriteWord,
			Word >> 8,
			Word};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int media_WrSector(byte[] SectorOut) throws IOException {
		int[] towrite = new int[]{F_media_WrSector >> 8,
			F_media_WrSector};
		WriteBytes(towrite);
		WriteBytes(SectorOut);
		return GetAckResp();
	}

	public int mem_Free(int Handle) throws IOException {
		int[] towrite = new int[]{F_mem_Free >> 8,
			F_mem_Free,
			Handle >> 8,
			Handle};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int mem_Heap() throws IOException {
		int[] towrite = new int[]{F_mem_Heap >> 8,
			F_mem_Heap};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int peekM(int Address) throws IOException {
		int[] towrite = new int[]{F_peekM >> 8,
			F_peekM,
			Address >> 8,
			Address};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int pin_HI(int Pin) throws IOException {
		int[] towrite = new int[]{F_pin_HI >> 8,
			F_pin_HI,
			Pin >> 8,
			Pin};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int pin_LO(int Pin) throws IOException {
		int[] towrite = new int[]{F_pin_LO >> 8,
			F_pin_LO,
			Pin >> 8,
			Pin};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int pin_Read(int Pin) throws IOException {
		int[] towrite = new int[]{F_pin_Read >> 8,
			F_pin_Read,
			Pin >> 8,
			Pin};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int pin_Set(int Mode, int Pin) throws IOException {
		int[] towrite = new int[]{F_pin_Set >> 8,
			F_pin_Set,
			Mode >> 8,
			Mode,
			Pin >> 8,
			Pin};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void pokeM(int Address, int WordValue) throws IOException {
		int[] towrite = new int[]{F_pokeM >> 8,
			F_pokeM,
			Address >> 8,
			Address,
			WordValue >> 8,
			WordValue};
		WriteBytes(towrite);
		GetAck();
	}

	public void putCH(int WordChar) throws IOException {
		int[] towrite = new int[]{F_putCH >> 8,
			F_putCH,
			WordChar >> 8,
			WordChar};
		WriteBytes(towrite);
		GetAck();
	}

	public int putstr(String InString) throws IOException {
		int[] towrite = new int[]{F_putstr >> 8,
			F_putstr};
		WriteBytes(towrite);
		WriteChars(InString);
		return GetAckResp();
	}

	public void snd_BufSize(int Bufsize) throws IOException {
		int[] towrite = new int[]{F_snd_BufSize >> 8,
			F_snd_BufSize,
			Bufsize >> 8,
			Bufsize};
		WriteBytes(towrite);
		GetAck();
	}

	public void snd_Continue() throws IOException {
		int[] towrite = new int[]{F_snd_Continue >> 8,
			F_snd_Continue};
		WriteBytes(towrite);
		GetAck();
	}

	public void snd_Pause() throws IOException {
		int[] towrite = new int[]{F_snd_Pause >> 8,
			F_snd_Pause};
		WriteBytes(towrite);
		GetAck();
	}

	public int snd_Pitch(int Pitch) throws IOException {
		int[] towrite = new int[]{F_snd_Pitch >> 8,
			F_snd_Pitch,
			Pitch >> 8,
			Pitch};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int snd_Playing() throws IOException {
		int[] towrite = new int[]{F_snd_Playing >> 8,
			F_snd_Playing};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void snd_Stop() throws IOException {
		int[] towrite = new int[]{F_snd_Stop >> 8,
			F_snd_Stop};
		WriteBytes(towrite);
		GetAck();
	}

	public void snd_Volume(int Volume) throws IOException {
		int[] towrite = new int[]{F_snd_Volume >> 8,
			F_snd_Volume,
			Volume >> 8,
			Volume};
		WriteBytes(towrite);
		GetAck();
	}

	public int sys_Sleep(int Units) throws IOException {
		int[] towrite = new int[]{F_sys_Sleep >> 8,
			F_sys_Sleep,
			Units >> 8,
			Units};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void touch_DetectRegion(int X1, int Y1, int X2, int Y2) throws IOException {
		int[] towrite = new int[]{F_touch_DetectRegion >> 8,
			F_touch_DetectRegion,
			X1 >> 8,
			X1,
			Y1 >> 8,
			Y1,
			X2 >> 8,
			X2,
			Y2 >> 8,
			Y2};
		WriteBytes(towrite);
		GetAck();
	}

	public int touch_Get(int Mode) throws IOException {
		int[] towrite = new int[]{F_touch_Get >> 8,
			F_touch_Get,
			Mode >> 8,
			Mode};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void touch_Set(int Mode) throws IOException {
		int[] towrite = new int[]{F_touch_Set >> 8,
			F_touch_Set,
			Mode >> 8,
			Mode};
		WriteBytes(towrite);
		GetAck();
	}

	public int txt_Attributes(int Attribs) throws IOException {
		int[] towrite = new int[]{F_txt_Attributes >> 8,
			F_txt_Attributes,
			Attribs >> 8,
			Attribs};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_BGcolour(int Color) throws IOException {
		int[] towrite = new int[]{F_txt_BGcolour >> 8,
			F_txt_BGcolour,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Bold(int Bold) throws IOException {
		int[] towrite = new int[]{F_txt_Bold >> 8,
			F_txt_Bold,
			Bold >> 8,
			Bold};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_FGcolour(int Color) throws IOException {
		int[] towrite = new int[]{F_txt_FGcolour >> 8,
			F_txt_FGcolour,
			Color >> 8,
			Color};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_FontID(int FontNumber) throws IOException {
		int[] towrite = new int[]{F_txt_FontID >> 8,
			F_txt_FontID,
			FontNumber >> 8,
			FontNumber};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Height(int Multiplier) throws IOException {
		int[] towrite = new int[]{F_txt_Height >> 8,
			F_txt_Height,
			Multiplier >> 8,
			Multiplier};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Inverse(int Inverse) throws IOException {
		int[] towrite = new int[]{F_txt_Inverse >> 8,
			F_txt_Inverse,
			Inverse >> 8,
			Inverse};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Italic(int Italic) throws IOException {
		int[] towrite = new int[]{F_txt_Italic >> 8,
			F_txt_Italic,
			Italic >> 8,
			Italic};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void txt_MoveCursor(int Line, int Column) throws IOException {
		int[] towrite = new int[]{F_txt_MoveCursor >> 8,
			F_txt_MoveCursor,
			Line >> 8,
			Line,
			Column >> 8,
			Column};
		WriteBytes(towrite);
		GetAck();
	}

	public int txt_Opacity(int TransparentOpaque) throws IOException {
		int[] towrite = new int[]{F_txt_Opacity >> 8,
			F_txt_Opacity,
			TransparentOpaque >> 8,
			TransparentOpaque};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public void txt_Set(int Func, int Value) throws IOException {
		int[] towrite = new int[]{F_txt_Set >> 8,
			F_txt_Set,
			Func >> 8,
			Func,
			Value >> 8,
			Value};
		WriteBytes(towrite);
		GetAck();
	}

	public int txt_Underline(int Underline) throws IOException {
		int[] towrite = new int[]{F_txt_Underline >> 8,
			F_txt_Underline,
			Underline >> 8,
			Underline};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Width(int Multiplier) throws IOException {
		int[] towrite = new int[]{F_txt_Width >> 8,
			F_txt_Width,
			Multiplier >> 8,
			Multiplier};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Wrap(int Position) throws IOException {
		int[] towrite = new int[]{F_txt_Wrap >> 8,
			F_txt_Wrap,
			Position >> 8,
			Position};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Xgap(int Pixels) throws IOException {
		int[] towrite = new int[]{F_txt_Xgap >> 8,
			F_txt_Xgap,
			Pixels >> 8,
			Pixels};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int txt_Ygap(int Pixels) throws IOException {
		int[] towrite = new int[]{F_txt_Ygap >> 8,
			F_txt_Ygap,
			Pixels >> 8,
			Pixels};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int file_CallFunction(int Handle, int ArgCount, char[] Args) throws IOException {
		int[] towrite = new int[]{F_file_CallFunction >> 8,
			F_file_CallFunction,
			Handle >> 8,
			Handle,
			ArgCount >> 8,
			ArgCount};
		WriteBytes(towrite);
		WriteWords(Args);
		return GetAckResp();
	}

	public String sys_GetModel() throws IOException {
		int[] towrite = new int[]{F_sys_GetModel >> 8,
			F_sys_GetModel};
		WriteBytes(towrite);
		return GetAckResStr();
	}

	public int sys_GetVersion() throws IOException {
		int[] towrite = new int[]{F_sys_GetVersion >> 8,
			F_sys_GetVersion};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int sys_GetPmmC() throws IOException {
		int[] towrite = new int[]{F_sys_GetPmmC >> 8,
			F_sys_GetPmmC};
		WriteBytes(towrite);
		return GetAckResp();
	}

	public int writeString(int Handle, String StringOut) throws IOException {
		int[] towrite = new int[]{F_writeString >> 8,
			F_writeString,
			Handle >> 8,
			Handle};
		WriteBytes(towrite);
		WriteChars(StringOut);
		return GetAckResp();
	}

	public String readString(int Handle) throws IOException {
		int[] towrite = new int[]{F_readString >> 8,
			F_readString,
			Handle >> 8,
			Handle};
		WriteBytes(towrite);
		return GetAckResStr();
	}

	public void blitComtoDisplay(int X, int Y, int Width, int Height, byte[] Pixels) throws IOException {
		int[] towrite = new int[]{F_blitComtoDisplay >> 8,
			F_blitComtoDisplay,
			X >> 8,
			X,
			Y >> 8,
			Y,
			Width >> 8,
			Width,
			Height >> 8,
			Height};
		WriteBytes(towrite);
		WriteBytes(Pixels);
		GetAck();
	}

	public String file_FindFirstRet(String Filename) throws IOException {
		int[] towrite = new int[]{F_file_FindFirstRet >> 8,
			F_file_FindFirstRet};
		WriteBytes(towrite);
		WriteChars(Filename);
		return GetAckResStr();
	}

	public String file_FindNextRet(String StringIn) throws IOException {
		int[] towrite = new int[]{F_file_FindNextRet >> 8,
			F_file_FindNextRet};
		WriteBytes(towrite);
		return GetAckResStr();
	}

	public void setbaudWait(int Newrate) throws IOException {
		int[] towrite = new int[]{F_setbaudWait >> 8,
			F_setbaudWait,
			Newrate >> 8,
			Newrate};
		WriteBytes(towrite);
		SetThisBaudrate(Newrate); // change this systems baud rate to match new display rate, ACK is 100ms away
		
		//GetAck();
		waitForAck();
	}
}
