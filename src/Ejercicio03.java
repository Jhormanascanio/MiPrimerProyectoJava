import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = scanner.nextInt();
                if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                System.out.println("El número tiene un solo dígito.");
            } else {
                System.out.println("El número tiene dos dígitos.");
            }
        } else {
            System.out.println("El número ingresado no está en el rango válido (1..99).");
        }
        
    }
}