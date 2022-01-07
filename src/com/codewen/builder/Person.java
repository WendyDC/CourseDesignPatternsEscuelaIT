package com.codewen.builder;

import com.codewen.singleton.PrintConsole;

public class Person {

	public void eat(Chef chef) {
		PrintConsole printConsole = PrintConsole.getInstance();
		
		Dish start = chef.preparateStarted();
		Dish mainCouse = chef.preparateMainCourse();
		Dish dessert = chef.preparateDessert();
		
		printConsole.printMessageLevel2("Your menu is:");
		printConsole.printMessageLevel3("start: "+start.toString());
		printConsole.printMessageLevel3("mainCouse: "+mainCouse.toString());
		printConsole.printMessageLevel3("dessert: "+dessert.toString());
		
	}

}
