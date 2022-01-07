package com.codewen.abstractFactory;

public class InstrumentalistJungle implements Instrumentalist{

	@Override
	public Knife createCuttingTools() {
		return new Knife();
	}

	@Override
	public Rag createDryingTools() {
		return new Rag();
	}

}
