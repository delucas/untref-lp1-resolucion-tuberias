package ar.edu.untref.lp1.tp.test;
import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.lp1.tp.plomeria.Material;
import ar.edu.untref.lp1.tp.plomeria.Bob;

public class paredTest {
	
	@Test
	public void queColoqueDosCodosConUnaFilaDeDistancia(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,null,Material.LADRILLO},	
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosConDosFilasDeDistancia1menor2(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.LADRILLO,null,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,null,Material.LADRILLO},
								   {Material.LADRILLO,null,Material.LADRILLO},	
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaYUnaColumnaDeDistanciaHastaElCañoHorizontal1menor2(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,null,null,Material.LADRILLO},							  
							   {Material.LADRILLO,null,null,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,null,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaYDosColumnasDeDistanciaHastaElCañoHorizontal1menor2(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,null,null,null,Material.LADRILLO},							  
							   {Material.LADRILLO,null,null,null,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,null,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,null,null,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaYTresColumnasDeDistanciaHastaElCañoHorizontal1menor2(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,null,null,null,null,Material.LADRILLO},							  
							   {Material.LADRILLO,null,null,null,null,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,null,null,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,null,null,null,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaDeDistanciaYUnaColumnasDeDistanciaHastaElCañoHorizontal1menor2(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,null,null,Material.LADRILLO},
							   {Material.LADRILLO,null,null,Material.LADRILLO},
							   {Material.LADRILLO,null,null,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,null,Material.LADRILLO},
								   {Material.LADRILLO,null,null,Material.LADRILLO},
								  {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,null,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosEnLaMismaColumna(){
		
		Material [][] pared = {{Material.LADRILLO,null,Material.CAÑO_HORIZONTAL},
							   {Material.CAÑO_HORIZONTAL,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.CAÑO_HORIZONTAL},
				   				  {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaDeDistancia1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,Material.CAÑO_HORIZONTAL},
				 			   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.CAÑO_HORIZONTAL},
				 				  {Material.LADRILLO,null,Material.LADRILLO},
				   				  {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConDosFilasDeDistancia1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,Material.CAÑO_HORIZONTAL},
				 			   {Material.LADRILLO,null,Material.LADRILLO},
				 			   {Material.LADRILLO,null,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.CAÑO_HORIZONTAL},
				 				  {Material.LADRILLO,null,Material.LADRILLO},
				 				  {Material.LADRILLO,null,Material.LADRILLO},
				   				  {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaColumnaDeDistanciaHastaElCañoHorizontal1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,null,Material.CAÑO_HORIZONTAL},
							   {Material.CAÑO_HORIZONTAL,null,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,null,Material.CAÑO_HORIZONTAL},
				 				  {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,null,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaYConUnaColumnaDeDistanciaHastaElCañoHorizontal1mayor2(){
		
		Material [][] pared = {{Material.LADRILLO,null,null,Material.CAÑO_HORIZONTAL},
							   {Material.LADRILLO,null,null,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,null,null,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,null,Material.CAÑO_HORIZONTAL},
								  {Material.LADRILLO,null,null,Material.LADRILLO},
				 				  {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,null,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosEnLaMismaColumnaConUnaFilaYConUnaColumnaDeDistanciaHastaElCañoHorizontal1mayor2Ladrillo(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};				
						
		Material [][] resultado ={{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
								  {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
				 				  {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO}};	
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosElPrimeroUnaFilaMasAbajoYElSegundoUltimaPosicion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
		
	@Test
	public void queColoqueDosCodosElPrimeroUnaFilaMasAbajoYElSegundoUltimaPosicionConUnaFilaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							  
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								  
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosPrimeroUnaFilaMasAbajoYSegundoUltimaPosicionConUnaFilaDeDistanciaYUnaColumnaHastaSegundoHorizontal(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},	
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosPrimeroDosFilasMasAbajoYSegundoUltimaPosicion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL}};				
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},	
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosElPrimeroFilaCeroYElSegundoSegundaFila(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosElPrimeroFilaCeroYElSegundoHastaSegundaFilaConUnaColumnaDeDistancia(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
						
		Material [][] resultado = {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueDosCodosPrimeroUnaFilasMasAbajoYSegundoAnteUltimaPosicion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},	
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUnaFilaMasAbajoYSegundoPrimerFilaUltimaColumna(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},	
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO},		
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.CAÑO_HORIZONTAL},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
				
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUltimaFilaYSegundoSegundaFilaUltimaColumna(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},	
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.CAÑO_HORIZONTAL},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUltimaFilaYSegundoSegundaFilaUltimaColumnaUnaColumnaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},	
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalTercerFilaYSegundoSegundaFilaUltimaColumnaUnaColumnaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},	
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	@Test
	public void queColoqueDosCodosPrimerHorizontalUltimaFilaYSegundoSegundaFilaUltimaColumnaUnaColumnaYUnaFilaDeSeparacion(){
		
		Material [][] pared = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},	
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
							   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
							   			
						
		Material [][] resultado = {{Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO},
								   {Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO,Material.LADRILLO},
								   {Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO}};
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	@Test
	public void queColoqueCuatroCodos(){
		
		Material [][] pared = {{Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL},
				   			   {Material.LADRILLO,Material.LADRILLO,Material.CAÑO_HORIZONTAL,Material.LADRILLO,Material.LADRILLO}};				
			
							   			
						
		Material [][] resultado =  {{Material.CAÑO_HORIZONTAL,Material.CAÑO_ABAJO_IZQUIERDA,Material.LADRILLO,Material.CAÑO_ABAJO_DERECHA,Material.CAÑO_HORIZONTAL},
	   			   					{Material.LADRILLO,Material.CAÑO_ARRIBA_DERECHA,Material.CAÑO_HORIZONTAL,Material.CAÑO_ARRIBA_IZQUIERDA,Material.LADRILLO}};		
		
		Bob bob = new Bob();
		
		Assert.assertArrayEquals(resultado,bob.construirCodos(pared));
		
	}
	
	
	


	

	
	
	
	

	
	

}
