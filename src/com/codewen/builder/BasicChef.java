package com.codewen.builder;

import com.codewen.singleton.PrintConsole;

public class BasicChef implements Chef{
	
	PrintConsole printConsole = PrintConsole.getInstance();

	@Override
	public Dish preparateStarted() {
		printConsole.printMessageLevel2("preparateStarted[BasicChef-Salad]");
		return new Salad();
	}

	@Override
	public Dish preparateMainCourse() {
		printConsole.printMessageLevel2("preparateStarted[BasicChef-Chicken]");
		return new Chicken();
	}

	@Override
	public Dish preparateDessert() {
		printConsole.printMessageLevel2("preparateStarted[BasicChef-Custard]");
		return new Custard();
	}

}
