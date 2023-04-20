package tp03.ejercicio1;

public class ArbolBinarioCargado {
	ArbolBinario<Integer> a1 = new ArbolBinario<Integer>(1);

	public ArbolBinarioCargado() {
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> a3 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> a4 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> a7 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> a8 = new ArbolBinario<Integer>(8);
		ArbolBinario<Integer> a9 = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> a10 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> a11 = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> a12 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> a13 = new ArbolBinario<Integer>(13);
		ArbolBinario<Integer> a14 = new ArbolBinario<Integer>(14);
		ArbolBinario<Integer> a15 = new ArbolBinario<Integer>(15);

		this.a1.agregarHijoIzquierdo(a2);
		this.a1.agregarHijoDerecho(a3);

		a2.agregarHijoIzquierdo(a4);
		a2.agregarHijoDerecho(a5);

		a3.agregarHijoIzquierdo(a6);
		a3.agregarHijoDerecho(a7);

		a4.agregarHijoIzquierdo(a8);
		a4.agregarHijoDerecho(a9);

		a5.agregarHijoIzquierdo(a10);
		a5.agregarHijoDerecho(a11);

		a6.agregarHijoIzquierdo(a12);
		a6.agregarHijoDerecho(a13);

		a7.agregarHijoIzquierdo(a14);
		a7.agregarHijoDerecho(a15);

	}

	public ArbolBinario<Integer> getArbol() {
		return a1;
	}

//					1
//					
//	  		2				3
//	  		
//	  4		   5       6       7
//	  
//	8	9	10	11	12	13	14	15

}
