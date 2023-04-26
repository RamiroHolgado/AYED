package tp04.ejercicio4;

import tp04.ejercicio1.ArbolGeneralCargado;

public class Main {

	public static void main(String[] args) {
		ArbolGeneralCargado a = new ArbolGeneralCargado();
		
		System.out.println(a.getArbol().altura());
		System.out.println(a.getArbol().nivel(14));
		System.out.println(a.getArbol().ancho());
	}

}

//						1
//
//		   2							3
//
//	 4		     5		6			   		7	   	
//
//10	11		12		13			 8	 9   14	  15