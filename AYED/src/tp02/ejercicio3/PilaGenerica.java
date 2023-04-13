package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	ListaEnlazadaGenerica<T> l = new ListaEnlazadaGenerica<>();
	
	public void apilar(T elem) {
		l.agregarFinal(elem);
	}
	
	public T desapilar() {
		T e = l.elemento(l.tamanio());
		l.eliminar(e);
		return e;
	}
	
	public T tope() {
		return l.elemento(l.tamanio());
	}
	
	public boolean esVacia() {
		return l.esVacia();
	}
}
