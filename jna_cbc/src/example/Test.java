package example;

import com.sun.jna.Native;

public class Test {

	public static void main(String[] args) {
		//Add demoLib = (Add) Native.loadLibrary("dllExample", Add.class);
		Cbc demoLib = (Cbc) Native.loadLibrary("cbc", Cbc.class);

		String[] arg = new String[] { "cbc", "D:\\cvwrsm\\trunk\\CbcM\\stable\\2.8\\Cbc\\MSVisualStudio\\v10\\Win32\\Release\\test.lp" };
		
		System.out.println(demoLib.entrance(2,arg));
	}

}
