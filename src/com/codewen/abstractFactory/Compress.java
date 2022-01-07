package com.codewen.abstractFactory;

import com.codewen.singleton.PrintConsole;

public class Compress extends DryingTool{

	@Override
	public void dry() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printMessageLevel2("Compress dry");
	}

}
