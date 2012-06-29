package ar.edu.untref.lp1.plomeria.grupoN;

import ar.edu.untref.lp1.plomeria.Material;
import ar.edu.untref.lp1.plomeria.Plomero;

/**
 * @authors PABLO MATÍAS MARIANI , KEVIN RECKE , FRANCISCO GROSSO , NICOLAS PACHECO
 *
 */
public class ConstructorTuberias implements Plomero {

	/**
	 * construye cañeria hacia arriba
	 * @param pared contiene la matriz de ladrillos
	 * @param posicion guarda la posicion desde donde construir hacia arriba
	 * @param desplazamientoVertical guarda la cantidad de caños que iran hacia arriba
	 */
	private void hacerCaminoHaciaArriba ( Material [][] pared , Posicion posicionCaño , int desplazamientoVertical ){
		
		for (int i = 1 ; i < desplazamientoVertical ; i++){
			pared[posicionCaño.getFila() - 1 ][posicionCaño.getColumna()] = Material.CAÑO_VERTICAL; 
			posicionCaño.setFila( posicionCaño.getFila() - 1 );//almaceno posicion ultimo caño colocado
		
		}
	} //fin metodo
	
	/**
	 * construye cañeria hacia abajo
	 * @param pared contiene la matriz de ladrillos
	 * @param posicion guarda la posicion desde donde construir hacia abajo
	 * @param desplazamientoVertical guarda la cantidad de caños que iran hacia abajo
	 */
	private void hacerCaminoHaciaAbajo ( Material [][] pared , Posicion posicionCaño , int desplazamientoVertical ){
	
		for (int i = 1 ; i < -desplazamientoVertical ; i++){
			pared[posicionCaño.getFila() + 1][posicionCaño.getColumna()] = Material.CAÑO_VERTICAL;
			posicionCaño.setFila( posicionCaño.getFila() + 1 ); //almaceno posicion ultimo caño colocado
		}
		
	} //fin metodo
	
	/**
	 * busca la posicion al caño horizontal mas cercano
	 * @param posicion almacena la posicion del caño horizontal
	 * @param pared contiene la matriz de ladrillos
	 * @return la posicion en forma { fila , columna } del caño mas cercano
	 */
	private Posicion buscarCañoHorizontalEnPared ( Posicion posicion , Material [][] pared ){
		
		int columnaBuscar = posicion.getColumna() + 1;   
		
		Posicion posicionSegundoCaño = new Posicion();
			
		boolean cañoEncontrado = false;
		
		while( !cañoEncontrado ){        //busco el caño hasta encontrarlo ( se que sí o sí hay uno)
			columnaBuscar ++;
			for (int i = 0; i < pared.length ; i++){
				if (pared[i][columnaBuscar] == Material.CAÑO_HORIZONTAL){
					cañoEncontrado = true;
					posicionSegundoCaño.setFila(i);
					posicionSegundoCaño.setColumna(columnaBuscar); // Aca se encuentra la posicion del caño horizontal que esta mas a la derecha.
					break;
				}
			} 
		}
		return posicionSegundoCaño;        //devuelvo posicion del ultimo caño
	} //fin metodo
	
