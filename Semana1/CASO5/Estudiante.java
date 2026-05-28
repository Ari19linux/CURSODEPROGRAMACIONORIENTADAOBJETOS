package ejercicios2;

public class Estudiante {
	
	private int nota;
	
	public void setNota(int n) {
		if (n >= 0 && n <= 20)
			nota = n;
		else
			System.out.println("Nota invalida.");
	}
	
	public int getNota( ) {
		return nota;
	}

}
