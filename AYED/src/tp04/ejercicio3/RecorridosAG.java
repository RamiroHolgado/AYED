package tp04.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import tp04.ejercicio1.ArbolGeneralCargado;

public class RecorridosAG {

	public static ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n,
			ListaGenerica<Integer> l) {
		if (!a.esVacio()) {
			if (a.getDato() > n && a.getDato() % 2 != 0)
				l.agregarFinal(a.getDato());

			if (a.tieneHijos()) {
				a.getHijos().comenzar();

				while (!a.getHijos().fin())
					numerosImparesMayoresQuePreOrden(a.getHijos().proximo(), n, l);
			}
		}
		return l;

	}

	public static ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n,
			ListaGenerica<Integer> l) {
		if (!a.esVacio()) {
			if (a.tieneHijos()) {
				a.getHijos().comenzar();
				numerosImparesMayoresQuePreOrden(a.getHijos().proximo(), n, l);

				if (a.getDato() > n && a.getDato() % 2 != 0)
					l.agregarFinal(a.getDato());

				while (!a.getHijos().fin())
					numerosImparesMayoresQuePreOrden(a.getHijos().proximo(), n, l);
			} else if (a.getDato() > n && a.getDato() % 2 != 0)
				l.agregarFinal(a.getDato());
		}
		return l;

	}

	public static ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n,
			ListaGenerica<Integer> l) {
		if (!a.esVacio()) {
			if (a.tieneHijos()) {
				a.getHijos().comenzar();
				while (!a.getHijos().fin())
					numerosImparesMayoresQuePreOrden(a.getHijos().proximo(), n, l);

				if (a.getDato() > n && a.getDato() % 2 != 0)
					l.agregarFinal(a.getDato());
			} else if (a.getDato() > n && a.getDato() % 2 != 0)
				l.agregarFinal(a.getDato());
		}
		return l;

	}

	public static ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n,
			ListaGenerica<Integer> l) {
		if (!a.esVacio()) {
			ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<>();
			ArbolGeneral<Integer> arbol = null;
			cola.encolar(a);
			while (!cola.esVacia()) {
				arbol = cola.desencolar();

				if (arbol.getDato() % 2 != 0 && arbol.getDato() > n)
					l.agregarFinal(arbol.getDato());

				if (arbol.tieneHijos()) {
					arbol.getHijos().comenzar();
					while (!arbol.getHijos().fin())
						cola.encolar(arbol.getHijos().proximo());
				}
			}
		}

		return l;
	}

	public static void main(String[] args) {
		ArbolGeneralCargado a = new ArbolGeneralCargado();
		ListaGenerica<Integer> lPreOrden = new ListaEnlazadaGenerica<>();
		ListaGenerica<Integer> lInOrden = new ListaEnlazadaGenerica<>();
		ListaGenerica<Integer> lPostOrden = new ListaEnlazadaGenerica<>();
		ListaGenerica<Integer> lPorNiveles = new ListaEnlazadaGenerica<>();

		numerosImparesMayoresQuePreOrden(a.getArbol(), 40, lPreOrden);
		System.out.println("lista pre orden");
		lPreOrden.comenzar();
		while (!lPreOrden.fin())
			System.out.print(lPreOrden.proximo() + "	");

		System.out.println();

		numerosImparesMayoresQueInOrden(a.getArbol(), 40, lInOrden);
		System.out.println("lista in orden");
		lInOrden.comenzar();
		while (!lInOrden.fin())
			System.out.print(lInOrden.proximo() + "	");

		System.out.println();

		numerosImparesMayoresQuePostOrden(a.getArbol(), 40, lPostOrden);
		System.out.println("lista post orden");
		lPostOrden.comenzar();
		while (!lPostOrden.fin())
			System.out.print(lPostOrden.proximo() + "	");

		System.out.println();

		numerosImparesMayoresQuePorNiveles(a.getArbol(), 40, lPorNiveles);
		System.out.println("lista por niveles");
		lPorNiveles.comenzar();
		while (!lPorNiveles.fin())
			System.out.print(lPorNiveles.proximo() + "	");

	}

}

//							1
//
//				2							3
//
//		4		5		6			   		7	   	
//
//10	11		12		13			 8	 9   14	  15