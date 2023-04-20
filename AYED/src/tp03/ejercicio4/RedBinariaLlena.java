package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;
import tp03.ejercicio1.ArbolBinarioCargado;

public class RedBinariaLlena {

	public static int retardoReenvio(ArbolBinario<Integer> a) {
		if (!a.esVacio()) {
			if (!a.esHoja()) {
				int hi = retardoReenvio(a.getHijoIzquierdo());
				int hd = retardoReenvio(a.getHijoDerecho());
				int max = Math.max(hi, hd);

				return a.getDato() + max;
			}
			return a.getDato();
		}
		return -1;
	}

	public static void main(String[] args) {
		ArbolBinarioCargado a = new ArbolBinarioCargado();

		System.out.println(retardoReenvio(a.getArbol()));

	}

}
