package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GimnasioTest {
	
	@Test
	public void consultoElNombreDeGimnasio() {
		
		Gimnasio gimnasioEclipse = new Gimnasio();
		gimnasioEclipse.setNombre("Eclipse Gym");
		
		String nombreDelGimnasioObt = gimnasioEclipse.getNombre();
		
		String nombreDelGimnasioEspe = "Eclipse Gym";
		
		assertEquals(nombreDelGimnasioEspe, nombreDelGimnasioObt);
		
	}
	
	
}
