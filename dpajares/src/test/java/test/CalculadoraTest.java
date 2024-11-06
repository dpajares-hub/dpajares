package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import clase.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
	}

	@BeforeEach
	void setUp() throws Exception 
	{
	}

	@AfterEach
	void tearDown() throws Exception 
	{
	}

	@ParameterizedTest
	@CsvSource({"0,1", "1,1", "2,2", "5,120", "10,3628800"})
	void test(int numero, int resultado) 
	{
		Calculadora calculadora = new Calculadora();
		long factorial = calculadora.factorial(numero);
		assertEquals(factorial, resultado);
		
	}
	
	@RepeatedTest(5)
	void test2(RepetitionInfo repetitionInfo)
	{
		int repeticionActual = repetitionInfo.getCurrentRepetition();
		System.out.println(repeticionActual);
	}

}
