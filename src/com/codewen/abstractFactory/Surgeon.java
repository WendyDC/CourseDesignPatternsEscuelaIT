package com.codewen.abstractFactory;

public class Surgeon {
	public void operation(Instrumentalist instrumentalist) {
		CuttingTool cuttingTool = instrumentalist.createCuttingTools();
		DryingTool dryingTool = instrumentalist.createDryingTools();
		
		cuttingTool.cut();
		dryingTool.dry();
	}
}
