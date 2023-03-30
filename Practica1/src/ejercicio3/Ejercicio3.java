package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("a", "a", "1", "a@a", "direccion a");
		Estudiante e2 = new Estudiante("b", "b", "2", "b@b", "direccion b");
		
		Profesor p1 = new Profesor("p1", "p1", "p1@p1", "catedra 1", "facultad 1");
		Profesor p2 = new Profesor("p2", "p2", "p2@p2", "catedra 2", "facultad 2");
		Profesor p3 = new Profesor("p3", "p3", "p3@p3", "catedra 3", "facultad 3");
		
		Estudiante [] estudiantes = new Estudiante [2];
		Profesor [] profesores = new Profesor [3];
		
		estudiantes[0] = e1;
		estudiantes[1] = e2;
		
		profesores[0] = p1;
		profesores[1] = p2;
		profesores[2] = p3;
		
		System.out.println("ESTUDIANTES");
		for (int i = 0; i < estudiantes.length; i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		
		System.out.println("PROFESORES");
		for (int i = 0; i < profesores.length; i++) {
			System.out.println(profesores[i].tusDatos());
		}
	}

}
