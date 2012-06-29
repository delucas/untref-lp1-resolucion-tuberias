package ar.edu.untref.tp1.plomeria.grupoN;

import ar.edu.untref.tp1.plomero.AnalizarColumna;
import ar.edu.untref.tp1.plomero.Material;
import ar.edu.untref.tp1.plomero.Plomero;

public class Ernesto implements Plomero {

	private AnalizarColumna analizar;

	@Override
	public void construirCañeria(Material[][] pared) {

		if (this.analizar.analizarPrimerYUltimaColumna(pared) == "Invalido") {

			throw new Error("Ernesto no puede comenzar la construccion");

		} else {

			ejecutarConstruccion(pared);
		}
	}

	public void ejecutarConstruccion(Material[][] pared) {

		for (int i = 0; i < pared.length; i++) {

			for (int j = 0; j < pared[i].length; j++) {

				int ultimaX = 0;

				while (j < pared.length - 2) {

					if (pared[i][j] == Material.CAÑO_HORIZONTAL) {

						if (this.analizar.analizarColumna(pared, j + 1) == "Invalido"
								&& this.analizar.analizarColumna(pared, j + 2) == "Invalido") {
							pared[i][j + 1] = Material.CAÑO_HORIZONTAL;

						}
						if (this.analizar.analizarColumna(pared, j + 1) == "Invalido"
								&& this.analizar.analizarColumna(pared, j + 2) == "Caño Horizontal") {

							if (pared[i][j + 2] == Material.CAÑO_HORIZONTAL) {
								pared[i][j + 1] = Material.CAÑO_HORIZONTAL;
								ultimaX = i;

							} else if (pared[i][j + 2] != Material.CAÑO_HORIZONTAL) {

								for (int k = 0; k < pared.length; k++) {

									if (pared[k][j + 2] == Material.CAÑO_HORIZONTAL) {
										int x = k;

										if (x < i) {
											pared[i][j + 1] = Material.CAÑO_ABAJO_IZQUIERDA;

											for (int l = i - 1; l > x; l--) {
												pared[l][j + 1] = Material.CAÑO_VERTICAL;
											}

											pared[x][j + 1] = Material.CAÑO_ARRIBA_DERECHA;
											ultimaX = x;

										} else if (x > i) {
											pared[i][j + 1] = Material.CAÑO_ARRIBA_IZQUIERDA;

											for (int l = i + 1; l < x; l++)
												pared[l][j + 1] = Material.CAÑO_VERTICAL;
										}
										pared[x][j + 1] = Material.CAÑO_ABAJO_DERECHA;
										ultimaX = x;
									}
								}
							}
						}
					}
				}

				for (int k = 0; k < pared.length; k++) {

					if (pared[k][pared.length - 1] == Material.CAÑO_HORIZONTAL) {

						if (k == ultimaX) {
							pared[k][pared.length - 2] = Material.CAÑO_HORIZONTAL;

						} else if (ultimaX < k) {
							pared[ultimaX][pared.length - 2] = Material.CAÑO_ABAJO_IZQUIERDA;

							for (int l = ultimaX - 1; l > k; l--) {
								pared[l][pared.length - 2] = Material.CAÑO_VERTICAL;
							}
							pared[k][pared.length - 2] = Material.CAÑO_ARRIBA_DERECHA;

						} else if (ultimaX > k) {
							pared[ultimaX][pared.length - 2] = Material.CAÑO_ARRIBA_IZQUIERDA;

							for (int l = ultimaX + 1; l < k; l++) {
								pared[l][pared.length - 2] = Material.CAÑO_VERTICAL;
							}
							pared[k][pared.length - 2] = Material.CAÑO_ABAJO_DERECHA;
						}
					}
				}
			}
		}
	}
}
