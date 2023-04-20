package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	ArbolBinario<Integer> a = new ArbolBinario<>();

	public ContadorArbol(ArbolBinario<Integer> a) {
		this.a = a;
	}

	public ListaEnlazadaGenerica<Integer> numerosParesInOrden(ArbolBinario<Integer> a,
			ListaEnlazadaGenerica<Integer> l) {

		if (!a.esVacio()) {
			if (a.tieneHijoIzquierdo())
				l = numerosParesInOrden(a.getHijoIzquierdo(), l);

			if (a.getDato() % 2 == 0)
				l.agregarFinal(a.getDato());

			if (a.tieneHijoDerecho())
				l = numerosParesInOrden(a.getHijoDerecho(), l);
		}
		return l;
	}

	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden(ArbolBinario<Integer> a,
			ListaEnlazadaGenerica<Integer> l) {

		if (!a.esVacio()) {
			if (a.tieneHijoIzquierdo())
				l = numerosParesInOrden(a.getHijoIzquierdo(), l);

			if (a.tieneHijoDerecho())
				l = numerosParesInOrden(a.getHijoDerecho(), l);

			if (a.getDato() % 2 == 0)
				l.agregarFinal(a.getDato());
		}
		return l;
	}

}
