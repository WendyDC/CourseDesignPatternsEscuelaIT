package com.codewen.prototype;

import java.util.HashMap;

import com.codewen.singleton.PrintConsole;

public class Poetry {
	
	private PrintConsole printer = PrintConsole.getInstance();

	private HashMap<String, Poem> poems;

	public Poetry() {
		printer.printMessageLevel1("Generating prototypes (poetry)");

		this.poems = new HashMap<String, Poem>();

		Poem poem;
		poem = new LaCasadaInfiel();
		this.addPoem(poem);
		poem = new PoemaXX();
		this.addPoem(poem);
	}

	public void addPoem(Poem poem) {
		printer.printMessageLevel2("Prototype for " + poem.title);
		this.poems.put(poem.title, poem);
	}

	public void removePoem(Poem poem) {
		this.poems.remove(poem.title, poem);
	}

	public Poem getPoem(String title) {
		return this.poems.get(title);
	}	

}

