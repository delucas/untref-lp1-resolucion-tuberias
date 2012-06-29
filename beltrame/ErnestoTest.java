package ar.edu.untref.tp1;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.tp1.plomeria.grupoN.Ernesto;
import ar.edu.untref.tp1.plomero.Material;

public class ErnestoTest {

	@Test
	public void a�adirCa�os() {
		
		
		Material[][] pared ={{Material.CA�O_HORIZONTAL,	 	Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.LADRILLO, Material.CA�O_HORIZONTAL, Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,  Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.CA�O_HORIZONTAL}};
		
		
		Material[][] pared2 ={{Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_DERECHA, 	Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO,			Material.CA�O_VERTICAL, 		Material.LADRILLO,		 Material.LADRILLO, Material.LADRILLO},
							{Material.LADRILLO, 		Material.CA�O_ABAJO_IZQUIERDA, Material.CA�O_HORIZONTAL, Material.CA�O_ARRIBA_DERECHA, Material.LADRILLO},
							{Material.LADRILLO,  		Material.LADRILLO, 				Material.LADRILLO, 		Material.CA�O_ABAJO_IZQUIERDA, Material.CA�O_HORIZONTAL}};
		

		Ernesto e = new Ernesto();
		e.construirCa�eria(pared);
		
		Assert.assertArrayEquals(pared2, pared);
		

	}
	
}
