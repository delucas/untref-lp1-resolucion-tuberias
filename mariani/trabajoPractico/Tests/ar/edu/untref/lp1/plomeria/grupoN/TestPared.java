package ar.edu.untref.lp1.plomeria.grupoN;
import ar.edu.untref.lp1.plomeria.*;

import org.junit.Assert;
import org.junit.Test;

public class TestPared {
	@Test
	public void ConstruirParedCorrectamente1(){
		Material[][] paredOriginal = {  {Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO,         Material.LADRILLO, Material.LADRILLO, Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO},
									    {Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO,         Material.LADRILLO, Material.LADRILLO, Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO,         Material.LADRILLO, Material.LADRILLO, Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO},
										{Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO,         Material.LADRILLO, Material.LADRILLO, Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO,         Material.LADRILLO, Material.LADRILLO, Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO,        Material.LADRILLO, Material.CAÑO_HORIZONTAL,  Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO,         Material.LADRILLO, Material.LADRILLO, Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO,        Material.LADRILLO, Material.LADRILLO,         Material.LADRILLO, Material.LADRILLO, Material.LADRILLO,        Material.LADRILLO, Material.CAÑO_HORIZONTAL}
		};

		Material[][] paredEsperada = {  {Material.LADRILLO,         Material.LADRILLO,             Material.LADRILLO,               Material.LADRILLO,        Material.LADRILLO,        Material.LADRILLO, 		  Material.LADRILLO, 			 Material.LADRILLO},
										{Material.LADRILLO,         Material.LADRILLO,             Material.LADRILLO,               Material.LADRILLO,        Material.LADRILLO,        Material.LADRILLO, 		  Material.LADRILLO,			 Material.LADRILLO},
										{Material.LADRILLO,         Material.LADRILLO,             Material.LADRILLO,               Material.LADRILLO,        Material.LADRILLO, 	    Material.LADRILLO, 		  Material.LADRILLO, 			 Material.LADRILLO},
										{Material.CAÑO_HORIZONTAL,  Material.CAÑO_ARRIBA_DERECHA,  Material.LADRILLO,               Material.LADRILLO,        Material.LADRILLO, 	    Material.LADRILLO, 		  Material.LADRILLO, 			 Material.LADRILLO},
										{Material.LADRILLO,         Material.CAÑO_VERTICAL,        Material.LADRILLO,               Material.LADRILLO,        Material.LADRILLO, 	    Material.LADRILLO, 		  Material.LADRILLO, 			 Material.LADRILLO},
										{Material.LADRILLO,         Material.CAÑO_ABAJO_IZQUIERDA, Material.CAÑO_HORIZONTAL,        Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL, Material.CAÑO_ARRIBA_DERECHA,  Material.LADRILLO},
										{Material.LADRILLO,         Material.LADRILLO,             Material.LADRILLO,               Material.LADRILLO,        Material.LADRILLO, 		Material.LADRILLO, 		  Material.CAÑO_VERTICAL,		 Material.LADRILLO},
										{Material.LADRILLO,         Material.LADRILLO,             Material.LADRILLO,               Material.LADRILLO,        Material.LADRILLO, 		Material.LADRILLO, 		  Material.CAÑO_ABAJO_IZQUIERDA, Material.CAÑO_HORIZONTAL}
		};
		
		ConstructorTuberias m = new ConstructorTuberias();
		Assert.assertArrayEquals( paredEsperada, m.construirCañeria(paredOriginal) );
		
	}//fin test
	
