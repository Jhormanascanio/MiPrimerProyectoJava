import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = scanner.nextInt(); 
        if (numero1>numero2) {
            System.out.println( "Si el primer numero es mayor");
        }else if (numero2>numero1) {
            System.out.println(" numero 2 es mayor");

            
        }else{
System.out.println("son iguales");

        }           
        }




    }