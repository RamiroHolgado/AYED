package tp02.ejercicio1;

public class Ejercicio1_6 {

	public static ListaDeEnteros calcularSucesion(ListaDeEnteros l, int n) {
		l.agregarFinal(n);
		if (n != 1) {
			return (n % 2 == 0) ? calcularSucesion(l, (n / 2)) : calcularSucesion(l, (n * 3 + 1));
		}
		return l;
	}

	public static void main(String[] args) {

		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		ListaDeEnterosConArreglos lA = new ListaDeEnterosConArreglos();

		calcularSucesion(l, 6);
		calcularSucesion(lA, 6);

		
		System.out.println("ENLAZADA");
		l.comenzar();
		while (!l.fin()) {
			System.out.print(l.proximo() + " ");
		}
		System.out.println();
		System.out.println("ARREGLOS");
		l.comenzar();
		while(!l.fin()) {
			System.out.print(l.proximo() + " ");
		}
	}

}
