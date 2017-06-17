package com.absfactory;

public enum Fabricante {
	
	NIKE {
		@Override
		public Bola criarBola() {
			return new BolaNike("Bola da Nike", "Preta", "Poliester");
		}
	}, ADIDAS {
		@Override
		public Bola criarBola() {
			return new BolaAdidas("Bola da Adidas", "Verde", "Couro Sintético");
		}
	}, PUMA {
		@Override
		public Bola criarBola() {
			return new BolaPuma("Bola da Puma", "Branca", "Couro natural");
		}
	};
	
	public abstract Bola criarBola();

}
