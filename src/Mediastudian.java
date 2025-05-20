import java.util.Scanner;
public class Mediastudian {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa un numero entero");
        int numero2 = scanner.nextInt();
        System.out.print("Ingresa un numero entero");
        int numero3 = scanner.nextInt();
        int suma = (numero1 + numero2 + numero3);
        float promedio = suma /3;


        System.out.println("el promedio es :" + promedio);
        scanner.close();

    }
}
