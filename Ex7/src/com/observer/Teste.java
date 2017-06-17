package com.observer;

public class Teste {

	public static void main(String[] args) {
		
		Neymar neymar = new Neymar();
		GabrielJesus jesus = new GabrielJesus();
		
		Imprensa imprensa = new Imprensa();
		Fan fan = new Fan();
		
		neymar.acessar(imprensa);
		neymar.acessar(fan);
		jesus.acessar(imprensa);
		jesus.acessar(fan);

		
		neymar.setState("Neymar pode estar de malas prontas para china para ganhar 400 milhões por mês");
		System.out.println("");
		neymar.setState("Neymar foi visto na praia de santos jogando futevôlei");
		System.out.println("");
		jesus.setState("Gabriel Jesus briga no treino e está de saida do Manchester City");

	}

}