	@Test
	public void ConstruirParedCorrectamente2(){
		Material [][] paredOriginal = { {Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
			 							{Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.CAÑO_HORIZONTAL},
										{Material.LADRILLO,		    Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
										{Material.CAÑO_HORIZONTAL,  Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO},
										{Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO, Material.LADRILLO}
		};

		Material [][] paredEsperada = { {Material.LADRILLO, 	   Material.LADRILLO, 			   Material.LADRILLO, 		  Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO},
									 	{Material.LADRILLO, 	   Material.LADRILLO, 			   Material.LADRILLO, 		  Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO},
										{Material.LADRILLO, 	   Material.CAÑO_ARRIBA_IZQUIERDA, Material.CAÑO_HORIZONTAL,  Material.CAÑO_HORIZONTAL,   Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL},
										{Material.LADRILLO, 	   Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		  Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO},
										{Material.LADRILLO, 	   Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		  Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO},
										{Material.LADRILLO, 	   Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		  Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO},
										{Material.CAÑO_HORIZONTAL, Material.CAÑO_ABAJO_DERECHA,    Material.LADRILLO, 		  Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO},
										{Material.LADRILLO, 	   Material.LADRILLO, 		       Material.LADRILLO, 		  Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO, 		  Material.LADRILLO, 		Material.LADRILLO}
		};
		
		ConstructorTuberias n = new ConstructorTuberias();
		Assert.assertArrayEquals(paredEsperada, n.construirCañeria(paredOriginal));
		
	}//fin test
	
	@Test
	public void ConstruirParedCorrectamente3(){
		Material [][] paredOriginal = { {Material.LADRILLO, 	   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
			 							{Material.LADRILLO, 	   Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
			 							{Material.LADRILLO,		   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
			 							{Material.LADRILLO, 	   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
			 							{Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
			 							{Material.LADRILLO, 	   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO,  		Material.LADRILLO, Material.LADRILLO},
			 							{Material.LADRILLO,	   	   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
			 							{Material.LADRILLO, 	   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 	    Material.LADRILLO, Material.CAÑO_HORIZONTAL}
		};


		Material [][] paredEsperada = { {Material.LADRILLO, 	   Material.LADRILLO, 				Material.LADRILLO, 		  Material.LADRILLO, 			 Material.LADRILLO, 		 Material.LADRILLO, 			Material.LADRILLO, 		  Material.LADRILLO},
							   			{Material.LADRILLO, 	   Material.CAÑO_ARRIBA_IZQUIERDA, 	Material.CAÑO_HORIZONTAL, Material.CAÑO_ARRIBA_DERECHA,  Material.LADRILLO, 		 Material.LADRILLO, 			Material.LADRILLO, 		  Material.LADRILLO},
							   			{Material.LADRILLO,		   Material.CAÑO_VERTICAL, 			Material.LADRILLO, 		  Material.CAÑO_VERTICAL, 		 Material.LADRILLO, 		 Material.LADRILLO, 			Material.LADRILLO, 		  Material.LADRILLO},
							   			{Material.LADRILLO, 	   Material.CAÑO_VERTICAL,			Material.LADRILLO, 		  Material.CAÑO_VERTICAL, 		 Material.LADRILLO, 		 Material.LADRILLO, 			Material.LADRILLO, 		  Material.LADRILLO},
							   			{Material.CAÑO_HORIZONTAL, Material.CAÑO_ABAJO_DERECHA, 	Material.LADRILLO, 		  Material.CAÑO_ABAJO_IZQUIERDA, Material.CAÑO_HORIZONTAL,   Material.CAÑO_ARRIBA_DERECHA, 	Material.LADRILLO, 		  Material.LADRILLO},
							   			{Material.LADRILLO, 	   Material.LADRILLO, 				Material.LADRILLO, 		  Material.LADRILLO, 		     Material.LADRILLO, 		 Material.CAÑO_VERTICAL,  		Material.LADRILLO, 		  Material.LADRILLO},
							   			{Material.LADRILLO,	   	   Material.LADRILLO, 				Material.LADRILLO, 		  Material.LADRILLO, 			 Material.LADRILLO, 		 Material.CAÑO_VERTICAL, 		Material.LADRILLO, 		  Material.LADRILLO},
							   			{Material.LADRILLO, 	   Material.LADRILLO, 				Material.LADRILLO, 		  Material.LADRILLO, 			 Material.LADRILLO, 		 Material.CAÑO_ABAJO_IZQUIERDA, Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL}
		};

		ConstructorTuberias f = new ConstructorTuberias();
		Assert.assertArrayEquals(paredEsperada, f.construirCañeria(paredOriginal));
		
	} //fin test
	
	
	@Test
	public void construirParedCorrectamente4 (){
		
		Material [][] paredOriginal = 		{ {Material.LADRILLO, 	       Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.CAÑO_HORIZONTAL},
											  {Material.LADRILLO, 	       Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
											  {Material.LADRILLO,		   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
											  {Material.LADRILLO, 	       Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
											  {Material.LADRILLO,  		   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.CAÑO_HORIZONTAL, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
											  {Material.LADRILLO, 	       Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO,  		Material.LADRILLO, Material.LADRILLO},
											  {Material.LADRILLO,	   	   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO},
											  {Material.CAÑO_HORIZONTAL,   Material.LADRILLO, Material.LADRILLO, 		Material.LADRILLO, Material.LADRILLO, 		 Material.LADRILLO, 	    Material.LADRILLO, Material.LADRILLO}
		};
		
		Material [][] paredEsperada = { {Material.LADRILLO, 	       Material.CAÑO_ARRIBA_IZQUIERDA, Material.CAÑO_HORIZONTAL, Material.CAÑO_ARRIBA_DERECHA, Material.LADRILLO, 		 Material.CAÑO_ARRIBA_IZQUIERDA, Material.CAÑO_HORIZONTAL, Material.CAÑO_HORIZONTAL},
				  						{Material.LADRILLO, 	       Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		 Material.CAÑO_VERTICAL, 	   Material.LADRILLO, 		 Material.CAÑO_VERTICAL, 		 Material.LADRILLO, 	   Material.LADRILLO},
				  						{Material.LADRILLO,		  	   Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		 Material.CAÑO_VERTICAL, 	   Material.LADRILLO, 		 Material.CAÑO_VERTICAL, 		 Material.LADRILLO, 	   Material.LADRILLO},
				  						{Material.LADRILLO, 	       Material.CAÑO_VERTICAL,	       Material.LADRILLO, 		 Material.CAÑO_VERTICAL, 	   Material.LADRILLO, 		 Material.CAÑO_VERTICAL, 		 Material.LADRILLO, 	   Material.LADRILLO},
				  						{Material.LADRILLO,  		   Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		 Material.CAÑO_ABAJO_IZQUIERDA,Material.CAÑO_HORIZONTAL, Material.CAÑO_ABAJO_DERECHA, 	 Material.LADRILLO,		   Material.LADRILLO},
				  						{Material.LADRILLO, 	       Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		 Material.LADRILLO, 		   Material.LADRILLO, 		 Material.LADRILLO,  			 Material.LADRILLO, 	   Material.LADRILLO},
				  						{Material.LADRILLO,	   	   	   Material.CAÑO_VERTICAL, 		   Material.LADRILLO, 		 Material.LADRILLO, 		   Material.LADRILLO, 		 Material.LADRILLO, 			 Material.LADRILLO, 	   Material.LADRILLO},
				  						{Material.CAÑO_HORIZONTAL,     Material.CAÑO_ABAJO_DERECHA,    Material.LADRILLO, 		 Material.LADRILLO, 		   Material.LADRILLO, 		 Material.LADRILLO, 	    	 Material.LADRILLO, 	   Material.LADRILLO}
		};
		
		ConstructorTuberias f = new ConstructorTuberias();
		Assert.assertArrayEquals(paredEsperada, f.construirCañeria(paredOriginal));
		
	}//fin test

}// fin clase