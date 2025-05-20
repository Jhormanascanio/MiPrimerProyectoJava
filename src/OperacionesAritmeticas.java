import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;
        
        System.out.println("\nResultados de las operaciones aritméticas:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (num2 != 0) {
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);
        } else {
            System.out.println("No se puede realizar división ni módulo por cero.");
        }
        scanner.close();
    }
}

