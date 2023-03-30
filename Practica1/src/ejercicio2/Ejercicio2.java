package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void generarArreglo(int n) {
		int [] a = new int [n+1];
		for (int i = 1; i <= n; i++) {
			a[i] = n * i;
			System.out.print(a[i] + " ");
		}
	}
	
	public static void generarArreglos() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresar numero para generar arreglo");
		int n = s.nextInt();
		while (n != 0) {
			System.out.println("Arreglo " + n);
			generarArreglo(n);
			System.out.println();
			System.out.println("Ingresar numero para generar arreglo");
			n = s.nextInt();
		}
		s.close();
	}

	public static void main(String[] args) {
		generarArreglos();

	}

}
