package com.codewen.factoryMethod;

import com.codewen.singleton.PrintConsole;

public class Bicycle extends Vehicle {

	@Override
	public void ride() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printMessageLevel1("Bicycle");
	}

}
