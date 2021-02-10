package com.curso.ecosistema;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCalculadoraUT {

	@Test
	public void test() {
		Calculadora sut = new Calculadora();
		//Datos de prueba de entrada
		int b = 1;
		int a = 2;
		//Resultado esperado
		int resultadoEsperado = 3;
		//Ejecución de la prueba
		int resultadoObtenido = sut.suma(a, b);
		//Evaluamos
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
