package tp04.ejercicio1;

public class ArbolGeneralCargado {
	ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(1);

	public ArbolGeneralCargado() {
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a9 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> a10 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> a11 = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> a12 = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> a13 = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> a14 = new ArbolGeneral<Integer>(14);
		ArbolGeneral<Integer> a15 = new ArbolGeneral<Integer>(15);

		a1.agregarHijo(a2);
		a1.agregarHijo(a3);

		a2.agregarHijo(a4);
		a2.agregarHijo(a5);
		a2.agregarHijo(a6);

		a3.agregarHijo(a7);

		a4.agregarHijo(a10);
		a4.agregarHijo(a11);

		a5.agregarHijo(a12);

		a6.agregarHijo(a13);

		a7.agregarHijo(a8);
		a7.agregarHijo(a9);
		a7.agregarHijo(a14);
		a7.agregarHijo(a15);

	}

	public ArbolGeneral<Integer> getArbol() {
		return a1;
	}

//							1
//	
//				2							3
//		
//	   4		5		6			   		7	   	
//	   
//	10	11		12		13			 8	 9   14	  15

}
