
public class Luigi implements Plomero {

	public void construirCañeria(Material[][] pared) {
		Material[][] miPared = pared;
		
		for (int columna = 0; columna < miPared.length; columna++){
			for (int fila = 0; fila < miPared[columna].length; fila++){
				if (miPared[columna][fila] == Material.CAÑO_HORIZONTAL){
					for (int proximaColumna = columna+1; proximaColumna < miPared.length; proximaColumna++){
						for(int proximaFila = 0; proximaFila < miPared[proximaColumna].length; proximaFila++){
							if (miPared[proximaColumna][proximaFila] == Material.CAÑO_HORIZONTAL){
						
								if (fila == proximaFila){
									for (int diferenciaDeColumnas = 1; diferenciaDeColumnas < proximaColumna - columna; diferenciaDeColumnas++){
										miPared[columna+diferenciaDeColumnas][fila] = Material.CAÑO_HORIZONTAL;
									}
								}
								else if (proximaFila - fila > 0){
									miPared[columna+1][fila] = Material.CAÑO_ARRIBA_IZQUIERDA;
									miPared[columna+1][proximaFila] = Material.CAÑO_ABAJO_DERECHA;
									for (int diferenciaDeFilas = 1; diferenciaDeFilas < proximaFila - fila; diferenciaDeFilas++){
										miPared[columna+1][fila + diferenciaDeFilas] = Material.CAÑO_VERTICAL;
									}
									for (int diferenciaDeColumnas = 2; diferenciaDeColumnas < proximaColumna - columna; diferenciaDeColumnas++){
										miPared[columna+diferenciaDeColumnas][proximaFila] = Material.CAÑO_HORIZONTAL;
									}
								}
								else {
									miPared[columna+1][fila] = Material.CAÑO_ABAJO_IZQUIERDA;
									miPared[columna+1][proximaFila] = Material.CAÑO_ARRIBA_DERECHA;
									for (int diferenciaDeFilas = 1; diferenciaDeFilas < fila - proximaFila; diferenciaDeFilas++){
										miPared[columna+1][fila - diferenciaDeFilas] = Material.CAÑO_VERTICAL;
									}
									for (int diferenciaDeColumnas = 2; diferenciaDeColumnas < proximaColumna - columna; diferenciaDeColumnas++){
										miPared[columna+diferenciaDeColumnas][proximaFila] = Material.CAÑO_HORIZONTAL;
									}
								}
								
								columna = proximaColumna;
								fila = proximaFila;
								
							}
						}
					}
				}
			}
		}
		
	}

}
