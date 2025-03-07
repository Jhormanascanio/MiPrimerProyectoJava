import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Hola, " + "jhorman" + ". Tienes " + 18 + " años y mides " + 1.70 + " metros.");
    }
}


