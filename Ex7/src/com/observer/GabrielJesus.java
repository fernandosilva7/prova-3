package com.observer;

public class GabrielJesus extends Aplicativo{
	private String noticiasJesus;

	@Override
	public String getState() {
		return noticiasJesus;
	}

	@Override
	public void setState(String x) {
		this.noticiasJesus = x;
		super.notificar();
	}
}
