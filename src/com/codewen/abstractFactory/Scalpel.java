package com.codewen.abstractFactory;

import com.codewen.singleton.PrintConsole;

public class Scalpel extends CuttingTool{

	@Override
	public void cut() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printMessageLevel2("Scalpel Cut");
	}

}
