package example;

import com.sun.jna.Native;

public class Test {

	public static void main(String[] args) {
		//Add demoLib = (Add) Native.loadLibrary("dllExample", Add.class);
		Add demoLib = (Add) Native.loadLibrary("cbcCInterfaceDll", Add.class);

		System.out.println(demoLib.add(10, 20));
	}

}
