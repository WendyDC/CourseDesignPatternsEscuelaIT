package com.codewen.main;

import com.codewen.abstractFactory.InstrumentalistJungle;
import com.codewen.abstractFactory.InstrumentalistOperationRoom;
import com.codewen.abstractFactory.Surgeon;
import com.codewen.builder.BasicChef;
import com.codewen.builder.GourmetChef;
import com.codewen.builder.Person;
import com.codewen.singleton.PrintConsole;

public class main {
	
	public void run() {
		runSingleton();
		runAbstractfactory();
		runBuilder();
	}
	
	public void runSingleton() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printTitle("[Creation patterns] Singleton pattern");	
		createSingletonAux();
		printConsole.printMessageLevel1("PrintConsole instance is created only once and it has global access.");
	}
	
	public void createSingletonAux() {
		PrintConsole printConsoleAux = PrintConsole.getInstance();	
	}
	
	public void runAbstractfactory() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printTitle("[Creation patterns] Abstractfactory");	
		Surgeon surgeon = new Surgeon();
		
		printConsole.printSubTitle("Group 1. Operating room");
		InstrumentalistOperationRoom instrumentalistOperationRoom = new InstrumentalistOperationRoom();
		surgeon.operation(instrumentalistOperationRoom);
		
		printConsole.printSubTitle("Group 2. Jungle");
		InstrumentalistJungle instrumentalistJungle = new InstrumentalistJungle();
		surgeon.operation(instrumentalistJungle);		
	}
	
	private void runBuilder() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printTitle("[Creation patterns] Builder");	
		Person person = new Person();
		
		printConsole.printSubTitle("Group 1. Basic");
		BasicChef basicChef = new BasicChef();
		person.eat(basicChef);
		
		printConsole.printSubTitle("Group 2. Gourmet");
		GourmetChef gourmetChef = new GourmetChef();
		person.eat(gourmetChef);
		
		
	}

	public static void main(String[] args) {
		new main().run();	
	}

}
