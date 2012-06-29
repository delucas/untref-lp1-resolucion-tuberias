package ar.edu.untref.tp1;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.tp1.plomeria.grupoN.Ernesto;
import ar.edu.untref.tp1.plomero.Material;

public class ErnestoTest {

	@Test
	public void añadirCaños() {
		
		
		Material[][] pared ={{Material.CAÑO_HORIZONTAL,	 	Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,  Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL}};
		
		
		Material[][] pared2 ={{Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_DERECHA, 	Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.CAÑO_VERTICAL, 		Material.LADRILLO,		 Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.CAÑO_ABAJO_IZQUIERDA, Material.CAÑO_HORIZONTAL, Material.CAÑO_ARRIBA_DERECHA, Material.LADRILLO},
							{Material.LADRILLO,  		Material.LADRILLO, 				Material.LADRILLO, 		Material.CAÑO_ABAJO_IZQUIERDA, Material.CAÑO_HORIZONTAL}};
		

		Ernesto e = new Ernesto();
		e.construirCañeria(pared);
		
		Assert.assertArrayEquals(pared2, pared);
		

	}
	
}
