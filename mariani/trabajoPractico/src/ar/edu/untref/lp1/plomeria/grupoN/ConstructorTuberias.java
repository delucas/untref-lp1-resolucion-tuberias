package ar.edu.untref.lp1.plomeria.grupoN;

import ar.edu.untref.lp1.plomeria.Material;
import ar.edu.untref.lp1.plomeria.Plomero;

/**
 * @authors PABLO MAT�AS MARIANI , KEVIN RECKE , FRANCISCO GROSSO , NICOLAS PACHECO
 *
 */
public class ConstructorTuberias implements Plomero {

	/**
	 * construye ca�eria hacia arriba
	 * @param pared contiene la matriz de ladrillos
	 * @param posicion guarda la posicion desde donde construir hacia arriba
	 * @param desplazamientoVertical guarda la cantidad de ca�os que iran hacia arriba
	 */
	private void hacerCaminoHaciaArriba ( Material [][] pared , Posicion posicionCa�o , int desplazamientoVertical ){
		
		for (int i = 1 ; i < desplazamientoVertical ; i++){
			pared[posicionCa�o.getFila() - 1 ][posicionCa�o.getColumna()] = Material.CA�O_VERTICAL; 
			posicionCa�o.setFila( posicionCa�o.getFila() - 1 );//almaceno posicion ultimo ca�o colocado
		
		}
	} //fin metodo
	
	/**
	 * construye ca�eria hacia abajo
	 * @param pared contiene la matriz de ladrillos
	 * @param posicion guarda la posicion desde donde construir hacia abajo
	 * @param desplazamientoVertical guarda la cantidad de ca�os que iran hacia abajo
	 */
	private void hacerCaminoHaciaAbajo ( Material [][] pared , Posicion posicionCa�o , int desplazamientoVertical ){
	
		for (int i = 1 ; i < -desplazamientoVertical ; i++){
			pared[posicionCa�o.getFila() + 1][posicionCa�o.getColumna()] = Material.CA�O_VERTICAL;
			posicionCa�o.setFila( posicionCa�o.getFila() + 1 ); //almaceno posicion ultimo ca�o colocado
		}
		
	} //fin metodo
	
	/**
	 * busca la posicion al ca�o horizontal mas cercano
	 * @param posicion almacena la posicion del ca�o horizontal
	 * @param pared contiene la matriz de ladrillos
	 * @return la posicion en forma { fila , columna } del ca�o mas cercano
	 */
	private Posicion buscarCa�oHorizontalEnPared ( Posicion posicion , Material [][] pared ){
		
		int columnaBuscar = posicion.getColumna() + 1;   
		
		Posicion posicionSegundoCa�o = new Posicion();
			
		boolean ca�oEncontrado = false;
		
		while( !ca�oEncontrado ){        //busco el ca�o hasta encontrarlo ( se que s� o s� hay uno)
			columnaBuscar ++;
			for (int i = 0; i < pared.length ; i++){
				if (pared[i][columnaBuscar] == Material.CA�O_HORIZONTAL){
					ca�oEncontrado = true;
					posicionSegundoCa�o.setFila(i);
					posicionSegundoCa�o.setColumna(columnaBuscar); // Aca se encuentra la posicion del ca�o horizontal que esta mas a la derecha.
					break;
				}
			} 
		}
		return posicionSegundoCa�o;        //devuelvo posicion del ultimo ca�o
	} //fin metodo
	
