import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ListaEstudiantes {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<String> estudiantes = new ArrayList<>();

	        int opcion;

	        do {
	            System.out.println("\n===== MENU =====");
	            System.out.println("1. Agregar estudiante");
	            System.out.println("2. Mostrar lista de estudiantes");
	            System.out.println("3. Salir");
	            System.out.print("Ingrese una opción: ");

	            try {
	                opcion = sc.nextInt();
	                sc.nextLine(); 

	                switch (opcion) {

	                    case 1:
	                        System.out.print("Ingrese el nombre del estudiante: ");
	                        String nombre = sc.nextLine();

	                        if (nombre.trim().isEmpty()) {
	                            System.out.println("Error: El nombre no puede estar vacío.");
	                        } else {
	                            estudiantes.add(nombre);
	                            System.out.println("Estudiante agregado correctamente.");
	                        }
	                        break;

	                    case 2:
	                        System.out.println("\n===== LISTA DE ESTUDIANTES =====");

	                        if (estudiantes.isEmpty()) {
	                            System.out.println("No hay estudiantes registrados.");
	                        } else {
	                            for (int i = 0; i < estudiantes.size(); i++) {
	                                System.out.println((i + 1) + ". " + estudiantes.get(i));
	                            }
	                        }
	                        break;

	                    case 3:
	                        System.out.println("Programa finalizado.");
	                        break;

	                    default:
	                        System.out.println("Opción inválida. Intente nuevamente.");
	                }

	            } catch (InputMismatchException e) {
	                System.out.println("Error: Debe ingresar un número válido.");
	                sc.nextLine();
	                opcion = 0;
	            }

	        } while (opcion != 3);

	        sc.close();
	    }

}
