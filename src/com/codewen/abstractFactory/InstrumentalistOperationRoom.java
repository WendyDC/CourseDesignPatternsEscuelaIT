package com.codewen.abstractFactory;

public class InstrumentalistOperationRoom implements Instrumentalist{

	@Override
	public Scalpel createCuttingTools() {
		return new Scalpel();
	}

	@Override
	public Compress createDryingTools() {
		return new Compress();
	}

}
