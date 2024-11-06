package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import clase.Producto;
import clase.Tarea;

class TareasTest {

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

	@Tag("tag_1")
	@Test
	void test() 
	{
		// Lista de tareas
		List<Tarea> tareas = new ArrayList<>();
		
		// Tareas a añadir
		Tarea t1 = new Tarea("Comprar pan", false);
		Tarea t2 = new Tarea("Pagar factura", true);
		
		// Añadir las tareas y contarlas
		int numtareas = 0;		
		tareas.add(t1);
		numtareas++;
		tareas.add(t2);
		numtareas++;
		
		// Comprobar número de tareas
		assertEquals(numtareas, tareas.size());
		
		// Comprobar que tarea 1 es la del pan
		assertEquals(t1, tareas.get(0));
		
		// Comprobar que tarea 2 es la del factura
		assertEquals(t2, tareas.get(1));
//System.out.println("0");				
		// Comprobar que la primera tarea no está completada
		assertFalse(tareas.get(0).isCompletada());
//System.out.println("1");		
		// Comprobar que la segunda tarea no está completada
		assertTrue(tareas.get(1).isCompletada());
//System.out.println("2");		
		// Comprobar que intentar recuperar la tercera tarea genera un error
		assertThrows(IndexOutOfBoundsException.class, () -> tareas.get(2));
//System.out.println("fin");		
		//fail("Not yet implemented");
	}

	@Tag("tag_2")
	@Test
	void test2()
	{
		System.out.println("test2 en tag_2");
	}
	
	@Tag("tag_2")
	@Test
	void test3()
	{
		System.out.println("test3 en tag_2");
	}
	
	@Tag("tag_2")
	@Test
	void test4()
	{
		System.out.println("test4 en tag_2");
	}
	
	@Tag("prueba_dependencia")
	@Test
	void prueba_Dependencia()
	{
		System.out.println("prueba_Dependencia");
	}
}
