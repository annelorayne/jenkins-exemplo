package br.com.anne;

public class Carro {

	private double valor;
	private String nome;
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
