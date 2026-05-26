import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA BÁSICA ===");
        
        // 1. Lectura de datos
        System.out.print("Ingrese el primer número: ");
        double num1 = teclado.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = teclado.nextDouble();
        
        // 2. Menú de opciones
        System.out.println("\nSeleccione una operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();
        
        // 3. Estructura condicional para evaluar la opción
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;
            case 4:
                // Validar la división por cero
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + dividir(num1, num2));
                }
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
        
        teclado.close();
    }

    // --- MÉTODOS PARA LAS OPERACIONES ---
    
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
