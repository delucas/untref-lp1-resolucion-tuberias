package ar.edu.untref.lp1.plomeria.grupofierrocatalinialonsomoringio;


public class Tito implements Plomeria {
	
	private Material[][] pared;
	
	
	public Tito() {
		Material[][] pared = new Material[7][7];
		/*Debe tomarse a los int X e Y del ciclo 
		 * "for" con el mismo concepto de una funcion, osea X 
		 * para las abcisas y las Y para las ordenadas. 
		 * Y
		 * 6[][][][][][][]
		 * 5[][][][][][][]
		 * 4[][][][][][][]
		 * 3[][][][][][][]
		 * 2[][][][][][][]
		 * 1[][][][][][][]
		 * 0[][][][][][][]
		 *  0 1 2 3 4 5 6 X
		*/
		for (int x=0 ; x < getPared().length ;x++){
			for(int y=0; y < getPared()[x].length ; y++){
				this.setMaterial(Material.LADRILLO,x,y);
			}
		}
		this.setMaterial(Material.CANIO_HORIZONTAL,0,4);
		this.setMaterial(Material.CANIO_HORIZONTAL,2,0);
		this.setMaterial(Material.CANIO_HORIZONTAL,4,5);
		this.setMaterial(Material.CANIO_HORIZONTAL,6,6);
	}

	
	
	@Override
    public void construirCanieria(Material[][] pared){
		if (pared == null){
			Error errorDePared1 = new Error("El metodo debe aplicarse sobre una pared, por favor inserte un array de materiales en los parametros, Have a nice day");
			throw errorDePared1;
		}else if (pared != null){
		
		
		this.setMaterial(Material.CANIO_ABAJO_IZQUIERDA, 1, 4);
		for(int i=1; i<4 ;i++){
			this.setMaterial(Material.CANIO_VERTICAL, 1, i);
		}
		this.setMaterial(Material.CANIO_ARRIBA_DERECHA, 1, 0);
		this.setMaterial(Material.CANIO_ARRIBA_IZQUIERDA, 3, 0);
		for(int i=1; i<5 ;i++){
			this.setMaterial(Material.CANIO_VERTICAL, 3, i);
		}
		this.setMaterial(Material.CANIO_ABAJO_DERECHA, 3, 5);
		this.setMaterial(Material.CANIO_ARRIBA_IZQUIERDA, 5, 5);
		this.setMaterial(Material.CANIO_ABAJO_DERECHA, 5, 6);
		}
    }

	public Material[][] getPared(){
		return this.pared;
	}

	public Material getMaterial(int x,int y){
		if(  x > 6   || y > 6  ){
		Error errorDeParametroExcesivo = new Error ("Los valores exceden lo permitido por el Array");	
		throw errorDeParametroExcesivo;
		}else if (x < 0 ||  y < 0){
			Error errorDeParametroNecesario = new Error ("Los parametros deben ser mayor o igual a ero");	
			throw errorDeParametroNecesario;
		}
		
		return pared[x][y];
	}
	
	
	public void setMaterial(Material elMaterial,int x,int y){
		if (pared == null){
			Error errorDePared2 = new Error("Donde lo vas a pegar?¿, en el aire hermano?, pasame una pared por favor");
			throw errorDePared2;
		}
		
		else if ( x > 6 || x < 0 || y > 6 || y < 0){
			Error errorDePared3 = new Error("No es un lugar valido, por favor vuelva a ver los parametros");
			throw errorDePared3;
		}
		else{
		 pared[x][y] = elMaterial;
		}
	}
}

