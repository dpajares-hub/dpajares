package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import clase.*;

class UsuarioTest 
{
	private static Usuario usr;

	@Test
	void testPerfil() 
	{
		System.out.println("Perfil actualizado");
	}

	@Test
	void testCompra() 
	{
		System.out.println("Realizando compra");
	}

	@BeforeAll
	static void beforeAll()
	{
		usr = new Usuario("nombre", "contraseña");
	}
	
	@BeforeEach
	void before()
	{
		usr.login();
	}
	
	@AfterEach
	void all()
	{
		usr.logout();		
	}
	
}
