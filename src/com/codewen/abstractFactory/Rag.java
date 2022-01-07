package com.codewen.abstractFactory;

import com.codewen.singleton.PrintConsole;

public class Rag extends DryingTool{

	@Override
	public void dry() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printMessageLevel2("Rag dry");
	}

}
