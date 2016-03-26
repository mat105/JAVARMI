import static org.junit.Assert.*;

import org.junit.Test;


public class test_cliente {

	@Test
	public void testGetClima() {
		Contactador contac = new Contactador();
		
		assertNotNull(contac.getClima(524901)); // Obtengo clima?
		//fail("Not yet implemented");
	}
	
	@Test
	public void testGetListado() {
		new Ciudad(0, "abc");
		new Ciudad(1, "cba");
		new Ciudad(2, "aaa");
		new Ciudad(3, "poa");
		
		assertEquals(Ciudad.getListado().size(),  4); // Agrega?
		assertEquals(Ciudad.buscar(0).nombre, "aaa"); // Listado ordenado?
	}
	
	
	@Test
	public void testCliente() throws Exception {
		// Necesita al servidor corriendo.
		Cliente abc = new Cliente();
		
		abc.sf.agregar(524901, "Buenos Aires");
		
		assertNotNull( abc.sf.getClima(524901) );
		
	}

}
