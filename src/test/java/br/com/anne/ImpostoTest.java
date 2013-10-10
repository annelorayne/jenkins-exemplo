package br.com.anne;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.anne.Imposto;
import br.com.anne.Carro;

public class ImpostoTest {

	@Test
	public void testImposto() {
		Carro carro = new Carro(100.0);
		Imposto imposto = new Imposto();
		assertEquals(10.0, imposto.calcula(carro), Double.MIN_VALUE);
	}
}
