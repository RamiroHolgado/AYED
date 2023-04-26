package tp04.ejercicio1;

import tp02.ejercicio2.ListaGenerica;

public class ej4 {
	
	public static void agregarHijo(ArbolGeneral<Integer> a, ArbolGeneral<Integer> hijo) {
		
		
	}

	public static void main(String[] args) {
		ArbolGeneralCargado a = new ArbolGeneralCargado();
		ArbolGeneral<Integer> hijo = new ArbolGeneral<Integer>(100);
		
		ListaGenerica<ArbolGeneral<Integer>> l = a.getArbol().getHijos();
		l = l.proximo().getHijos();
		l = l.proximo().getHijos();
		l.proximo().agregarHijo(hijo);
		
		
		
		
		System.out.println(a.getArbol());
		System.out.println("ALTURA DEL ARBOL: " + a.getArbol().altura());

	}

}
