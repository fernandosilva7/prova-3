package com.visitor;

public class TresArgs implements NumeroElement{
	private int n1;
	private int n2;
	private int n3;

	public TresArgs(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	@Override
	public void accept(OperVisitor ov) {
		ov.operacao(this);
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}
	
	public int getN3() {
		return n3;
	}
}
