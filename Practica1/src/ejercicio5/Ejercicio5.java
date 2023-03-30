package ejercicio5;

public class Ejercicio5 {

	public static String calcularConReturn(int[] a) {
		double promedio = 0;
		int max = -1;
		int min = 9999;
		for (int i = 0; i < a.length; i++) {
			promedio += a[i];
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}

		return "NUMERO MAXIMO: " + max + ", NUMERO MINIMO: " + min + ", PROMEDIO: " + promedio / a.length;
	}

	public static void calcularConParametros(int[] a, Ejercicio5_MaxMinProm o) {
		int prom = 0;
		for (int i = 0; i < a.length; i++) {
			prom += a[i];
			if (a[i] > o.getMax()) {
				o.setMax(a[i]);
			}
			if (a[i] < o.getMin()) {
				o.setMin(a[i]);
			}
		}
		o.setProm(prom / a.length);
	}

	public static void calcular(int[] a) {
		int max = -1;
		int min = 9999;
		double prom = 0;
		for (int i = 0; i < a.length; i++) {
			prom += a[i];
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("NUMERO MAXIMO: " + max + ", NUMERO MINIMO: " + min + ", PROMEDIO: " + prom / a.length);
	}

	public static void main(String[] args) {
		int[] arreglo = new int[5];

		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (i + 1) * 10;
		}

		System.out.println("DEVOLVIENDO CON RETURN");
		System.out.println(calcularConReturn(arreglo));
		System.out.println();

		System.out.println("DEVOLVIENDO CON PARAMETROS");
		Ejercicio5_MaxMinProm obj = new Ejercicio5_MaxMinProm(-1, 9999, 0);
		calcularConParametros(arreglo, obj);
		System.out.println(
				"NUMERO MAXIMO: " + obj.getMax() + ", NUMERO MINIMO: " + obj.getMin() + ", PROMEDIO: " + obj.getProm());
		System.out.println();

		System.out.println("DEVOLVIENDO SIN PARAMETROS, Y SIN RETURN");
		calcular(arreglo);

	}

}
