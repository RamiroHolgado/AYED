package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ColaGenerica<T> {
	ListaEnlazadaGenerica<T> l = new ListaEnlazadaGenerica<>();

	public ColaGenerica() {

	}

	public void encolar(T elem) {
		l.agregarFinal(elem);
	}
	
	public T desencolar() {
		T e = l.elemento(1);
		l.eliminarEn(1);
		return e;
	}
	
	public T tope() {
		return l.elemento(1);
	}
	
	public boolean esVacia() {
		return l.esVacia();
	}
	
}
