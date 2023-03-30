package tp02.ejercicio2;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("e1", "e1", "1", "e1@e1", "dir 1");
		Estudiante e2 = new Estudiante("e2", "e2", "2", "e2@e2", "dir 2");
		Estudiante e3 = new Estudiante("e3", "e3", "3", "e3@e3", "dir 3");
		Estudiante e4 = new Estudiante("e4", "e4", "4", "e4@e4", "dir 4");

		ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();

		l.agregarFinal(e1);
		l.agregarFinal(e2);
		l.agregarFinal(e3);
		l.agregarFinal(e4);

		l.comenzar();
		while (!l.fin()) {
			System.out.println(l.proximo().tusDatos());
		}

		Estudiante e5 = new Estudiante("e5", "e5", "5", "e5@e5", "dir 5");
		Estudiante e6 = new Estudiante("e6", "e6", "6", "e6@e6", "dir 6");

		Estudiante[] arr = { e5, e6 };

		l.agregar(arr);

		l.comenzar();
		while (!l.fin()) {
			System.out.println(l.proximo().tusDatos());
		}
	}

}
