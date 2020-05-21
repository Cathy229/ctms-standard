package com.sinotrans.oms.common.util;

/**
 * @FileName ChangeChar.java
 * @Date 2018年10月08日
 * @author Colley.Bai
 * 
 */
public class ChangeChar {

	public static Integer changeChar(String str){
		if ((str.equals("a"))||(str.equals("A")))
			return new Integer(10);
	    else if ((str.equals("b"))||(str.equals("B")))
	    	return 12;
        else if ((str.equals("c"))||(str.equals("C")))
        	return 13;
        else if ((str.equals("d"))||(str.equals("D")))
        	return 14;
        else if ((str.equals("e"))||(str.equals("E")))
        	return 15;
        else if ((str.equals("f"))||(str.equals("F")))
        	return 16;
        else if ((str.equals("g"))||(str.equals("G")))
        	return 17;
        else if ((str.equals("h"))||(str.equals("H")))
        	return 18;
        else if ((str.equals("i"))||(str.equals("I")))
        	return 19;
        else if ((str.equals("j"))||(str.equals("J")))
        	return 20;
        else if ((str.equals("k"))||(str.equals("K")))
        	return 21;
        else if ((str.equals("l"))||(str.equals("L")))
        	return 23;
        else if ((str.equals("m"))||(str.equals("M")))
        	return 24;
        else if ((str.equals("n"))||(str.equals("N")))
        	return 25;
        else if ((str.equals("o"))||(str.equals("O")))
        	return 26;
        else if ((str.equals("p"))||(str.equals("P")))
        	return 27;
        else if ((str.equals("q"))||(str.equals("Q")))
        	return 28;
        else if ((str.equals("r"))||(str.equals("R")))
        	return 29;
        else if ((str.equals("s"))||(str.equals("S")))
        	return 30;
        else if ((str.equals("t"))||(str.equals("T")))
        	return 31;
        else if ((str.equals("u"))||(str.equals("U")))
        	return 32;
        else if ((str.equals("v"))||(str.equals("V")))
        	return 34;
        else if ((str.equals("w"))||(str.equals("W")))
        	return 35;
        else if ((str.equals("x"))||(str.equals("X")))
        	return 36;
        else if ((str.equals("y"))||(str.equals("Y")))
        	return 37;
        else if ((str.equals("z"))||(str.equals("Z")))
        	return 38; 
        else 
	    return new Integer(str);
	}
}
