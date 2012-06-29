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
	public void testCrearCa�eriaHaciaAbajo(){
		PlomeroJose p = new PlomeroJose();
		Material[][] pared= {{Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
				             {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL}};
		p.construirCa�eria(pared);
		Material[][] paredResultante={{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO},
	                            {Material.LADRILLO,Material.CA�O_VERTICAL,Material.LADRILLO},
	                            {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL}};
		
		Assert.assertArrayEquals(paredResultante, p.getPared());	
	}
	@Test
	public void testCrearCa�eriaHaciaArriba(){
		PlomeroJose p = new PlomeroJose();
		Material[][] pared= {{Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},
				             {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO}};
		p.construirCa�eria(pared);
		Material[][] paredResultante={{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.CA�O_HORIZONTAL},
	                            {Material.LADRILLO,Material.CA�O_VERTICAL,Material.LADRILLO},
	                            {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO}};
		
		Assert.assertArrayEquals(paredResultante, p.getPared());	
	}
	@Test
	public void testCrearCa�eriaHaciaHorizontal(){
		PlomeroJose p = new PlomeroJose();
		Material[][] pared= {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				             {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.CA�O_HORIZONTAL}};
		p.construirCa�eria(pared);
		Material[][] paredResultante={{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
	                            {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
	                            {Material.CA�O_HORIZONTAL,Material.CA�O_HORIZONTAL,Material.CA�O_HORIZONTAL}};
		
		Assert.assertArrayEquals(paredResultante, p.getPared());	
	}
	@Test(expected = Error.class)
	public void testQueTireErrorSiNoHayCa�oEnLaPrimeraColumna() {
		PlomeroJose p = new PlomeroJose();
		Material[][] pared = {{Material.LADRILLO, Material.LADRILLO, Material.CA�O_HORIZONTAL },
				              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
				              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
				              {Material.LADRILLO, Material.CA�O_HORIZONTAL,Material.LADRILLO}};

		p.construirCa�eria(pared);
	}

	@Test(expected = Error.class)
	public void testQueTireErrorSiNoHayCa�oEnLaUltimaColumna() {
		PlomeroJose p = new PlomeroJose();
		Material[][] pared = {{Material.CA�O_HORIZONTAL, Material.LADRILLO, Material.LADRILLO},
	                          {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
	                          {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
	                          {Material.LADRILLO, Material.CA�O_HORIZONTAL,Material.LADRILLO}};

		p.construirCa�eria(pared);
	}

	@Test(expected = Error.class)
	public void testQueTireErrorSiHayCa�osContiguosAlRecibirLaMatriz() {
		PlomeroJose p = new PlomeroJose();
		Material[][] pared = {{Material.CA�O_HORIZONTAL, Material.CA�O_HORIZONTAL, Material.LADRILLO},
                              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
                              {Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
                              {Material.LADRILLO, Material.LADRILLO,Material.CA�O_HORIZONTAL}};
		p.construirCa�eria(pared);
	}
	
	
	

}
