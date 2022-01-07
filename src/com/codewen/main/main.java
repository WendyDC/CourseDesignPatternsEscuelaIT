package com.codewen.main;

import com.codewen.abstractFactory.Instrumentalist;
import com.codewen.abstractFactory.InstrumentalistJungle;
import com.codewen.abstractFactory.InstrumentalistOperationRoom;
import com.codewen.abstractFactory.Surgeon;
import com.codewen.singleton.PrintConsole;

public class main {
	
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
	
	public void createSingletonAux() {
		PrintConsole printConsoleAux = PrintConsole.getInstance();	
	}
	
	public void runSingleton() {
		PrintConsole printConsole = PrintConsole.getInstance();
		printConsole.printTitle("[Creation patterns] Singleton pattern");	
		createSingletonAux();
		printConsole.printMessageLevel1("PrintConsole instance is created only once and it has global access.");
	}
	
	public void run() {
		runSingleton();
		runAbstractfactory();
	}

	public static void main(String[] args) {
		new main().run();	
	}

}
