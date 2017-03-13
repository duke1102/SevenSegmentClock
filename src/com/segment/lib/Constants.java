package com.segment.lib;

public final class Constants {

	static final String APP_TITLE = "Digitaluhr";
	static final String ICO_URL = "clock.png";
	
	public static final boolean[][] CLOCKBIN = 
		{
			 new boolean[] { true, true, true, true, true, true, false }, 			// 0
			 new boolean[] { false, true, true, false, false, false, false }, 		// 1	
			 new boolean[] { true, true, false, true, true, false, true },			// 2
			 new boolean[] { true, true, true, true, false, false, true },			// 3
			 new boolean[] { false, true, true, false, false, true, true },			// 4
			 new boolean[] { true, false, true, true, false, true, true },			// 5
			 new boolean[] { true, false, true, true, true, true, true },			// 6
			 new boolean[] { true, true, true, false, false, false, false },		// 7
			 new boolean[] { true, true, true, true, true, true, true },			// 8
			 new boolean[] { true, true, true, true, false, true, true }			// 9
	};
	
	public static int getNthDigit(int number, int base, int n) { return (int) ((number / Math.pow(base, n - 1)) % base); }
}

