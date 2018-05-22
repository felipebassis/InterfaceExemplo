package br.com.db1.start.matematica;

public class Multiplicacao implements OperacaoMatematica{

	@Override
	public Double calcula(Double valor1, Double valor2) {
		return valor1 * valor2;
	}

}
