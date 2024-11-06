package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.*;

import clase.*;

class CarritoComprasTest {

	@Test
	void test() 
	{
		// Crear el carro
		CarritoCompras cc = new CarritoCompras();
		
		// Lista de productos
		List<Producto> productos = new ArrayList<>();
		//productos.clear();
		productos.add(new Producto("pr1", 240, 0.20));
		productos.add(new Producto("pr2", 200, 0.10));
		productos.add(new Producto("pr2", 125.75, 0.25));
		cc.setProductos(productos);
		
		double totalEsperado = (240*0.80) + (200*0.9) + (125.75*0.75);
		
		double precio = cc.calcularTotal();
		
		assertEquals(totalEsperado, precio);
				
				
		//fail("Not yet implemented");
	}
	
	@Test
	void test2()
	{
		fail("Not yet implemented");
	}

	@BeforeAll
	static void ejec_Inicial()
	{
		Date date = new Date();
		System.out.println("Hora de inicio:"); //+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}
	
	@AfterAll
	static void ejec_Final()
	{
		System.out.println("Saludos después de la prueba");
	}

}
