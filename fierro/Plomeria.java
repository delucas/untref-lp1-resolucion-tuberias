package ar.edu.untref.lp1.plomeria.grupofierrocatalinialonsomoringio;

public interface Plomeria {
	/**
     * pre : pared tiene:
     *          - un elemento Material.CA�O_HORIZONTAL en la primer columna 
     *          - un elemento Material.CA�O_HORIZONTAL en la �ltima columna
     *          
     *       pared puede tener:
     *          - a lo sumo un elemento Material.CA�O_HORIZONTAL por columna, 
     *            en columnas no contiguas.
     *          
     *       y en las posiciones restantes:    
     *          - elementos Material.LADRILLO
     *          
     * post: cambia pared para que tenga una ca�er�a que conecte todos los ca�os preexistentes, 
     *       solo modificando aquellas posiciones en las que preexista un elemento Material.LADRILLO.
     * 
     * @param pared : arreglo regular, donde la primera dimesi�n corresponde 
     *                con el ancho y la segunda con alto. 
     *                
     */
    public void construirCanieria(Material[][] pared);
}
