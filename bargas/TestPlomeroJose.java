package ar.edu.untref.lp1.plomeria.grupoN;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.lp1.plomeria.Material;

public class TestPlomeroJose {

	@Test
	public void testCrearPlomero() {
		PlomeroJose p = new PlomeroJose();

		Assert.assertNotNull(p);
	}
	@Test
	public void testCrearCañeriaHaciaAbajo(){
		PlomeroJose p = new PlomeroJose();
		Material[][] pared= {{Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
				             {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};
		p.construirCañeria(pared);
		Material[][] paredResultante={{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO},
	                            {Material.LADRILLO,Material.CAÑO_VERTICAL,Material.LADRILLO},
	                            {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL}};
		
		Assert.assertArrayEquals(paredResultante, p.getPared());	
	}
	@Test
	public void testCrearCañeriaHaciaArriba(){
		PlomeroJose p = new PlomeroJose();
		Material[][] pared= {{Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
				             {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO}};
		p.construirCañeria(pared);
		Material[][] paredResultante={{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.CAÑO_HORIZONTAL},
	                            {Material.LADRILLO,Material.CAÑO_VERTICAL,Material.LADRILLO},
	                            {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO}};
		
		Assert.assertArrayEquals(paredResultante, p.getPared());	
	}
	@Test
	public void testCrearCañeriaHaciaHorizontal(){
		PlomeroJose p = new PlomeroJose();
		Material[][] pared= {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};
		p.construirCañeria(pared);
		Material[][] paredResultante={{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
	                            {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
	                            {Material.CAÑO_HORIZONTAL,Material.CAÑO_HORIZONTAL,Material.CAÑO_HORIZONTAL}};
		
		Assert.assertArrayEquals(paredResultante, p.getPared());	
	}
	@Test(expected = Error.class)
	public void testQueTireErrorSiNoHayCañoEnLaPrimeraColumna() {
		PlomeroJose p = new PlomeroJose();
		Material[][] pared = {{Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL },
				              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
				              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
				              {Material.LADRILLO, Material.CAÑO_HORIZONTAL,Material.LADRILLO}};

		p.construirCañeria(pared);
	}

	@Test(expected = Error.class)
	public void testQueTireErrorSiNoHayCañoEnLaUltimaColumna() {
		PlomeroJose p = new PlomeroJose();
		Material[][] pared = {{Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO},
	                          {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
	                          {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
	                          {Material.LADRILLO, Material.CAÑO_HORIZONTAL,Material.LADRILLO}};

		p.construirCañeria(pared);
	}

	@Test(expected = Error.class)
	public void testQueTireErrorSiHayCañosContiguosAlRecibirLaMatriz() {
		PlomeroJose p = new PlomeroJose();
		Material[][] pared = {{Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL, Material.LADRILLO},
                              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
                              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
                              {Material.LADRILLO, Material.LADRILLO,Material.CAÑO_HORIZONTAL}};
		p.construirCañeria(pared);
	}
	
	
	

}
