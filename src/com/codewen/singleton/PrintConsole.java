package com.codewen.singleton;

public class PrintConsole {
	
	private static PrintConsole printConsole = null;
	
	private PrintConsole() {}
	
	public static PrintConsole getInstance() {
		if(printConsole == null) {
			System.out.println("InstanceCreate[PrintConsole]");
			printConsole = new PrintConsole();
		}
		return printConsole;
	}
	
	public void printTitle(String title) {
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println(title.toUpperCase() + " EXAMPLE");
		System.out.println("*************************************************************");
	}

	public void printSubTitle(String subtitle) {
		System.out.println();
		System.out.println();
		System.out.println(subtitle);
		System.out.println("-------------------------------------------------------------");
		System.out.println();
	}

	public void printMessageLevel1(String message) {
		System.out.println(message);
	}

	public void printMessageLevel2(String message) {
		System.out.println("   " + message);
	}

	public void printMessageLevel3(String message) {
		System.out.println("      " + message);
	}

	public void printMessageLevel4(String message) {
		System.out.println("         " + message);
	}
}
