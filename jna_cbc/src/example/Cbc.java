package example;

import com.sun.jna.Library;

public interface Cbc extends Library {

	public int entrance(int argc, String[] argv);
	//public int add(int argc, String[] argv);
}

