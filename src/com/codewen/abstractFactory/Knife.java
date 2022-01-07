package com.codewen.abstractFactory;

import com.codewen.singleton.PrintConsole;

public class Knife extends CuttingTool {

	@Override
	public void cut() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printMessageLevel2("Knife Cut");
	}

}