	/**
	 * construye la cañeria desde el caño de la <b>posicionCaño</b> hasta el caño siguente que esta arriba
	 * @param pared contiene la matriz de ladrillos
	 * @param posicionCaño contiene la posicion del caño desde donde se comienza a construir
	 * @param desplazamientoVertical contiene la cantidad de caños que iran verticalmente
	 * @param desplazamientoHorizontal contiene la cantidad de caños que iran horizontalmente
	 */
	private void hacerCaminoAlCañoQueEstaArriba ( Material [][] pared ,Posicion posicionCaño , int desplazamientoVertical , int desplazamientoHorizontal ){
		
		pared [ posicionCaño.getFila() ][posicionCaño.getColumna() + 1 ] = Material.CAÑO_ABAJO_DERECHA;       //construyo tubería en la curva
		posicionCaño.setColumna ( posicionCaño.getColumna() + 1 );                    //guardo posicion ultimo caño
		
		this.hacerCaminoHaciaArriba(pared, posicionCaño, desplazamientoVertical);        //hago camino hasta la proxima curva
		
		pared [ posicionCaño.getFila() - 1 ][posicionCaño.getColumna() ] = Material.CAÑO_ARRIBA_IZQUIERDA;  //construyo tubería en la curva
		posicionCaño.setFila(posicionCaño.getFila() - 1);                                                 //guardo posicion ultimo caño
		
		this.hacerCaminoAlCañoQueEstaEnfrente(pared, posicionCaño, desplazamientoHorizontal);         //hago camino hasta el caño horizontal
		
	} //fin metodo
	
	
	/**
	 * construye la cañeria desde el caño de la <b>posicionCaño</b> hasta el caño siguente que esta en el mismo nivel
	 * @param pared contiene la matriz de ladrillos
	 * @param posicionCaño contiene la posicion del caño desde donde se comienza a construir
	 * @param desplazamientoHorizontal contiene la cantidad de caños que iran horizontalmente
	 */
	private void hacerCaminoAlCañoQueEstaEnfrente ( Material [][] pared , Posicion posicionCaño , int desplazamientoHorizontal){
		
		for (int i = 1 ; i < desplazamientoHorizontal ; i++){
			pared[posicionCaño.getFila()][posicionCaño.getColumna()+ 1] = Material.CAÑO_HORIZONTAL; 
			posicionCaño.setColumna( posicionCaño.getColumna() + 1 );                              //guardo posicion ultimo caño
		}
		
	} //fin metodo
	
	
	/**
	 * construye la cañeria desde el caño de la <b>posicionCaño</b> hasta el caño horizontal siguente que esta debajo
	 * @param pared contiene la matriz de ladrillos
	 * @param posicionCaño contiene la posicion del caño desde donde se comienza a construir
	 * @param desplazamientoVertical contiene la cantidad de caños que iran verticalmente
	 * @param DesplazamientoHorizontal contiene la cantidad de caños que iran horizontalmente
	 */
	private void hacerCaminoAlCañoQueEstaAbajo ( Material [][] pared , Posicion posicionCaño , int desplazamientoVertical , int desplazamientoHorizontal){
		
		pared [ posicionCaño.getFila() ][posicionCaño.getColumna() + 1 ] = Material.CAÑO_ARRIBA_DERECHA; //construyo tubería en la curva
		posicionCaño.setColumna ( posicionCaño.getColumna() + 1 );								//guardo posicion ultimo caño
		
		this.hacerCaminoHaciaAbajo(pared, posicionCaño, desplazamientoVertical);               //hago tuberia hasta la proxima curva
		 
		pared [ posicionCaño.getFila() + 1 ][posicionCaño.getColumna() ] = Material.CAÑO_ABAJO_IZQUIERDA;     //construyo tubería en la curva
		posicionCaño.setFila ( posicionCaño.getFila() + 1 );      								//guardo posicion ultimo caño
		
		this.hacerCaminoAlCañoQueEstaEnfrente(pared, posicionCaño, desplazamientoHorizontal);    //construyo tubería hasta el proximo caño horizontal
		
	}  //fin metodo
	
	
	/**
	 * //decide que camino construir dependiendo la posicion del caño horizontal mas cercano
	 * @param pared almacena la matriz pared
	 * @param posicionPrimerCaño guarda posicion del caño horizontal desde donde se construye
	 * @param desplazamientoVertical indica si el caño horizontal a llegar esta arriba o abajo y la distancia vertical
	 * @param desplazamientoHorizontal indica a que distancia horizontal esta el caño horizontal a llegar con respecto al caño desde el cual se parte
	 */
	private void decidirCaminoAConstruir(Material[][] pared, Posicion posicionPrimerCaño, int desplazamientoVertical,int desplazamientoHorizontal) {
		if ( desplazamientoVertical > 0 ){
			this.hacerCaminoAlCañoQueEstaArriba( pared , posicionPrimerCaño , desplazamientoVertical , desplazamientoHorizontal );
		} else{
			if ( desplazamientoVertical == 0 ){
				this.hacerCaminoAlCañoQueEstaEnfrente( pared , posicionPrimerCaño , desplazamientoHorizontal );
			} else {
				this.hacerCaminoAlCañoQueEstaAbajo( pared , posicionPrimerCaño , desplazamientoVertical , desplazamientoHorizontal );
			}
		}
	} //fin metodo
	
	
	/**
	 * construye la cañeria dentro de la pared
	 * @pared contiene la matriz de ladrillos que conforman la pared
	 */
    @Override
    public Material [][] construirCañeria(Material[][] pared) {
    	
    	Posicion posicionPrimerCaño = new Posicion() ;
    	
    	posicionPrimerCaño.setColumna ( -2 );
    	posicionPrimerCaño.setFila (0);
    	
    	int desplazamientoVertical = 0;  //marcan distancia del primer caño al segundo caño en filas y columnas respectivamente
    	int desplazamientoHorizontal = 0 ;
    	
    	Posicion posicionSegundoCaño = new Posicion () ;   
    	
    	posicionPrimerCaño = this.buscarCañoHorizontalEnPared( posicionPrimerCaño , pared );
    	
    	while (  !(pared.length - 1 == posicionSegundoCaño.getColumna ()) ){     //se termina cuando se llego al ultimo caño
    		
    		posicionSegundoCaño = this.buscarCañoHorizontalEnPared( posicionPrimerCaño, pared );
    		
    		desplazamientoVertical = posicionPrimerCaño.getFila() - posicionSegundoCaño.getFila();   //calculo distancias entre caños
    		desplazamientoHorizontal = posicionSegundoCaño.getColumna() - posicionPrimerCaño.getColumna();
    		
    		//construyo tuberia hasta el caño horizontal siguiente (el que esta en posicionSegundoCaño
    		
    		this.decidirCaminoAConstruir ( pared , posicionPrimerCaño , desplazamientoVertical , desplazamientoHorizontal);
    		
    		posicionPrimerCaño = posicionSegundoCaño;
    	}//fin while
    	
        return pared;
    	
    } //fin metodo

}//fin clase