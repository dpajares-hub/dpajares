package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase.Pila;

class PilaTest 
{
	private static Pila pila;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		pila = new Pila();
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
		Integer i;
		do
		{
			i = pila.pop();
			//if (i != null) System.out.println("Sacado de la pila el número " + i);				
		}
		//while (!pila.isEmpty());
		while (i != null);
	}

	@Test
	void test1() 
	{
		// Añadimos 2 elementos a la pila
		pila.push(5);
		pila.push(10);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());
		
		// Intentar añadir elemento con valor <2
		pila.push(1);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());
	}
	
	@Test
	void test2() 
	{
		// Añadimos 2 elementos a la pila
		pila.push(5);
		pila.push(10);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());
		
		// Intentar añadir elemento con valor >20
		pila.push(21);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());	
	}

	@Test
	void test3() 
	{
		// Añadimos 2 elementos a la pila
		pila.push(5);
		pila.push(10);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());
		
		// Añade elemento a una pila con 2 elementos previos
		pila.push(12);
		
		// Revisamos el número de elementos de la pila
		assertEquals(3, pila.num_Elem());		
	}

	@Test
	void test4() 
	{
		// Revisamos el número de elementos de la pila
		assertEquals(0, pila.num_Elem());
		
		// Intentar añadir elemento con valor >20
		pila.push(21);
		
		// Revisamos el número de elementos de la pila
		assertEquals(0, pila.num_Elem());	
	}	
	
	@Test
	void test5() 
	{
		// Revisamos el número de elementos de la pila
		assertEquals(0, pila.num_Elem());
		
		// Intentar añadir elemento
		pila.push(6);
		
		// Revisamos el número de elementos de la pila
		assertEquals(1, pila.num_Elem());	
	}	

	@Test
	void test6() 
	{
		// Añadimos 2 elementos a la pila
		pila.push(5);
		pila.push(10);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());
		
		// Extrae último elemento de la pila no vacía
		assertEquals(10, pila.pop());
	}
	
	@Test
	void test7() 
	{
		// Revisamos el número de elementos de la pila
		assertEquals(0, pila.num_Elem());
		
		// Extrae último elemento de la pila vacía, es decir, devuelve null
		assertNull(pila.pop());
	}
	
	@Test
	void test8() 
	{
		// Añadimos 2 elementos a la pila
		pila.push(5);
		pila.push(10);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());
		
		//La pila no está vacía
		assertFalse(pila.isEmpty());
	}
	
	@Test
	void test9() 
	{
		// Revisamos el número de elementos de la pila
		assertEquals(0, pila.num_Elem());
		
		//La pila está vacía
		assertTrue(pila.isEmpty());
	}
	

	@Test
	void test10() 
	{
		// Añadimos 2 elementos a la pila
		pila.push(5);
		pila.push(10);
		
		// Revisamos el número de elementos de la pila
		assertEquals(2, pila.num_Elem());
	
		// Muestra (sin extraer) último elemento de la pila no vacía
		assertEquals(10, pila.top());
	}
		
	
	@Test
	void test11() 
	{
		// Revisamos el número de elementos de la pila
		assertEquals(0, pila.num_Elem());
	
		// Muestra (sin extraer) último elemento de la pila vacía, que es null
		assertNull(pila.top());
	}
		
}
