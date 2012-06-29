package ar.edu.untref.tp1;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.tp1.plomero.AnalizarColumna;
import ar.edu.untref.tp1.plomero.Material;

public class AnalizarColumnaTest {

	
	@Test
	public void quqVerifiqueLaPrimerYUltimaColumna() {
		
		AnalizarColumna m1 = new AnalizarColumna();
		
		Material[][] pared = {{Material.LADRILLO,	 	Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.CAÑO_HORIZONTAL,  Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL}};
		
		Assert.assertEquals("Valido",m1.analizarPrimerYUltimaColumna(pared));

	}
	
	@Test(expected=Error.class)
	public void queTireErrorPorTenerCañoContiguo() {
		
		AnalizarColumna m1 = new AnalizarColumna();
		
		Material[][] pared ={{Material.LADRILLO,	 	Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.CAÑO_HORIZONTAL,  Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL}};
		
		m1.analizarContiguos(pared,0);
		

	}
	
	@Test
	public void queIdentifiqueSiHayUnCañoHorizontalEnLaColumnaDos() {
		
		AnalizarColumna m1 = new AnalizarColumna();
		
		Material[][] pared ={{Material.CAÑO_HORIZONTAL,	 	Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,  Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL}};
		
		
		Assert.assertEquals("Caño Horizontal", m1.analizarColumna(pared, 2));

	}
	
	@Test
	public void queIdentifiqueSiHayUnCañoHorizontalEnLaPrimerColumna() {
		
		AnalizarColumna m1 = new AnalizarColumna();
		
		Material[][] pared ={{Material.CAÑO_HORIZONTAL,	 	Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,  Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL}};
		
		Assert.assertEquals("Caño Horizontal", m1.analizarColumna(pared, 0));

	}
	
	
	
}
