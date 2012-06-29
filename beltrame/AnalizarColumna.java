package ar.edu.untref.tp1.plomero;

public class AnalizarColumna {

	public String analizarPrimerYUltimaColumna(Material[][] pared) {

		int columnaFinal = 0;

		for (int i = 0; i < pared.length; i++) {

			for (int j = 0; j < pared.length; j++) {

				columnaFinal = pared[j].length - 1;

				if ((pared[i][0] == Material.CA�O_HORIZONTAL && pared[j][columnaFinal] == Material.CA�O_HORIZONTAL)) {

					return new String("Valido");
				}
			}
		}

		return new String("Invalido");
	}

	public String analizarColumna(Material[][] pared, int columna) {

		for (int i = 0; i < pared.length; i++) {

			for (int j = 0; j < pared.length; j++) {

				if (pared[i][columna] == Material.CA�O_HORIZONTAL) {

					return new String("Ca�o Horizontal");
				}

			}
		}
		return new String("Invalido");
	}

	public String analizarContiguos(Material[][] pared, int columna) {

		for (int i = 0; i < pared.length; i++) {

			for (int j = 0; j < pared.length; j++) {

				if (columna == 0) {

					columna = columna + 1;
				}

				else if (columna == pared[j].length - 1) {

					columna = columna - 1;
				}

				else if (pared[i][columna] == Material.CA�O_HORIZONTAL
						&& ((pared[j][columna + 1] == Material.CA�O_HORIZONTAL) || (pared[j][columna - 1] == Material.CA�O_HORIZONTAL))) {

					Error error = new Error("No puede haber ca�os contiguos");

					throw error;
				}

			}
		}

		return new String("Invalido");
	}

}
