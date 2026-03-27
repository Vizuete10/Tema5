package ejercicio02;

public class main {

	public static void main(String[] args) {
		
		Empleado E1 = new Empleado("Pedro");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Álvaro");
		Oficial OF1 = new Oficial("Sergio");
		Tecnico T1 = new Tecnico("Miguel");	
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}

}
