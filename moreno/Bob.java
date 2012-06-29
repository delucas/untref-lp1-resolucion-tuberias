package ar.edu.untref.lp1.tp.plomeria;


public class Bob implements Plomero {
		
		private int posicionPrimerCa�oFila;
		private int posicionSiguienteCa�oFila;
		
		private int posicionPrimerCa�oColumna;
		private int posicionSiguienteCa�oColumna;
		
		@Override
		public void validarMatriz(Material [][] pared){
			
		}

		@Override
		public Material[][] construirCa�eria(Material[][] pared){
		
			return pared;
			
		}
		
		@Override		
		public Material[][] construirCodos(Material[][] pared){
						
			/**{{CA�O_HORIZONTAL,null,LADRILLO},
			*{LADRILLO,null,CA�O_HORIZONTAL}
			*}
			*/
			

			for (int i = 0; i < pared.length; i++){
				if (pared[i][0] == Material.CA�O_HORIZONTAL){
					posicionPrimerCa�oFila = i;
					posicionPrimerCa�oColumna = 0;
				}
				for (int j = posicionPrimerCa�oColumna + 1; j < pared[i].length; j ++){
					if(pared[i][j] == Material.CA�O_HORIZONTAL){
						posicionSiguienteCa�oFila = i;
						posicionSiguienteCa�oColumna = j;
						
					}
				}				
			}
			// tengo qe dividir en dos metodos los codos. el 1�metodo qe sea cuando el 1� horizontal esta mas arriba que el 2�
			// y el 2� metodo qe se active cuando el 1�horizontal esta mas abajo qe el 2�
			if(posicionPrimerCa�oFila < posicionSiguienteCa�oFila ){
				pared[posicionPrimerCa�oFila][1] = Material.CA�O_ABAJO_IZQUIERDA;
				
				for (int i = 1; i < pared.length; i++){
					for(int j = 1; j < pared[i].length; j++){
								
						if (pared[i][j] == Material.CA�O_HORIZONTAL){				
							//ubica al ladrillo de la 1� columna						
							if(pared[i][j-posicionSiguienteCa�oColumna] == Material.LADRILLO){
								//coloca el codo seguido del ladrillo qe ubic� antes
								pared[i][j-(posicionSiguienteCa�oColumna - 1)] = Material.CA�O_ARRIBA_DERECHA;
							
							}
							
						}		
					}
				}
				
			}
			//cuanto vale posicionPrimerCa�oFila y posicionSiguienteCa�oFila ???
			if(posicionPrimerCa�oFila > posicionSiguienteCa�oFila){	
				
				pared[posicionPrimerCa�oFila][posicionPrimerCa�oColumna + 1] = Material.CA�O_ARRIBA_IZQUIERDA;	
				
				//no me sale con 4 codos
				pared[posicionSiguienteCa�oFila][posicionPrimerCa�oColumna + 1] = Material.CA�O_ABAJO_DERECHA;									
						
			}			
			return pared;			
		}
}

