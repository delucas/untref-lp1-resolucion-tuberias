package ar.edu.untref.lp1.plomeria.grupofierrocatalinialonsomoringio;

public interface Plomeria {
	/**
     * pre : pared tiene:
     *          - un elemento Material.CAÑO_HORIZONTAL en la primer columna 
     *          - un elemento Material.CAÑO_HORIZONTAL en la última columna
     *          
     *       pared puede tener:
     *          - a lo sumo un elemento Material.CAÑO_HORIZONTAL por columna, 
     *            en columnas no contiguas.
     *          
     *       y en las posiciones restantes:    
     *          - elementos Material.LADRILLO
     *          
     * post: cambia pared para que tenga una cañería que conecte todos los caños preexistentes, 
     *       solo modificando aquellas posiciones en las que preexista un elemento Material.LADRILLO.
     * 
     * @param pared : arreglo regular, donde la primera dimesión corresponde 
     *                con el ancho y la segunda con alto. 
     *                
     */
    public void construirCanieria(Material[][] pared);
}
