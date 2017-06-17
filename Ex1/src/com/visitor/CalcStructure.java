package com.visitor;

public class CalcStructure {

	public static void main(String[] args) {
		
		OperVisitor ov = new SomaVisitor();
		
		NumeroElement dois = new DoisArgs(3,7);
		NumeroElement tres = new TresArgs(5,5,5);
		
		dois.accept(ov);
		tres.accept(ov);

	}

}
