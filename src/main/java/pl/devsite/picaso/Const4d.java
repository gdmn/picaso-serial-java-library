package pl.devsite.picaso;
/**
 * source: PICASO_CONST4D.H
 *
 * @author dmn
 */
public interface Const4d {

// baud divisor rates for setbaud(n);
	static int MIDI = 9;
	static int BAUD_110 = 0;
	static int BAUD_300 = 1;
	static int BAUD_600 = 2;
	static int BAUD_1200 = 3;
	static int BAUD_2400 = 4;
	static int BAUD_4800 = 5;
	static int BAUD_9600 = 6;
	static int BAUD_14400 = 7;
	static int BAUD_19200 = 8;
	static int BAUD_31250 = 9;
	static int BAUD_38400 = 10;
	static int BAUD_56000 = 11;
	static int BAUD_57600 = 12;
	static int BAUD_115200 = 13;
	static int BAUD_128000 = 14;
	static int BAUD_256000 = 15;
	static int BAUD_300000 = 16;
	static int BAUD_375000 = 17;
	static int BAUD_500000 = 18;
	static int BAUD_600000 = 19;
//------------------------------------------------------------------//
// CONSTANTS
//------------------------------------------------------------------//
// generic constants
	static int ENABLE = 1;
	static int DISABLE = 0;
	static int HI = 1;
	static int LO = 0;
	static int INPUT = 1;
	static int OUTPUT = 0;
	static int ON = 1;
	static int OFF = 0;
//------------------------------------------------------------------------------
// Pin related constants
//------------------------------------------------------------------------------
	static int IO1_PIN = 1; // pin=2 J1
	static int IO2_PIN = 2; // pin=1 J1
	static int IO3_PIN = 3; // pin=3 J1
	static int IO4_PIN = 4; // pin=5 J1 (also used for BUS_RD)
	static int IO5_PIN = 5; // pin=9 J2 (also used for BUS_WR)
	static int BUS_RD_PIN = 4; // pin=5 J1 (alias IO4_PIN)
	static int BUS_WR_PIN = 5; // pin=9 J2 (alias IO5_PIN)
	static int BACKLITE = 6; // backlite control pin
	static int AUDIO_ENABLE = 7; // amplifier chip control pin
	static int BUS_0 = 8; // pin=27 of J1
	static int BUS_1 = 9; // pin=25 of J1
	static int BUS_2 = 10; // pin=23 of J1
	static int BUS_3 = 11; // pin=21 of J1
	static int BUS_4 = 12; // pin=19 of J1
	static int BUS_5 = 13; // pin=17 of J1
	static int BUS_6 = 14; // pin=13 of J2
	static int BUS_7 = 15; // pin=11 of J2
//------------------------------------------------------------------------------
//gfx_Set() related constants
//------------------------------------------------------------------------------
	static int PEN_SIZE = 16; // not necessary to use (legacy mode)
	static int BACKGROUND_COLOUR = 17;
	static int OBJECT_COLOUR = 18; // line / circle / rectangle generic colour
	static int CLIPPING = 19; // clipping ON / OFF
	static int TRANSPARENT_COLOUR = 20; // (only on displays with specific hware feature)
	static int TRANSPARENCY = 21; //=0 = OFF,=1 = ON (only on displays with specific hware feature)
	static int FRAME_DELAY = 22; // legacy mode, see pokeB(IMAGE_DELAY, n);
	static int SCREEN_MODE = 23; // LANDSCAPE, LANDSCAPE_R, PORTRAIT, PORTRAIT_R
	static int OUTLINE_COLOUR = 24; // if not BLACK (0) , used for outline around circles,rectangles and filled polygons
	static int CONTRAST = 25; // for OLED,cahnge contrast, for LCD on or off only
	static int LINE_PATTERN = 26; // used for patterned lines,=16bit value (0 = no pattern, '1's = pattern)
	static int COLOUR_MODE = 27; // select=8 or=16 bit colour mode
	static int BEVEL_WIDTH = 28; // button bevel width
	static int BEVEL_SHADOW = 29; // button bevel shadow depth
	static int X_ORIGIN = 30; // display position X offset
	static int Y_ORIGIN = 31; // display position X offset
//gfx_Get() related constants
	static int X_MAX = 0; // current orientations screen maximum X co-ordinate
	static int Y_MAX = 1; // current orientations screen maximum Y co-ordinate
	static int LEFT_POS = 2; // last objects left co-ord
	static int TOP_POS = 3; // last objects top co-ord
	static int RIGHT_POS = 4; // last objects right co-ord
	static int BOTTOM_POS = 5; // last objects bottom co-ord
	static int X_ORG = 6; // display position X offset
	static int Y_ORG = 7; // display position X offset
	static int SOLID = 0; // PEN_SIZE
	static int OUTLINE = 1; // PEN_SIZE
	static int STYLE1 = 2;
	static int STYLE2 = 3;
	static int LANDSCAPE = 0; // SCREEN_MODE (north)
	static int LANDSCAPE_R = 1; // SCREEN_MODE (south)
	static int PORTRAIT = 2; // SCREEN_MODE (west)
	static int PORTRAIT_R = 3; // SCREEN_MODE (east)
	static int COLOUR8 = 1; // COLOUR_MODE=8 bit colour mode (not supported)
	static int COLOUR16 = 0; // COLOUR_MODE=16 bit colour mode
	static int DOWN = 0;
	static int UP = 1;
	static int HIDE = 2;
	static int SELECT = 3;
	static int SELECT_MULTIPLE = 4;
	static int BUTTON_DOWN = 0;
	static int BUTTON_UP = 1;
	static int SLIDER_SUNKEN = 0;
	static int SLIDER_RAISED = 1;
	static int SLIDER_HIDE = 2;
	static int PROGRESSBAR_RAISED = 0xFFFF;
	static int PROGRESSBAR_SUNKEN = 0xFFFE;
	static int PROGRESSBAR_HIDE = 2;
	static int PANEL_SUNKEN = 0;
	static int PANEL_RAISED = 1;
	static int PANEL_HIDE = 2;
//------------------------------------------------------------------------------
//txt_Set() related constants
//------------------------------------------------------------------------------
	static int TEXT_COLOUR = 0; // text foreground colr
	static int TEXT_BACKGROUND = 1; // text background colr
	static int TEXT_HIGHLIGHT = 1; // text background colr
	static int FONT_ID = 2; // default=0, else points to data statement font
	static int FONT_SIZE = 2; // compatibility
	static int TEXT_WIDTH = 3; // text width multiplier
	static int TEXT_HEIGHT = 4; // text height multiplier
	static int TEXT_XGAP = 5; // horizontal text gap (default=1)
	static int TEXT_YGAP = 6; // vertical text gap (default=1)
	static int TEXT_PRINTDELAY = 7; // for 'teletype' like effect when printing
	static int TEXT_OPACITY = 8; // text mode flag, TRANSPARENT or OPAQUE
	static int TEXT_BOLD = 9; // embolden text (auto reset)
	static int TEXT_ITALIC = 10; // italicize text (auto reset)
	static int TEXT_INVERSE = 11; // invert text (auto reset)
	static int TEXT_UNDERLINED = 12; // underline text (auto reset)
	static int TEXT_ATTRIBUTES = 13; // controls BOLD/ITALIC/INVERSE/UNDERLINE simultaneously
	static int TEXT_WRAP = 14; // Sets the pixel position where text wrap will occur at RHS
//------------------------------------------------------------------------------
//txt_Set() related arguments
// NB:- FONT4 must be inherited if required,
// eg #inherit "FONT4.fnt"
//------------------------------------------------------------------------------
	static int FONT1 = 0; // (same as system font)
	static int FONT2 = 1;
	static int FONT3 = 2;
	static int TRANSPARENT = 0; // TEXT_OPACITY transparent text
	static int OPAQUE = 1; // TEXT_OPACITY opaque text
	static int BOLD = 16; // TEXT_ATTRIBUTES bold text
	static int ITALIC = 32; // TEXT_ATTRIBUTES italic text
	static int INVERSE = 64; // TEXT_ATTRIBUTES inverse text
	static int UNDERLINED = 128; // TEXT_ATTRIBUTES underlined
//touch_Set() related constants
	static int TOUCH_ENABLE = 0;
	static int TOUCH_DISABLE = 1;
	static int TOUCH_REGIONDEFAULT = 2;
//touch_Get() related constants
	static int TOUCH_STATUS = 0;
	static int TOUCH_GETX = 1;
	static int TOUCH_GETY = 2;
	static int NOTOUCH = 0;
	static int TOUCH_PRESSED = 1;
	static int TOUCH_RELEASED = 2;
	static int TOUCH_MOVING = 3;
// image control offset related constants
	static int IMG_COUNT = 0;
	static int IMG_ENTRYLEN = 1;
	static int IMG_MODE = 2;
	static int IMG_GCI_FILENAME = 3;
	static int IMG_DAT_FILENAME = 4;
	static int IMG_GCIFILE_HANDLE = 5;
// image attribute flags
// for img_SetAttributes(...) and img_ClearAttributes(...)
	static int I_ENABLED = 0x8000; // bit=15, set for image enabled
	static int I_DARKEN = 0x4000; // bit=14, display dimmed
	static int I_LIGHTEN = 0x2000; // bit=13, display bright
	static int I_TOUCHED = 0x1000; // bit=12, touch test result
	static int I_Y_LOCK = 0x0800; // bit=11, stop Y movement
	static int I_X_LOCK = 0x0400; // bit=10, stop X movement
	static int I_TOPMOST = 0x0200; // bit=9, draw on top of other images next update (auto reset)
	static int I_STAYONTOP = 0x0100; // bit=8, draw on top of other images always
	static int I_MOVIE = 0x0080; // bit=7, image is a movie
	static int I_NOGROUP = 0x0040; // bit=6, set to exclude image refresh when using img_Show(hndl, ALL);
	static int I_TOUCH_DISABLE = 0x0020; // bit=5, set to disable touch for this image, default=1 for movie,=0 for image
	static int I_COLOUR16 = 0x0010; // bit=4, indicates=16 bit colour mode
	// bits=0-3 reserved
	static int ALL = 0xFFFF; // argument for img_xxx functions to update all images
// image control entry offsets
	static int IMAGE_LOWORD = 0; // WORD image address LO
	static int IMAGE_HIWORD = 1; // WORD image address HI
	static int IMAGE_XPOS = 2; // WORD image location X
	static int IMAGE_YPOS = 3; // WORD image location Y
	static int IMAGE_WIDTH = 4; // WORD image width
	static int IMAGE_HEIGHT = 5; // WORD image height
	static int IMAGE_FLAGS = 6; // WORD image flags
	static int IMAGE_DELAY = 7; // WORD inter frame delay
	static int IMAGE_FRAMES = 8; // WORD number of frames
	static int IMAGE_INDEX = 9; // WORD current frame
	static int IMAGE_CLUSTER = 10; // WORD image start cluster pos (for FAT16 only)
	static int IMAGE_SECTOR = 11; // WORD image start sector in cluster pos (for FAT16 only)
	static int IMAGE_TAG = 12; // WORD user variable #1
	static int IMAGE_TAG2 = 13; // WORD user variable #2
// DISK struct offsets
	static int DISK_FIRST_SECT_LO = 0; // DWORD address of the first sector of the FAT partition (LO word)
	static int DISK_FIRST_SECT_HI = 1; // address of the first sector of the FAT partition (HI word)
	static int DISK_FAT_LO = 2; // DWORD address of FAT (LO word)
	static int DISK_FAT_HI = 3; // address of FAT (HI word)
	static int DISK_ROOT_LO = 4; // DWORD address of root directory (LO word)
	static int DISK_ROOT_HI = 5; // address of root directory (HI word)
	static int DISK_DATA_LO = 6; // DWORD address of data area (LO word)
	static int DISK_DATA_HI = 7; // address of data area (HI word)
	static int DISK_MAXCLUS_LO = 8; // DWORD max number of clusters in partition (LO word)
	static int DISK_MAXCLUS_HI = 9; // max number of clusters in partition (HI word)
	static int DISK_MAXROOT = 10; // WORD max entries in root directory
	static int DISK_FATSIZE = 11; // WORD number of sectors in FAT
	static int DISK_FATCOPIES = 12; // WORD number of fat copies
	static int DISK_SECT_PER_CLUS = 13; // WORD number of sectors per cluster
	static int DISK_TYPE = 14; // WORD type of fat
	static int DISK_BUF = 15; // WORD pointer to=512 byte info buffer
// FILE struct offsets
	static int FILE_FIRST_CLUSTER = 0; // WORD first cluster
	static int FILE_CURR_CLUSTER = 1; // WORD current cluster in file
	static int FILE_CURR_SECTOR = 2; // WORD sector in current cluster
	static int FILE_CURR_SECTOR_POS = 3; // WORD position in current sector
	static int FILE_CURR_SECTOR_TOP = 4; // WORD number bytes in current sector buffer
	static int FILE_SEEK_POS_LO = 5; // DWORD position in the file (LO word)
	static int FILE_SEEK_POS_HI = 6; // position in the file (HI word)
	static int FILE_SIZE_LO = 7; // DWORD file size (LO word)
	static int FILE_SIZE_HI = 8; // file size (HI word)
	static int FILE_TIME = 9; // WORD last update time
	static int FILE_DATE = 10; // WORD last update date
	static int FILE_NAME = 11; // WORD =12 byte buffer for filename
	static int FILE_MODE = 17; // WORD file mode 'r', 'w', 'a'
	static int FILE_ATTRIBUTES = 18; // WORD files attributes
	static int FILE_PAGEFLAG = 19; // WORD cache check flag
	static int FILE_ENTRY = 20; // WORD entry position in cur directory
	static int FILE_DISK = 21; // WORD* pointer to DISK mount media structure
	static int FILE_BUFFER = 22; // WORD* sector buffer
// timer control related constants
	static int TIMER0 = 0;
	static int TIMER1 = 1;
	static int TIMER2 = 2;
	static int TIMER3 = 3;
	static int TIMER4 = 4;
	static int TIMER5 = 5;
	static int TIMER6 = 6;
	static int TIMER7 = 7;
// I2C timing related constants
	static int I2C_SLOW = 0;
	static int I2C_MED = 1;
	static int I2C_FAST = 2;
// spi_Init(...) mode arguments
	static int SPI_SLOW = 2; //=750khz
	static int SPI_MED = 1; //=3mhz
	static int SPI_FAST = 0; //=12mhz
	static int RXMODE_0 = 0; // receive sample pos
	static int RXMODE_1 = 1; // receive sample pos
	static int CKMODE_0 = 0; // transmit sample pos
	static int CKMODE_1 = 1; // transmit sample pos
	static int CKMODE_2 = 2; // transmit sample pos
	static int CKMODE_3 = 3; // transmit sample pos
//------------------------------------------------------------------------------
// system WORD variables accesible with peekW and pokeW or pointer access
// Note that the txt_Set variables (0-15) and gfx_set variables (16-31)
// can also be accessed with peekW and pokeW
//------------------------------------------------------------------------------
	static int RANDOM_LO = 32; // random number generator LO word
	static int RANDOM_HI = 33; // random number generator LO word
	static int SYSTEM_TIMER_LO = 34; //=1msec=32 bit free running timer LO word
	static int SYSTEM_TIMER_HI = 35; //=1msec=32 bit free running timer HI word
	static int TMR0 = 36; // user timer0
	static int TMR1 = 37; // user timer1
	static int TMR2 = 38; // user timer2
	static int TMR3 = 39; // user timer3 (10msec resolution)
	static int TMR4 = 40; // user timer0
	static int TMR5 = 41; // user timer1
	static int TMR6 = 42; // user timer2
	static int TMR7 = 43; // user timer3 (10msec resolution)
	static int SYS_X_MAX = 44; // display hardware X res-1
	static int SYS_Y_MAX = 45; // display hardware Y res-1
	static int GFX_XMAX = 46; // current display width-1 determined by portrait / landscape swapping
	static int GFX_YMAX = 47; // current display width-1 determined by portrait / landscape swapping
	static int GFX_LEFT = 48; // virtual left point for most recent object
	static int GFX_TOP = 49; // virtual top point for most recent object
	static int GFX_RIGHT = 50; // virtual right point for most recent object
	static int GFX_BOTTOM = 51; // virtual bottom point for most recent object
	static int GFX_X1 = 52; // clipped left point for current object
	static int GFX_Y1 = 53; // clipped top point for current object
	static int GFX_X2 = 54; // clipped right point for current object
	static int GFX_Y2 = 55; // clipped bottom point for current object
	static int GFX_X_ORG = 56; // current X origin
	static int GFX_Y_ORG = 57; // current Y origin
	static int GFX_HILITE_LINE = 58; // current multi line button hilite line
	static int GFX_LINE_COUNT = 59; // count of lines in multiline button
	static int GFX_LAST_SELECTION = 60; // last selected line
	static int GFX_HILIGHT_BACKGROUND = 61; // multi button hilite background colour
	static int GFX_HILIGHT_FOREGROUND = 62; // multi button hilite background colour
	static int GFX_BUTTON_FOREGROUND = 63; // store default text colour for hilite line tracker
	static int GFX_BUTTON_BACKGROUND = 64; // store default button colour for hilite line tracker
	static int GFX_BUTTON_MODE = 65; // store current buttons mode
	static int GFX_TOOLBAR_HEIGHT = 66; // height above
	static int GFX_STATUSBAR_HEIGHT = 67; // height below
	static int GFX_LEFT_GUTTER_WIDTH = 68; // width to left
	static int GFX_RIGHT_GUTTER_WIDTH = 69; // width to right
	static int GFX_PIXEL_SHIFT = 70; // pixel shift for button depress illusion (default=1)
	static int GFX_RECT_X1 = 71; // gp rect, used by multiline button to hilite required line
	static int GFX_RECT_Y1 = 72;
	static int GFX_RECT_X2 = 73;
	static int GFX_RECT_Y2 = 74;
	static int GFX_THUMB_PERCENT = 75; // size of slider thumb as percentage
	static int GFX_THUMB_BORDER_DARK = 76; // darker shadow of thumb
	static int GFX_THUMB_BORDER_LIGHT = 77; // lighter shadow of thumb
	static int TOUCH_XMINCAL = 78; // touch calibration value
	static int TOUCH_YMINCAL = 79; // touch calibration value
	static int TOUCH_XMAXCAL = 80; // touch calibration value
	static int TOUCH_YMAXCAL = 81; // touch calibration value
	static int IMG_WIDTH = 82; // width of currently loaded image
	static int IMG_HEIGHT = 83; // height of currently loaded image
	static int IMG_FRAME_DELAY = 84; //=0 if image, else inter frame delay for movie
	static int IMG_FLAGS = 85; // bit=4 determines colour mode, other bits reserved
	static int IMG_FRAME_COUNT = 86; // count of frames in a movie
	static int IMG_PIXEL_COUNT_LO = 87; // count of pixels in the current frame
	static int IMG_PIXEL_COUNT_HI = 88; // count of pixels in the current frame
	static int IMG_CURRENT_FRAME = 89; // last frame shown
	static int MEDIA_ADDRESS_LO = 90; // uSD byte address LO
	static int MEDIA_ADDRESS_HI = 91; // uSD byte address HI
	static int MEDIA_SECTOR_LO = 92; // uSD sector address LO
	static int MEDIA_SECTOR_HI = 93; // uSD sector address HI
	static int MEDIA_SECTOR_COUNT = 94; // uSD number of bytes remaining in sector
	static int TEXT_XPOS = 95; // text current x pixel position
	static int TEXT_YPOS = 96; // text current y pixel position
	static int TEXT_MARGIN = 97; // text left pixel pos for carriage return
	static int TXT_FONT_ID = 98; // font type,=0 = system font, else pointer to user font
	static int TXT_FONT_MAX = 99; // max number of chars in font
	static int TXT_FONT_OFFSET = 100; // starting offset (normally=0x20)
	static int TXT_FONT_WIDTH = 101; // current font width
	static int TXT_FONT_HEIGHT = 102; // current font height
	static int GFX_TOUCH_REGION_X1 = 103; // touch capture region
	static int GFX_TOUCH_REGION_Y1 = 104;
	static int GFX_TOUCH_REGION_X2 = 105;
	static int GFX_TOUCH_REGION_Y2 = 106;
	static int GFX_CLIP_LEFT_VAL = 107; // left clipping point (set with gfx_ClipWindow(...)
	static int GFX_CLIP_TOP_VAL = 108; // top clipping point (set with gfx_ClipWindow(...)
	static int GFX_CLIP_RIGHT_VAL = 109; // right clipping point (set with gfx_ClipWindow(...)
	static int GFX_CLIP_BOTTOM_VAL = 110; // bottom clipping point (set with gfx_ClipWindow(...)
	static int GFX_CLIP_LEFT = 111; // current clip value (reads full size if clipping turned off)
	static int GFX_CLIP_TOP = 112; // current clip value (reads full size if clipping turned off)
	static int GFX_CLIP_RIGHT = 113; // current clip value (reads full size if clipping turned off)
	static int GFX_CLIP_BOTTOM = 114; // current clip value (reads full size if clipping turned off)
	static int GRAM_PIXEL_COUNT_LO = 115; // LO word of count of pixels in the set GRAM area
	static int GRAM_PIXEL_COUNT_HI = 116; // HI word of count of pixels in the set GRAM area
	static int TOUCH_RAW_X = 117; //=12 bit raw A2D X value from touch screen
	static int TOUCH_RAW_Y = 118; //=12 bit raw A2D Y value from touch screen
	static int GFX_LAST_CHAR_WIDTH = 119; // calculated int width from last call to charWidth function
	static int GFX_LAST_CHAR_HEIGHT = 120; // calculated height from last call to charHeight function
	static int GFX_LAST_STR_WIDTH = 121; // calculated width from last call to strWidth function
	static int GFX_LAST_STR_HEIGHT = 122; // calculated height from last call to strHeight function
//------------------------------------------------------------------------------
// FILEIO Error Code Constants
//------------------------------------------------------------------------------
	static int FE_OK = 0; // IDE function succeeded
	static int FE_IDE_ERROR = 1; // IDE command execution error
	static int FE_NOT_PRESENT = 2; // CARD not present
	static int FE_PARTITION_TYPE = 3; // WRONG partition type, not FAT16
	static int FE_INVALID_MBR = 4; // MBR sector invalid signature
	static int FE_INVALID_BR = 5; // Boot Record invalid signature
	static int FE_DISK_NOT_MNTD = 6; // Media not mounted
	static int FE_FILE_NOT_FOUND = 7; // File not found in open for read
	static int FE_INVALID_FILE = 8; // File not open
	static int FE_FAT_EOF = 9; // Fat attempt to read beyond EOF
	static int FE_EOF = 10; // Reached the end of file
	static int FE_INVALID_CLUSTER = 11; // Invalid cluster value > maxcls
	static int FE_DIR_FULL = 12; // All root dir entry are taken
	static int FE_DISK_FULL = 13; // All clusters in partition are taken
	static int FE_FILE_OVERWRITE = 14; // A file with same name exist already
	static int FE_CANNOT_INIT = 15; // Cannot init the CARD
	static int FE_CANNOT_READ_MBR = 16; // Cannot read the MBR
	static int FE_MALLOC_FAILED = 17; // Malloc could not allocate the FILE struct
	static int FE_INVALID_MODE = 18; // Mode was not r.w.
	static int FE_FIND_ERROR = 19; // Failure during FILE search
	static int FE_INVALID_FNAME = 20; // bad filename
	static int FE_INVALID_MEDIA = 21; // bad media
	static int FE_SECTOR_READ_FAIL = 22; // sector read failed
	static int FE_SECTOR_WRITE_FAIL = 23; // sector write failed

