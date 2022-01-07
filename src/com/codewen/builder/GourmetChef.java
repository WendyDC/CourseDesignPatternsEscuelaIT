package com.codewen.builder;

import com.codewen.singleton.PrintConsole;

public class GourmetChef implements Chef{
	
	PrintConsole printConsole = PrintConsole.getInstance();

	@Override
	public Dish preparateStarted() {
		printConsole.printMessageLevel2("preparateStarted[GormetChef-Oyster]");
		return new Oyster();
	}

	@Override
	public Dish preparateMainCourse() {
		printConsole.printMessageLevel2("preparateStarted[GormetChef-Sirloin]");
		return new Sirloin();
	}

	@Override
	public Dish preparateDessert() {
		printConsole.printMessageLevel2("preparateStarted[GormetChef-Soufle]");
		return new Soufle();
	}

}
