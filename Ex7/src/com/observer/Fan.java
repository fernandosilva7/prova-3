package com.observer;

public class Fan implements Transmissor{

	@Override
	public void update(Aplicativo app) {
		System.out.println("FootStar informa para os f�s: ");
		System.out.println(app.getState());
	}
	
}
