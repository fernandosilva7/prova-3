package com.absfactory;

public class Teste {

	public static void main(String[] args) {
		Bola nike = Fabricante.NIKE.criarBola();
		System.out.println("Cor: " + nike.getCor());
		System.out.println("Material: " + nike.getMaterial());
		System.out.println("Nome: " + nike.getNome());
		
		System.out.println("");
		
		Bola adidas = Fabricante.ADIDAS.criarBola();
		System.out.println("Cor: " + adidas.getCor());
		System.out.println("Material: " + adidas.getMaterial());
		System.out.println("Nome: " + adidas.getNome());
		
		System.out.println("");
		
		Bola puma = Fabricante.PUMA.criarBola();
		System.out.println("Cor: " + puma.getCor());
		System.out.println("Material: " + puma.getMaterial());
		System.out.println("Nome: " + puma.getNome());
	}

}