	/*
	 =16 bit RGB (565) Colour Chart
	 Original work by=4D Forum Member: skadoo
	 */
	static int ALICEBLUE = 0xF7DF;
	static int ANTIQUEWHITE = 0xFF5A;
	static int AQUA = 0x07FF;
	static int AQUAMARINE = 0x7FFA;
	static int AZURE = 0xF7FF;
	static int BEIGE = 0xF7BB;
	static int BISQUE = 0xFF38;
	static int BLACK = 0x0000;
	static int BLANCHEDALMOND = 0xFF59;
	static int BLUE = 0x001F;
	static int BLUEVIOLET = 0x895C;
	static int BROWN = 0xA145;
	static int BURLYWOOD = 0xDDD0;
	static int CADETBLUE = 0x5CF4;
	static int CHARTREUSE = 0x7FE0;
	static int CHOCOLATE = 0xD343;
	static int CORAL = 0xFBEA;
	static int CORNFLOWERBLUE = 0x64BD;
	static int CORNSILK = 0xFFDB;
	static int CRIMSON = 0xD8A7;
	static int CYAN = 0x07FF;
	static int DARKBLUE = 0x0011;
	static int DARKCYAN = 0x0451;
	static int DARKGOLDENROD = 0xBC21;
	static int DARKGRAY = 0xAD55;
	static int DARKGREEN = 0x0320;
	static int DARKKHAKI = 0xBDAD;
	static int DARKMAGENTA = 0x8811;
	static int DARKOLIVEGREEN = 0x5345;
	static int DARKORANGE = 0xFC60;
	static int DARKORCHID = 0x9999;
	static int DARKRED = 0x8800;
	static int DARKSALMON = 0xECAF;
	static int DARKSEAGREEN = 0x8DF1;
	static int DARKSLATEBLUE = 0x49F1;
	static int DARKSLATEGRAY = 0x2A69;
	static int DARKTURQUOISE = 0x067A;
	static int DARKVIOLET = 0x901A;
	static int DEEPPINK = 0xF8B2;
	static int DEEPSKYBLUE = 0x05FF;
	static int DIMGRAY = 0x6B4D;
	static int DODGERBLUE = 0x1C9F;
	static int FIREBRICK = 0xB104;
	static int FLORALWHITE = 0xFFDE;
	static int FORESTGREEN = 0x2444;
	static int FUCHSIA = 0xF81F;
	static int GAINSBORO = 0xDEFB;
	static int GHOSTWHITE = 0xFFDF;
	static int GOLD = 0xFEA0;
	static int GOLDENROD = 0xDD24;
	static int GRAY = 0x8410;
	static int GREEN = 0x0400;
	static int GREENYELLOW = 0xAFE5;
	static int HONEYDEW = 0xF7FE;
	static int HOTPINK = 0xFB56;
	static int INDIANRED = 0xCAEB;
	static int INDIGO = 0x4810;
	static int IVORY = 0xFFFE;
	static int KHAKI = 0xF731;
	static int LAVENDER = 0xE73F;
	static int LAVENDERBLUSH = 0xFF9E;
	static int LAWNGREEN = 0x7FE0;
	static int LEMONCHIFFON = 0xFFD9;
	static int LIGHTBLUE = 0xAEDC;
	static int LIGHTCORAL = 0xF410;
	static int LIGHTCYAN = 0xE7FF;
	static int LIGHTGOLD = 0xFFDA;
	static int LIGHTGREEN = 0x9772;
	static int LIGHTGREY = 0xD69A;
	static int LIGHTPINK = 0xFDB8;
	static int LIGHTSALMON = 0xFD0F;
	static int LIGHTSEAGREEN = 0x2595;
	static int LIGHTSKYBLUE = 0x867F;
	static int LIGHTSLATEGRAY = 0x7453;
	static int LIGHTSTEELBLUE = 0xB63B;
	static int LIGHTYELLOW = 0xFFFC;
	static int LIME = 0x07E0;
	static int LIMEGREEN = 0x3666;
	static int LINEN = 0xFF9C;
	static int MAGENTA = 0xF81F;
	static int MAROON = 0x8000;
	static int MEDIUMAQUAMARINE = 0x6675;
	static int MEDIUMBLUE = 0x0019;
	static int MEDIUMORCHID = 0xBABA;
	static int MEDIUMPURPLE = 0x939B;
	static int MEDIUMSEAGREEN = 0x3D8E;
	static int MEDIUMSLATEBLUE = 0x7B5D;
	static int MEDIUMSPRINGGREEN = 0x07D3;
	static int MEDIUMTURQUOISE = 0x4E99;
	static int MEDIUMVIOLETRED = 0xC0B0;
	static int MIDNIGHTBLUE = 0x18CE;
	static int MINTCREAM = 0xF7FF;
	static int MISTYROSE = 0xFF3C;
	static int MOCCASIN = 0xFF36;
	static int NAVAJOWHITE = 0xFEF5;
	static int NAVY = 0x0010;
	static int OLDLACE = 0xFFBC;
	static int OLIVE = 0x8400;
	static int OLIVEDRAB = 0x6C64;
	static int ORANGE = 0xFD20;
	static int ORANGERED = 0xFA20;
	static int ORCHID = 0xDB9A;
	static int PALEGOLDENROD = 0xEF55;
	static int PALEGREEN = 0x9FD3;
	static int PALETURQUOISE = 0xAF7D;
	static int PALEVIOLETRED = 0xDB92;
	static int PAPAYAWHIP = 0xFF7A;
	static int PEACHPUFF = 0xFED7;
	static int PERU = 0xCC27;
	static int PINK = 0xFE19;
	static int PLUM = 0xDD1B;
	static int POWDERBLUE = 0xB71C;
	static int PURPLE = 0x8010;
	static int RED = 0xF800;
	static int ROSYBROWN = 0xBC71;
	static int ROYALBLUE = 0x435C;
	static int SADDLEBROWN = 0x8A22;
	static int SALMON = 0xFC0E;
	static int SANDYBROWN = 0xF52C;
	static int SEAGREEN = 0x2C4A;
	static int SEASHELL = 0xFFBD;
	static int SIENNA = 0xA285;
	static int SILVER = 0xC618;
	static int SKYBLUE = 0x867D;
	static int SLATEBLUE = 0x6AD9;
	static int SLATEGRAY = 0x7412;
	static int SNOW = 0xFFDF;
	static int SPRINGGREEN = 0x07EF;
	static int STEELBLUE = 0x4416;
	static int TAN = 0xD5B1;
	static int TEAL = 0x0410;
	static int THISTLE = 0xDDFB;
	static int TOMATO = 0xFB08;
	static int TURQUOISE = 0x471A;
	static int VIOLET = 0xEC1D;
	static int WHEAT = 0xF6F6;
	static int WHITE = 0xFFFF;
	static int WHITESMOKE = 0xF7BE;
	static int YELLOW = 0xFFE0;
	static int YELLOWGREEN = 0x9E66;
}