	/**
	 * construye la ca�eria desde el ca�o de la <b>posicionCa�o</b> hasta el ca�o siguente que esta arriba
	 * @param pared contiene la matriz de ladrillos
	 * @param posicionCa�o contiene la posicion del ca�o desde donde se comienza a construir
	 * @param desplazamientoVertical contiene la cantidad de ca�os que iran verticalmente
	 * @param desplazamientoHorizontal contiene la cantidad de ca�os que iran horizontalmente
	 */
	private void hacerCaminoAlCa�oQueEstaArriba ( Material [][] pared ,Posicion posicionCa�o , int desplazamientoVertical , int desplazamientoHorizontal ){
		
		pared [ posicionCa�o.getFila() ][posicionCa�o.getColumna() + 1 ] = Material.CA�O_ABAJO_DERECHA;       //construyo tuber�a en la curva
		posicionCa�o.setColumna ( posicionCa�o.getColumna() + 1 );                    //guardo posicion ultimo ca�o
		
		this.hacerCaminoHaciaArriba(pared, posicionCa�o, desplazamientoVertical);        //hago camino hasta la proxima curva
		
		pared [ posicionCa�o.getFila() - 1 ][posicionCa�o.getColumna() ] = Material.CA�O_ARRIBA_IZQUIERDA;  //construyo tuber�a en la curva
		posicionCa�o.setFila(posicionCa�o.getFila() - 1);                                                 //guardo posicion ultimo ca�o
		
		this.hacerCaminoAlCa�oQueEstaEnfrente(pared, posicionCa�o, desplazamientoHorizontal);         //hago camino hasta el ca�o horizontal
		
	} //fin metodo
	
	
	/**
	 * construye la ca�eria desde el ca�o de la <b>posicionCa�o</b> hasta el ca�o siguente que esta en el mismo nivel
	 * @param pared contiene la matriz de ladrillos
	 * @param posicionCa�o contiene la posicion del ca�o desde donde se comienza a construir
	 * @param desplazamientoHorizontal contiene la cantidad de ca�os que iran horizontalmente
	 */
	private void hacerCaminoAlCa�oQueEstaEnfrente ( Material [][] pared , Posicion posicionCa�o , int desplazamientoHorizontal){
		
		for (int i = 1 ; i < desplazamientoHorizontal ; i++){
			pared[posicionCa�o.getFila()][posicionCa�o.getColumna()+ 1] = Material.CA�O_HORIZONTAL; 
			posicionCa�o.setColumna( posicionCa�o.getColumna() + 1 );                              //guardo posicion ultimo ca�o
		}
		
	} //fin metodo
	
	
	/**
	 * construye la ca�eria desde el ca�o de la <b>posicionCa�o</b> hasta el ca�o horizontal siguente que esta debajo
	 * @param pared contiene la matriz de ladrillos
	 * @param posicionCa�o contiene la posicion del ca�o desde donde se comienza a construir
	 * @param desplazamientoVertical contiene la cantidad de ca�os que iran verticalmente
	 * @param DesplazamientoHorizontal contiene la cantidad de ca�os que iran horizontalmente
	 */
	private void hacerCaminoAlCa�oQueEstaAbajo ( Material [][] pared , Posicion posicionCa�o , int desplazamientoVertical , int desplazamientoHorizontal){
		
		pared [ posicionCa�o.getFila() ][posicionCa�o.getColumna() + 1 ] = Material.CA�O_ARRIBA_DERECHA; //construyo tuber�a en la curva
		posicionCa�o.setColumna ( posicionCa�o.getColumna() + 1 );								//guardo posicion ultimo ca�o
		
		this.hacerCaminoHaciaAbajo(pared, posicionCa�o, desplazamientoVertical);               //hago tuberia hasta la proxima curva
		 
		pared [ posicionCa�o.getFila() + 1 ][posicionCa�o.getColumna() ] = Material.CA�O_ABAJO_IZQUIERDA;     //construyo tuber�a en la curva
		posicionCa�o.setFila ( posicionCa�o.getFila() + 1 );      								//guardo posicion ultimo ca�o
		
		this.hacerCaminoAlCa�oQueEstaEnfrente(pared, posicionCa�o, desplazamientoHorizontal);    //construyo tuber�a hasta el proximo ca�o horizontal
		
	}  //fin metodo
	
	
	/**
	 * //decide que camino construir dependiendo la posicion del ca�o horizontal mas cercano
	 * @param pared almacena la matriz pared
	 * @param posicionPrimerCa�o guarda posicion del ca�o horizontal desde donde se construye
	 * @param desplazamientoVertical indica si el ca�o horizontal a llegar esta arriba o abajo y la distancia vertical
	 * @param desplazamientoHorizontal indica a que distancia horizontal esta el ca�o horizontal a llegar con respecto al ca�o desde el cual se parte
	 */
	private void decidirCaminoAConstruir(Material[][] pared, Posicion posicionPrimerCa�o, int desplazamientoVertical,int desplazamientoHorizontal) {
		if ( desplazamientoVertical > 0 ){
			this.hacerCaminoAlCa�oQueEstaArriba( pared , posicionPrimerCa�o , desplazamientoVertical , desplazamientoHorizontal );
		} else{
			if ( desplazamientoVertical == 0 ){
				this.hacerCaminoAlCa�oQueEstaEnfrente( pared , posicionPrimerCa�o , desplazamientoHorizontal );
			} else {
				this.hacerCaminoAlCa�oQueEstaAbajo( pared , posicionPrimerCa�o , desplazamientoVertical , desplazamientoHorizontal );
			}
		}
	} //fin metodo
	
	
	/**
	 * construye la ca�eria dentro de la pared
	 * @pared contiene la matriz de ladrillos que conforman la pared
	 */
    @Override
    public Material [][] construirCa�eria(Material[][] pared) {
    	
    	Posicion posicionPrimerCa�o = new Posicion() ;
    	
    	posicionPrimerCa�o.setColumna ( -2 );
    	posicionPrimerCa�o.setFila (0);
    	
    	int desplazamientoVertical = 0;  //marcan distancia del primer ca�o al segundo ca�o en filas y columnas respectivamente
    	int desplazamientoHorizontal = 0 ;
    	
    	Posicion posicionSegundoCa�o = new Posicion () ;   
    	
    	posicionPrimerCa�o = this.buscarCa�oHorizontalEnPared( posicionPrimerCa�o , pared );
    	
    	while (  !(pared.length - 1 == posicionSegundoCa�o.getColumna ()) ){     //se termina cuando se llego al ultimo ca�o
    		
    		posicionSegundoCa�o = this.buscarCa�oHorizontalEnPared( posicionPrimerCa�o, pared );
    		
    		desplazamientoVertical = posicionPrimerCa�o.getFila() - posicionSegundoCa�o.getFila();   //calculo distancias entre ca�os
    		desplazamientoHorizontal = posicionSegundoCa�o.getColumna() - posicionPrimerCa�o.getColumna();
    		
    		//construyo tuberia hasta el ca�o horizontal siguiente (el que esta en posicionSegundoCa�o
    		
    		this.decidirCaminoAConstruir ( pared , posicionPrimerCa�o , desplazamientoVertical , desplazamientoHorizontal);
    		
    		posicionPrimerCa�o = posicionSegundoCa�o;
    	}//fin while
    	
        return pared;
    	
    } //fin metodo

}//fin clase