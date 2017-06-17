package com.observer;

public class Neymar extends Aplicativo{
	private String noticiasNeymar;

	@Override
	public String getState() {
		return noticiasNeymar;
	}

	@Override
	public void setState(String x) {
		this.noticiasNeymar = x;
		super.notificar();
	}
}
