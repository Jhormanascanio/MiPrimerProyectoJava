import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el sueldo de la persona (en dólares): ");
        double sueldo = scanner.nextDouble();
        
        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos.");
        } else {
            System.out.println("No debe abonar impuestos.");
        }
        scanner.close();
    }
}
