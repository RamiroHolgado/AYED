package tp03.ejercicio1;

import tp02.ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;

	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}

	public int contarHojas() {
		int hojas = 0;

		if (!this.esHoja()) {
			if (this.tieneHijoDerecho())
				hojas += this.getHijoDerecho().contarHojas();
			if (this.tieneHijoIzquierdo())
				hojas += this.getHijoIzquierdo().contarHojas();
		} else
			return 1;

		return hojas;
	}

	public ArbolBinario<T> espejo() {
		ArbolBinario<T> aux = null;
		if (!this.esHoja()) {

			if (this.tieneHijoDerecho())
				this.getHijoDerecho().espejo();

			if (this.tieneHijoIzquierdo())
				this.getHijoIzquierdo().espejo();

			aux = this.getHijoIzquierdo();
			this.agregarHijoIzquierdo(this.getHijoDerecho());
			this.agregarHijoDerecho(aux);

		}
		return this;
	}

	public int altura() {
		int alto = -1;
		if (this.esHoja())
			return 0;
		else {
			if (this.tieneHijoIzquierdo())
				alto = Math.max(alto, this.getHijoIzquierdo().altura());
			if (this.tieneHijoDerecho())
				alto = Math.max(alto, this.getHijoDerecho().altura());
		}
		return alto + 1;
	}

	public void entreNiveles(int n, int m) {
		if ((n < m) && (n >= 0) && (m <= this.altura())) {
			int nivel = 0;
			ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
			ArbolBinario<T> arbol = null;

			cola.encolar(this);
			cola.encolar(null);
			while (!cola.esVacia()) {
				arbol = cola.desencolar();
				if (arbol != null) {
					if (arbol.tieneHijoIzquierdo())
						cola.encolar(arbol.getHijoIzquierdo());
					if ((nivel >= n) && (nivel <= m))
						System.out.print(arbol.getDato() + " ");
					if (arbol.tieneHijoDerecho())
						cola.encolar(arbol.getHijoDerecho());

				} else if (!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
					System.out.println();
				}
			}
		}

	}

	public void enOrden() {
		if (this.tieneHijoIzquierdo())
			this.getHijoIzquierdo().enOrden();
		System.out.print(this.getDato() + " ");
		if (this.tieneHijoDerecho())
			this.getHijoDerecho().enOrden();
	}

}
