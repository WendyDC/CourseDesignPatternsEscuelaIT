package com.codewen.factoryMethod;

import com.codewen.singleton.PrintConsole;

public class Motorcycle extends Vehicle {

	@Override
	public void ride() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printMessageLevel1("Motorcycle");
	}

}
