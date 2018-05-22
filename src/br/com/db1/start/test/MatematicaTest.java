package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.matematica.Divisao;
import br.com.db1.start.matematica.Multiplicacao;
import br.com.db1.start.matematica.OperacaoMatematica;
import br.com.db1.start.matematica.Soma;
import br.com.db1.start.matematica.Subtracao;

public class MatematicaTest {
	
	@Test
	public void calcularTest(){
		OperacaoMatematica operacao = new Soma();
		Assert.assertTrue(32 == operacao.calcula(30d, 2d));
		
		operacao = new Subtracao();
		Assert.assertTrue(28 == operacao.calcula(30d, 2d));
		
		operacao = new Multiplicacao();
		Assert.assertTrue(60 == operacao.calcula(30d, 2d));		
		
		operacao = new Divisao();
		Assert.assertTrue(15 == operacao.calcula(30d, 2d));
	}
}
