package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinarioCargado;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArbolBinarioCargado ab = new ArbolBinarioCargado();
		ContadorArbol ca = new ContadorArbol(ab.getArbol());
		ListaEnlazadaGenerica<Integer> l = new ListaEnlazadaGenerica<>();
		ListaEnlazadaGenerica<Integer> l2 = new ListaEnlazadaGenerica<>();

		ca.numerosParesInOrden(ab.getArbol(), l);
		l.comenzar();
		while (!l.fin())
			System.out.print(l.proximo() + " ");

		System.out.println();

		ca.numerosParesPostOrden(ab.getArbol(), l2);
		l2.comenzar();
		while (!l2.fin())
			System.out.print(l2.proximo() + " ");

	}

}
