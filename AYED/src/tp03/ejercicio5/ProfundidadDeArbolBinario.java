package tp03.ejercicio5;

import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;
import tp03.ejercicio1.ArbolBinarioCargado;

public class ProfundidadDeArbolBinario {

	public static int sumaElementosProfundidad(int p, ArbolBinario<Integer> a) {
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<>();
		ArbolBinario<Integer> arbol = new ArbolBinario<>();
		int nivel = 0, suma = 0;

		cola.encolar(a);
		cola.encolar(null);
		while (!cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol != null) {
				System.out.println("Nivel " + nivel);
				if (nivel == p) {
					suma += arbol.getDato();
					System.out.println("Dato " + arbol.getDato());
				}
				if (nivel < p) {
					if (arbol.tieneHijoIzquierdo())
						cola.encolar(arbol.getHijoIzquierdo());
					if (arbol.tieneHijoDerecho())
						cola.encolar(arbol.getHijoDerecho());
				}
			} else if (!cola.esVacia()) {
				nivel++;
				cola.encolar(null);
			}

		}
		return suma;
	}

	public static void main(String[] args) {
		ArbolBinarioCargado a = new ArbolBinarioCargado();

		System.out.println(sumaElementosProfundidad(2, a.getArbol()));

	}

}
