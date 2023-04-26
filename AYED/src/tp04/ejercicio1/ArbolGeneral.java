package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}

	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}

	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo))
				hijos.eliminar(hijo);
		}
	}

	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}

	public Integer altura() {
		int altura = 0;
		if (this.esHoja()) {
			return 0;
		} else {
			ListaGenerica<ArbolGeneral<T>> l = this.getHijos();
			l.comenzar();
			while (!l.fin()) {
				altura = 1 + l.proximo().altura();
			}
		}

		return altura;
	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<>();
		ArbolGeneral<T> act = null;
		cola.encolar(this);
		cola.encolar(null);

		int nivel = 0;
		while (!cola.esVacia()) {
			act = cola.desencolar();
			if (act != null) {
				if (act.getDato().equals(dato))
					return nivel;
				if (act.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = act.getHijos();
					hijos.comenzar();
					while (!hijos.fin())
						cola.encolar(hijos.proximo());
				}
			} else if (!cola.esVacia()) {
				cola.encolar(null);
				nivel++;
			}
		}

		return -1;
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<>();
		ArbolGeneral<T> aux = null;

		cola.encolar(this);
		cola.encolar(null);

		int max = 0, act = 0;

		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) {
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
						act++;
					}
				}
			} else if (!cola.esVacia()) {
				max = Math.max(max, act);
				act = 0;
				cola.encolar(null);
			}

		}

		return max;
	}

}