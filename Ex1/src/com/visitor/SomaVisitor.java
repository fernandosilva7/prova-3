package com.visitor;

public class SomaVisitor implements OperVisitor{
	
	@Override
	public void operacao(DoisArgs dois) {
		int n1 = dois.getN1();
		int n2 = dois.getN2();
		int resultado = n1 + n2;
		System.out.println("Resultado = " + resultado);
		
	}

	@Override
	public void operacao(TresArgs tres) {
		int n1 = tres.getN1();
		int n2 = tres.getN2();
		int n3 = tres.getN3();
		int resultado = n1 + n2 + n3;
		System.out.println("Resultado = " + resultado);
	}

}
