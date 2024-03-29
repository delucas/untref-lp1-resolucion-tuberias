package ar.edu.untref.lp1.tp.plomeria;


public class Bob implements Plomero {
		
		private int posicionPrimerCaņoFila;
		private int posicionSiguienteCaņoFila;
		
		private int posicionPrimerCaņoColumna;
		private int posicionSiguienteCaņoColumna;
		
		@Override
		public void validarMatriz(Material [][] pared){
			
		}

		@Override
		public Material[][] construirCaņeria(Material[][] pared){
		
			return pared;
			
		}
		
		@Override		
		public Material[][] construirCodos(Material[][] pared){
						
			/**{{CAŅO_HORIZONTAL,null,LADRILLO},
			*{LADRILLO,null,CAŅO_HORIZONTAL}
			*}
			*/
			

			for (int i = 0; i < pared.length; i++){
				if (pared[i][0] == Material.CAŅO_HORIZONTAL){
					posicionPrimerCaņoFila = i;
					posicionPrimerCaņoColumna = 0;
				}
				for (int j = posicionPrimerCaņoColumna + 1; j < pared[i].length; j ++){
					if(pared[i][j] == Material.CAŅO_HORIZONTAL){
						posicionSiguienteCaņoFila = i;
						posicionSiguienteCaņoColumna = j;
						
					}
				}				
			}
			// tengo qe dividir en dos metodos los codos. el 1°metodo qe sea cuando el 1° horizontal esta mas arriba que el 2°
			// y el 2° metodo qe se active cuando el 1°horizontal esta mas abajo qe el 2°
			if(posicionPrimerCaņoFila < posicionSiguienteCaņoFila ){
				pared[posicionPrimerCaņoFila][1] = Material.CAŅO_ABAJO_IZQUIERDA;
				
				for (int i = 1; i < pared.length; i++){
					for(int j = 1; j < pared[i].length; j++){
								
						if (pared[i][j] == Material.CAŅO_HORIZONTAL){				
							//ubica al ladrillo de la 1° columna						
							if(pared[i][j-posicionSiguienteCaņoColumna] == Material.LADRILLO){
								//coloca el codo seguido del ladrillo qe ubicó antes
								pared[i][j-(posicionSiguienteCaņoColumna - 1)] = Material.CAŅO_ARRIBA_DERECHA;
							
							}
							
						}		
					}
				}
				
			}
			//cuanto vale posicionPrimerCaņoFila y posicionSiguienteCaņoFila ???
			if(posicionPrimerCaņoFila > posicionSiguienteCaņoFila){	
				
				pared[posicionPrimerCaņoFila][posicionPrimerCaņoColumna + 1] = Material.CAŅO_ARRIBA_IZQUIERDA;	
				
				//no me sale con 4 codos
				pared[posicionSiguienteCaņoFila][posicionPrimerCaņoColumna + 1] = Material.CAŅO_ABAJO_DERECHA;									
						
			}			
			return pared;			
		}
}

