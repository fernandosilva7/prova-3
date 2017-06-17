package com.observer;

import java.util.ArrayList;

public abstract class Aplicativo {
	private ArrayList<Transmissor> obs;

	public Aplicativo(){
		obs = new ArrayList<Transmissor>();
	}
	
	public void acessar(Transmissor t){
		obs.add(t);
	}
	
	public void sair(Transmissor t){
		obs.remove(t);
	}
	
	protected void notificar(){
		for(Transmissor tm : obs){
			tm.update(this);
		}
	}
	
	public abstract String getState();
	
	public abstract void setState(String x);
}
