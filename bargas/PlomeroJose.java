package ar.edu.untref.lp1.plomeria.grupoN;

import ar.edu.untref.lp1.plomeria.Material;
import ar.edu.untref.lp1.plomeria.Plomero;

public class PlomeroJose implements Plomero {

	private Material[][] pared;

	@Override
	public void construirCañeria(Material[][] unaPared) {

		if (verificarColumnaInicial(unaPared) == false) {
			Error cañoColumnaInicial = new Error(
					"Falta caño de entrada en la primer columna");
			throw cañoColumnaInicial;
		}
		if (verificarColumnaFinal(unaPared) == false) {
			Error cañoColumnaFinal = new Error(
					"Falta caño de salida en la ultima columna");
			throw cañoColumnaFinal;
		}

		this.pared = new Material[unaPared.length][unaPared[0].length];
		for (int i = 0; i < this.pared.length; i++) {
			for (int j = 0; j < this.pared[0].length; j++) {
				this.pared[i][j] = unaPared[i][j];
			}
		}
		int[] fila;
		int[] columna;
		int lugarFila = 0;
		int lugarColumna = 0;
		
		fila = new int[contarCañosHorizontales(this.pared)];
		columna = new int[contarCañosHorizontales(this.pared)];
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.pared[i].length; j++) {
				for (int k = i; k < this.pared.length; k++) {
					if (this.pared[k][j] == Material.CAÑO_HORIZONTAL) {
						fila[lugarFila] = k;
						columna[lugarColumna] = j;
						lugarFila++;
						lugarColumna++;
					}
				}
			}
		}
		
		for (int i = 1; i < columna.length; i++) {
			if (columna[i] == columna[i - 1] + 1) {
				Error cañosContiguos = new Error("Los caños son contiguos");
				throw cañosContiguos;
			}	
			if (fila[i - 1] < fila[i]) {
				this.pared[fila[i - 1]][columna[i - 1] + 1] = Material.CAÑO_ABAJO_IZQUIERDA;

				for (int ladoV = fila[i - 1] + 1; ladoV < fila[i]; ladoV++) {
					this.pared[ladoV][columna[i - 1] + 1] = Material.CAÑO_VERTICAL;
				}
				this.pared[fila[i]][columna[i - 1] + 1] = Material.CAÑO_ARRIBA_DERECHA;

				for (int ladoH = columna[i - 1] + 2; ladoH < columna[i]; ladoH++) {
					this.pared[fila[i]][ladoH] = Material.CAÑO_HORIZONTAL;

				}
			}
			if (fila[i - 1] > fila[i]) {
				this.pared[fila[i - 1]][columna[i - 1] + 1] = Material.CAÑO_ARRIBA_IZQUIERDA;

				for (int ladoV = fila[i - 1] - 1; ladoV > fila[i]; ladoV--) {
					this.pared[ladoV][columna[i - 1] + 1] = Material.CAÑO_VERTICAL;
				}
				this.pared[fila[i]][columna[i - 1] + 1] = Material.CAÑO_ABAJO_DERECHA;

				for (int ladoH = columna[i - 1] + 2; ladoH < columna[i]; ladoH++) {
					this.pared[fila[i]][ladoH] = Material.CAÑO_HORIZONTAL;
				}
			}
			if (fila[i - 1] == fila[i]) {
				for (int ladoH = columna[i - 1] + 1; ladoH < columna[i]; ladoH++) {
					this.pared[fila[i - 1]][ladoH] = Material.CAÑO_HORIZONTAL;
				}
			}
		}

	}

	public Material[][] getPared() {
		return this.pared;
	}

	private boolean verificarColumnaInicial(Material[][] paredParaVerificar) {
		int cañoColumnaInicial = 0;
		for (int i = 0; i < paredParaVerificar.length; i++) {
			if (paredParaVerificar[i][0] == Material.CAÑO_HORIZONTAL) {
				cañoColumnaInicial++;
			}
		}
		if (cañoColumnaInicial == 1) {
			return true;
		}
		return false;
	}
	private boolean verificarColumnaFinal(Material[][] paredParaVerificar) {
		int cañoColumnaFinal = 0;
		for (int i = 0; i < paredParaVerificar.length; i++) {
			if (paredParaVerificar[i][paredParaVerificar[0].length - 1] == Material.CAÑO_HORIZONTAL) {
				cañoColumnaFinal++;
			}
		}
		if (cañoColumnaFinal == 1) {
			return true;
		}
		return false;
	}
	private int contarCañosHorizontales(Material[][] pared){
		int cantidad=0;
		for (int i = 0; i < this.pared.length; i++) {
			for (int j = 0; j < this.pared[i].length; j++) {
				if (this.pared[i][j] == Material.CAÑO_HORIZONTAL) {
					cantidad++;
				}
			}
		}
		return cantidad;				
	}
}
