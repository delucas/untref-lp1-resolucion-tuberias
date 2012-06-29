package ar.edu.untref.lp1.plomeria.grupoN;

import ar.edu.untref.lp1.plomeria.Material;
import ar.edu.untref.lp1.plomeria.Plomero;

public class PlomeroJose implements Plomero {

	private Material[][] pared;

	@Override
	public void construirCa�eria(Material[][] unaPared) {

		if (verificarColumnaInicial(unaPared) == false) {
			Error ca�oColumnaInicial = new Error(
					"Falta ca�o de entrada en la primer columna");
			throw ca�oColumnaInicial;
		}
		if (verificarColumnaFinal(unaPared) == false) {
			Error ca�oColumnaFinal = new Error(
					"Falta ca�o de salida en la ultima columna");
			throw ca�oColumnaFinal;
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
		
		fila = new int[contarCa�osHorizontales(this.pared)];
		columna = new int[contarCa�osHorizontales(this.pared)];
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.pared[i].length; j++) {
				for (int k = i; k < this.pared.length; k++) {
					if (this.pared[k][j] == Material.CA�O_HORIZONTAL) {
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
				Error ca�osContiguos = new Error("Los ca�os son contiguos");
				throw ca�osContiguos;
			}	
			if (fila[i - 1] < fila[i]) {
				this.pared[fila[i - 1]][columna[i - 1] + 1] = Material.CA�O_ABAJO_IZQUIERDA;

				for (int ladoV = fila[i - 1] + 1; ladoV < fila[i]; ladoV++) {
					this.pared[ladoV][columna[i - 1] + 1] = Material.CA�O_VERTICAL;
				}
				this.pared[fila[i]][columna[i - 1] + 1] = Material.CA�O_ARRIBA_DERECHA;

				for (int ladoH = columna[i - 1] + 2; ladoH < columna[i]; ladoH++) {
					this.pared[fila[i]][ladoH] = Material.CA�O_HORIZONTAL;

				}
			}
			if (fila[i - 1] > fila[i]) {
				this.pared[fila[i - 1]][columna[i - 1] + 1] = Material.CA�O_ARRIBA_IZQUIERDA;

				for (int ladoV = fila[i - 1] - 1; ladoV > fila[i]; ladoV--) {
					this.pared[ladoV][columna[i - 1] + 1] = Material.CA�O_VERTICAL;
				}
				this.pared[fila[i]][columna[i - 1] + 1] = Material.CA�O_ABAJO_DERECHA;

				for (int ladoH = columna[i - 1] + 2; ladoH < columna[i]; ladoH++) {
					this.pared[fila[i]][ladoH] = Material.CA�O_HORIZONTAL;
				}
			}
			if (fila[i - 1] == fila[i]) {
				for (int ladoH = columna[i - 1] + 1; ladoH < columna[i]; ladoH++) {
					this.pared[fila[i - 1]][ladoH] = Material.CA�O_HORIZONTAL;
				}
			}
		}

	}

	public Material[][] getPared() {
		return this.pared;
	}

	private boolean verificarColumnaInicial(Material[][] paredParaVerificar) {
		int ca�oColumnaInicial = 0;
		for (int i = 0; i < paredParaVerificar.length; i++) {
			if (paredParaVerificar[i][0] == Material.CA�O_HORIZONTAL) {
				ca�oColumnaInicial++;
			}
		}
		if (ca�oColumnaInicial == 1) {
			return true;
		}
		return false;
	}
	private boolean verificarColumnaFinal(Material[][] paredParaVerificar) {
		int ca�oColumnaFinal = 0;
		for (int i = 0; i < paredParaVerificar.length; i++) {
			if (paredParaVerificar[i][paredParaVerificar[0].length - 1] == Material.CA�O_HORIZONTAL) {
				ca�oColumnaFinal++;
			}
		}
		if (ca�oColumnaFinal == 1) {
			return true;
		}
		return false;
	}
	private int contarCa�osHorizontales(Material[][] pared){
		int cantidad=0;
		for (int i = 0; i < this.pared.length; i++) {
			for (int j = 0; j < this.pared[i].length; j++) {
				if (this.pared[i][j] == Material.CA�O_HORIZONTAL) {
					cantidad++;
				}
			}
		}
		return cantidad;				
	}
}
