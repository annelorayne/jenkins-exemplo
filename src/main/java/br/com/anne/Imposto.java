package br.com.anne;

public class Imposto {

	public Imposto() {
	}

	public double calcula(Carro carro) {
		System.out.println("teste");
		return carro.getValor() * 0.1;
	}

}