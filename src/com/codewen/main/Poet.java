package com.codewen.main;

import com.codewen.prototype.Poem;
import com.codewen.prototype.Poetry;
import com.codewen.singleton.PrintConsole;

public class Poet {
	private PrintConsole printer = PrintConsole.getInstance();

	public Poem sell(Poetry poetry, String title) {
		Poem poem = poetry.getPoem(title);
		printer.printMessageLevel1("Selling a copy of the poem " + title + " (poet)");
		return poem.copy();
	}
}
