package com.observer;

public class Imprensa implements Transmissor{

	@Override
	public void update(Aplicativo app) {
		System.out.println("FootStar informa para imprensa: ");
		System.out.println(app.getState());
	}
	
}
