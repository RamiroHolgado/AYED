package ejercicio1;

public class Ejercicio1 {

	public static void imprimirConFor(int a, int b) {
		if (a < b) {
			for (int i = a + 1; i < b; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = b + 1; i < a; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void imprimirConWhile(int a, int b) {
		if (a < b) {
			int i = a + 1;
			while (i < b) {
				System.out.print(i + " ");
				i++;
			}
		} else {
			int i = b + 1;
			while (i < a) {				
				System.out.print(i + " ");
				i++;
			}
		}
		System.out.println();
	}

	public static void imprimirSinEstructura(int a, int b) {
		if (a < b && a != b) {
			System.out.print(a + 1 + " ");
			imprimirSinEstructura(a + 1, b);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("FOR: ");
		imprimirConFor(10, 5);
		System.out.print("WHILE: ");
		imprimirConWhile(5, 10);
		System.out.print("SIN ESTRUCTURA: ");
		imprimirSinEstructura(1, 5);
	}

}
