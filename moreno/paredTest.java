package ar.edu.untref.lp1.tp.test;
import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.lp1.tp.plomeria.Material;
import ar.edu.untref.lp1.tp.plomeria.Bob;

public class paredTest {
	
	@Test
	public void queColoqueDosCodosConUnaFilaDeDistancia(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,null,Material.LADRILLO},	
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosConDosFilasDeDistancia1menor2(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,null,Material.LADRILLO},
								   {Material.LADRILLO,null,Material.LADRILLO},	
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaYUnaColumnaDeDistanciaHastaElCa�oHorizontal1menor2(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,null,null,Material.LADRILLO},							  
							   {Material.LADRILLO,null,null,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,null,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaYDosColumnasDeDistanciaHastaElCa�oHorizontal1menor2(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,null,null,null,Material.LADRILLO},							  
							   {Material.LADRILLO,null,null,null,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,null,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,null,null,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaYTresColumnasDeDistanciaHastaElCa�oHorizontal1menor2(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,null,null,null,null,Material.LADRILLO},							  
							   {Material.LADRILLO,null,null,null,null,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,null,null,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,null,null,null,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaDeDistanciaYUnaColumnasDeDistanciaHastaElCa�oHorizontal1menor2(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,null,null,Material.LADRILLO},
							   {Material.LADRILLO,null,null,Material.LADRILLO},
							   {Material.LADRILLO,null,null,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,null,Material.LADRILLO},
								   {Material.LADRILLO,null,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,null,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosEnLaMismaColumna(){
		
		Material [][] pared = {{Material.LADRILLO,null,Material.CA�O_HORIZONTAL},
							   {Material.CA�O_HORIZONTAL,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.CA�O_HORIZONTAL},
				   				  {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaDeDistancia1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,Material.CA�O_HORIZONTAL},
				 			   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.CA�O_HORIZONTAL},
				 				  {Material.LADRILLO,null,Material.LADRILLO},
				   				  {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConDosFilasDeDistancia1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,Material.CA�O_HORIZONTAL},
				 			   {Material.LADRILLO,null,Material.LADRILLO},
				 			   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.CA�O_HORIZONTAL},
				 				  {Material.LADRILLO,null,Material.LADRILLO},
				 				  {Material.LADRILLO,null,Material.LADRILLO},
				   				  {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaColumnaDeDistanciaHastaElCa�oHorizontal1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,null,Material.CA�O_HORIZONTAL},
							   {Material.CA�O_HORIZONTAL,null,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,null,Material.CA�O_HORIZONTAL},
				 				  {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,null,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaYConUnaColumnaDeDistanciaHastaElCa�oHorizontal1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,null,Material.CA�O_HORIZONTAL},
							   {Material.LADRILLO,null,null,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,null,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,null,Material.CA�O_HORIZONTAL},
								  {Material.LADRILLO,null,null,Material.LADRILLO},
				 				  {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,null,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaYConUnaColumnaDeDistanciaHastaElCa�oHorizontal1mayor2Ladrillo(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.LADRILLO,Material.CA�O_HORIZONTAL},
								  {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				 				  {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosElPrimeroUnaFilaMasAbajoYElSegundoUltimaPosicion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
		
	@Test
	public void queColoqueDosCodosElPrimeroUnaFilaMasAbajoYElSegundoUltimaPosicionConUnaFilaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							  
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								  
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.LADRILLO,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosPrimeroUnaFilaMasAbajoYSegundoUltimaPosicionConUnaFilaDeDistanciaYUnaColumnaHastaSegundoHorizontal(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},	
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.LADRILLO,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosPrimeroDosFilasMasAbajoYSegundoUltimaPosicion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},	
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosElPrimeroFilaCeroYElSegundoSegundaFila(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosElPrimeroFilaCeroYElSegundoHastaSegundaFilaConUnaColumnaDeDistancia(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
						
		Material [][] resultado = {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.LADRILLO,Material.CA�O_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosPrimeroUnaFilasMasAbajoYSegundoAnteUltimaPosicion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},	
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUnaFilaMasAbajoYSegundoPrimerFilaUltimaColumna(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},	
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},		
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.CA�O_HORIZONTAL},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUltimaFilaYSegundoSegundaFilaUltimaColumna(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},	
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.CA�O_HORIZONTAL},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUltimaFilaYSegundoSegundaFilaUltimaColumnaUnaColumnaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},	
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.LADRILLO,Material.CA�O_HORIZONTAL},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalTercerFilaYSegundoSegundaFilaUltimaColumnaUnaColumnaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},	
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.LADRILLO,Material.CA�O_HORIZONTAL},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUltimaFilaYSegundoSegundaFilaUltimaColumnaUnaColumnaYUnaFilaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},	
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.LADRILLO,Material.CA�O_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueCuatroCodos(){
		
		Material [][] pared = {{Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL},
				   			   {Material.LADRILLO,Material.LADRILLO,Material.CA�O_HORIZONTAL,Material.LADRILLO,Material.LADRILLO}};				
			
							   			
						
		Material [][] resultado =  {{Material.CA�O_HORIZONTAL,Material.CA�O_ABAJO_IZQUIERDA,Material.LADRILLO,Material.CA�O_ABAJO_DERECHA,Material.CA�O_HORIZONTAL},
	   			   					{Material.LADRILLO,Material.CA�O_ARRIBA_DERECHA,Material.CA�O_HORIZONTAL,Material.CA�O_ARRIBA_IZQUIERDA,Material.LADRILLO}};		
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	
	


	

	
	
	
	

	
	

}
