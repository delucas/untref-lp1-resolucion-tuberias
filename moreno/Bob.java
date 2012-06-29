package ar.edu.untref.lp1.tp.plomeria;


public class Bob implements Plomero {
		
		private int posicionPrimerCañoFila;
		private int posicionSiguienteCañoFila;
		
		private int posicionPrimerCañoColumna;
		private int posicionSiguienteCañoColumna;
		
		@Override
		public void validarMatriz(Material [][] pared){
			
		}

		@Override
		public Material[][] construirCañeria(Material[][] pared){
		
			return pared;
			
		}
		
		@Override		
		public Material[][] construirCodos(Material[][] pared){
						
			/**{{CAÑO_HORIZONTAL,null,LADRILLO},
			*{LADRILLO,null,CAÑO_HORIZONTAL}
			*}
			*/
			

			for (int i = 0; i < pared.length; i++){
				if (pared[i][0] == Material.CAÑO_HORIZONTAL){
					posicionPrimerCañoFila = i;
					posicionPrimerCañoColumna = 0;
				}
				for (int j = posicionPrimerCañoColumna + 1; j < pared[i].length; j ++){
					if(pared[i][j] == Material.CAÑO_HORIZONTAL){
						posicionSiguienteCañoFila = i;
						posicionSiguienteCañoColumna = j;
						
					}
				}				
			}
			// tengo qe dividir en dos metodos los codos. el 1°metodo qe sea cuando el 1° horizontal esta mas arriba que el 2°
			// y el 2° metodo qe se active cuando el 1°horizontal esta mas abajo qe el 2°
			if(posicionPrimerCañoFila < posicionSiguienteCañoFila ){
				pared[posicionPrimerCañoFila][1] = Material.CAÑO_ABAJO_IZQUIERDA;
				
				for (int i = 1; i < pared.length; i++){
					for(int j = 1; j < pared[i].length; j++){
								
						if (pared[i][j] == Material.CAÑO_HORIZONTAL){				
							//ubica al ladrillo de la 1° columna						
							if(pared[i][j-posicionSiguienteCañoColumna] == Material.LADRILLO){
								//coloca el codo seguido del ladrillo qe ubicó antes
								pared[i][j-(posicionSiguienteCañoColumna - 1)] = Material.CAÑO_ARRIBA_DERECHA;
							
							}
							
						}		
					}
				}
				
			}
			//cuanto vale posicionPrimerCañoFila y posicionSiguienteCañoFila ???
			if(posicionPrimerCañoFila > posicionSiguienteCañoFila){	
				
				pared[posicionPrimerCañoFila][posicionPrimerCañoColumna + 1] = Material.CAÑO_ARRIBA_IZQUIERDA;	
				
				//no me sale con 4 codos
				pared[posicionSiguienteCañoFila][posicionPrimerCañoColumna + 1] = Material.CAÑO_ABAJO_DERECHA;									
						
			}			
			return pared;			
		}
}

