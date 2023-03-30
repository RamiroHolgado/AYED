package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {

	public static void imprimirRecursivo(ListaDeEnterosConArreglos l) {
		if (!l.fin()) {
			int num = l.proximo();
			imprimirRecursivo(l);
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();

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
