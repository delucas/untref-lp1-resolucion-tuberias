import junit.framework.Assert;

import org.junit.Test;

public class LuigiTest {

	private int ancho;


	@Test
	public void test0(){
		Material[][] miPared = new Material [9][9];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.LADRILLO, miPared [0][0]);
		Assert.assertEquals(Material.LADRILLO, miPared [1][6]);
		Assert.assertEquals(Material.LADRILLO, miPared [2][3]);
		Assert.assertEquals(Material.LADRILLO, miPared [3][8]);
		Assert.assertEquals(Material.LADRILLO, miPared [4][7]);
		Assert.assertEquals(Material.LADRILLO, miPared [5][1]);
		Assert.assertEquals(Material.LADRILLO, miPared [6][4]);
		Assert.assertEquals(Material.LADRILLO, miPared [7][2]);
	}
	@Test
	public void test1(){
		Material[][] miPared = new Material [9][9];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		miPared [0][4] = Material.CAÑO_HORIZONTAL;
		miPared [8][4]= Material.CAÑO_HORIZONTAL;
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [0][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [1][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [2][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [3][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [4][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [5][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [6][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [7][4]);
		
		}
	
	@Test
	public void test2(){
		Material[][] miPared = new Material [9][9];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		miPared [0][1] = Material.CAÑO_HORIZONTAL;
		miPared [8][7]= Material.CAÑO_HORIZONTAL;
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.CAÑO_ARRIBA_IZQUIERDA, miPared [1][1]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][2]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][3]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][4]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][5]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][6]);
		Assert.assertEquals(Material.CAÑO_ABAJO_DERECHA, miPared [1][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [2][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [3][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [4][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [5][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [6][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [7][7]);
		
		
		}
	@Test
	public void test3(){
		Material[][] miPared = new Material [9][9];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		miPared [0][1] = Material.CAÑO_HORIZONTAL;
		miPared [8][7] = Material.CAÑO_HORIZONTAL;
		miPared [4][4] = Material.CAÑO_HORIZONTAL;
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.CAÑO_ARRIBA_IZQUIERDA, miPared [1][1]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][2]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][3]);
		Assert.assertEquals(Material.CAÑO_ABAJO_DERECHA, miPared [1][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [2][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [3][4]);
		Assert.assertEquals(Material.CAÑO_ARRIBA_IZQUIERDA, miPared [5][4]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [5][5]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [5][6]);
		Assert.assertEquals(Material.CAÑO_ABAJO_DERECHA, miPared [5][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [6][7]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [7][7]);
		}
	@Test
	public void test4(){
		Material[][] miPared = new Material [9][9];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		miPared [0][8] = Material.CAÑO_HORIZONTAL;
		miPared [4][4] = Material.CAÑO_HORIZONTAL;
		miPared [8][0] = Material.CAÑO_HORIZONTAL;
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.CAÑO_ABAJO_IZQUIERDA, miPared [1][8]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][7]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][6]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [1][5]);
		Assert.assertEquals(Material.CAÑO_ARRIBA_DERECHA, miPared [1][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [2][4]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [3][4]);
		Assert.assertEquals(Material.CAÑO_ABAJO_IZQUIERDA, miPared [5][4]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [5][3]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [5][2]);
		Assert.assertEquals(Material.CAÑO_VERTICAL, miPared [5][1]);
		Assert.assertEquals(Material.CAÑO_ARRIBA_DERECHA, miPared [5][0]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [6][0]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [7][0]);
		}
	
	@Test
	public void test5(){
		Material[][] miPared = new Material [9][9];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		miPared [0][8] = Material.CAÑO_HORIZONTAL;
		miPared [2][0] = Material.CAÑO_HORIZONTAL;
		miPared [4][0] = Material.CAÑO_HORIZONTAL;
		miPared [6][8] = Material.CAÑO_HORIZONTAL;
		miPared [8][0] = Material.CAÑO_HORIZONTAL;
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.CAÑO_ABAJO_IZQUIERDA, miPared [1][8]);
		Assert.assertEquals(Material.CAÑO_ARRIBA_DERECHA, miPared [1][0]);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [3][0]);
		Assert.assertEquals(Material.CAÑO_ARRIBA_IZQUIERDA, miPared [5][0]);
		Assert.assertEquals(Material.CAÑO_ABAJO_DERECHA, miPared [5][8]);
		Assert.assertEquals(Material.CAÑO_ABAJO_IZQUIERDA, miPared [7][8]);
		Assert.assertEquals(Material.CAÑO_ARRIBA_DERECHA, miPared [7][0]);
		}
	
	@Test
	public void test6(){
		Material[][] miPared = new Material [3][1];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		miPared[0][0] = Material.CAÑO_HORIZONTAL;
		miPared[2][0] = Material.CAÑO_HORIZONTAL;
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.CAÑO_HORIZONTAL, miPared [1][0]);
	}
	
	
	// **** ADVERTENCIA: EL PROXIMO TEST ES ABSOLUTAMENTE EXPERIMENTAL, NO TENER EN CUENTA SU POSIBLE FUNCIONAMIENTO ****
	// **** ADVERTENCIA: EL PROXIMO TEST ES ABSOLUTAMENTE EXPERIMENTAL, NO TENER EN CUENTA SU POSIBLE FUNCIONAMIENTO ****
	// **** ADVERTENCIA: EL PROXIMO TEST ES ABSOLUTAMENTE EXPERIMENTAL, NO TENER EN CUENTA SU POSIBLE FUNCIONAMIENTO ****
	// **** ADVERTENCIA: EL PROXIMO TEST ES ABSOLUTAMENTE EXPERIMENTAL, NO TENER EN CUENTA SU POSIBLE FUNCIONAMIENTO ****
	
	@Test
	public void test7(){
		Material[][] miPared = new Material [3][2];
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		
		miPared[0][0] = Material.CAÑO_HORIZONTAL;
		miPared[2][1] = Material.CAÑO_HORIZONTAL;
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals(Material.CAÑO_ARRIBA_IZQUIERDA, miPared [1][0]);
		Assert.assertEquals(Material.CAÑO_ABAJO_DERECHA, miPared [1][1]);
	}
	
	@Test
	public void testAleatorio100Veces(){
		int ancho = (int) (Math.random()*100)+1;
		int largo = (int) (Math.random()*100)+1;
		Material[][] miPared = new Material [ancho][largo];
		
		for (int i = 0; i<miPared.length; i++){
			for (int j =0; j< miPared [i].length; j++){
			miPared[i][j]= Material.LADRILLO;
			}
		}
		for(int x = 0; x < this.ancho; x = x + (int)((Math.random()*5)+1)){
			miPared [x][(int)(Math.random()*largo+1)] = Material.CAÑO_HORIZONTAL;	
		}
		
		Luigi miPlomero = new Luigi();
		miPlomero.construirCañeria(miPared);
		
		for (int columna = 0; columna < miPared.length; columna++){
			for (int fila = 0; fila < miPared[columna].length; fila++){
				if (miPared[columna][fila] == Material.CAÑO_HORIZONTAL){
					boolean izquierda = false;
					boolean derecha = false;
					if (miPared[columna-1][fila] != Material.LADRILLO){
						izquierda = true;
					}
					if (miPared[columna+1][fila] != Material.LADRILLO){
						derecha  = true;
					}
					
					Assert.assertEquals(true, izquierda);
					Assert.assertEquals(true, derecha);
				}
			}
		}	
	}	
	// *************************************************************************************************************
	// *************************************************************************************************************
	// *************************************************************************************************************
	// *************************************************************************************************************
}
