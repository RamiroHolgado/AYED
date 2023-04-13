package tp02.ejercicio4;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio3.PilaGenerica;

public class TestBalanceo {

	public static boolean esBalanceado(String s) {
		ListaEnlazadaGenerica<Character> i = new ListaEnlazadaGenerica<>();
		ListaEnlazadaGenerica<Character> f = new ListaEnlazadaGenerica<>();

		i.agregarFinal('(');
		f.agregarFinal(')');
		i.agregarFinal('[');
		f.agregarFinal(']');
		i.agregarFinal('{');
		f.agregarFinal('}');

		PilaGenerica<Character> p = new PilaGenerica<>();
		char act, elem;
		for (int j = 0; j < s.length(); j++) {
			act = s.charAt(j);

			if (i.incluye(act)) {
				p.apilar(act);
			} else {
				elem = p.desapilar();
				if (i.elemento(elem) != f.elemento(act)) {
					return false;
				}

			}
		}
		
		return p.esVacia();
	}

	public static void main(String[] args) {
		System.out.println(esBalanceado("{[}]"));

	}

}
