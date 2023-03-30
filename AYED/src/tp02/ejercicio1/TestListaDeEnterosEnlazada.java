package tp02.ejercicio1;

public class TestListaDeEnterosEnlazada {

	public static void imprimirRecursivo(ListaDeEnterosEnlazada l) {
		if (!l.fin()) {
			int num = l.proximo();
			imprimirRecursivo(l);
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();

		for (int i = 1; i <= 5; i++) {
			l.agregarFinal(i * 10);

		}

//		l.comenzar();
//		while (!l.fin()) {
//			System.out.println(l.proximo());
//
//		}

		l.comenzar();
		imprimirRecursivo(l);

	}

}
