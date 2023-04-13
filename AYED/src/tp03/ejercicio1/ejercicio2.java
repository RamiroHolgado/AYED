package tp03.ejercicio1;

public class ejercicio2 {

	public static void main(String[] args) {
		ArbolBinarioCargado ab = new ArbolBinarioCargado();

		System.out.println("hojas: " + ab.getArbol().contarHojas());
		ab.getArbol().entreNiveles(0, 2);

		System.out.println("arbol ordenado");
		ab.getArbol().enOrden();

		System.out.println();

		System.out.println("arbol espejo");
		ab.getArbol().espejo().enOrden();
	}

}
